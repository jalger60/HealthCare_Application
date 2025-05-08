/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare_application.DBUtils;

import healthcare_application.Family_History;
import General_Functionality.LoggerUtility;
import javax.swing.JOptionPane;
/**
 *
 * @author jaked
 */
public class Family_History_Automated_Interview {
    private static class QuestionNode{
        String question;
        Runnable onYes;
        Runnable onNo;
        QuestionNode yesNode;
        QuestionNode noNode;
        
        QuestionNode(String q){
            question = q;
            onYes = () -> {};
            onNo = () -> {};
        }
    }
    
    public static void start(Family_History form){
        LoggerUtility.logTemplate("Started Family History Interview", form.getPName());
        QuestionNode root = buildInterviewTree(form);
        runInterview(root, form.getPName());
        
        int patientID = form.getPatientID();
        String name = form.getNameBox().getText().trim();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No data entered. Record not saved.");
            return;
        }
        String relation = form.getRelationBox().getText().trim();
        int alive = form.getAliveBox().isSelected() ? 1 : 0;
        int lwp = form.getLWPbox().isSelected() ? 1 : 0;
        String majorDisorder = form.getMDisorderBox().getText().trim();
        String specificDisorder = form.getSDisorderBox().getText().trim();
        int hrf = form.getHRFbox().isSelected() ? 1 : 0;
        int deleted = 0;  
        
        Family_History_DBOperations fhDBO = new Family_History_DBOperations();
        
                
        fhDBO.addFHRecord(
            patientID, name, relation, alive, lwp, majorDisorder, specificDisorder, hrf, deleted
        );
        
        LoggerUtility.logTemplate("Completed family history interview", form.getName());
    }
    
    public static void runInterview(QuestionNode node, String PName){
        while (node != null){
            int response = JOptionPane.showConfirmDialog(
                null,
                node.question,
                "Family History Interview",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );
            
            switch(response){
                case JOptionPane.YES_OPTION:
                    LoggerUtility.logTemplate("Q: " + node.question + "| A: Yes", PName);
                    node.onYes.run();
                    node = node.yesNode;
                    break;
                case JOptionPane.NO_OPTION:
                    LoggerUtility.logTemplate("Q: " + node.question + " | A: No", PName);
                    node.onNo.run();
                    node = node.noNode;
                    break;
                default:
                    LoggerUtility.logTemplate("Interview cancelled", PName);
                    JOptionPane.showMessageDialog(null, "Interview cancelled");
                    return;
            }
        }
    }
    
    private static QuestionNode buildInterviewTree(Family_History form){
        QuestionNode end = null;
        
        QuestionNode hrfQ = new QuestionNode("Is the disorder high risk for the family?");
        hrfQ.onYes = ()-> form.getHRFbox().setSelected(true);
        hrfQ.onNo = ()-> form.getHRFbox().setSelected(false);
        hrfQ.yesNode = end;
        hrfQ.noNode = end;
        
        QuestionNode specificDisorderQ = new QuestionNode("Is there a specific type of disorder?");
          specificDisorderQ.onYes = () -> {
            String input = JOptionPane.showInputDialog("What is the specific disorder?");
            form.getSDisorderBox().setText(input != null ? input.trim() : "");
        };
        specificDisorderQ.onNo = () -> form.getSDisorderBox().setText("None");
        specificDisorderQ.yesNode = hrfQ;
        specificDisorderQ.noNode = hrfQ;

        QuestionNode majorDisorderQ = new QuestionNode("Does this person have a major disorder?");
        majorDisorderQ.onYes = () -> {
            String input = JOptionPane.showInputDialog("What is the major disorder?");
            form.getMDisorderBox().setText(input != null ? input.trim() : "");
        };
        majorDisorderQ.onNo = () -> form.getMDisorderBox().setText("None");
        majorDisorderQ.yesNode = specificDisorderQ;
        majorDisorderQ.noNode = specificDisorderQ;

        QuestionNode livesWithQ = new QuestionNode("Does this person live with the patient?");
        livesWithQ.onYes = () -> form.getLWPbox().setSelected(true);
        livesWithQ.onNo = () -> form.getLWPbox().setSelected(false);
        livesWithQ.yesNode = majorDisorderQ;
        livesWithQ.noNode = majorDisorderQ;

        QuestionNode aliveQ = new QuestionNode("Is this person alive?");
        aliveQ.onYes = () -> form.getAliveBox().setSelected(true);
        aliveQ.onNo = () -> form.getAliveBox().setSelected(false);
        aliveQ.yesNode = livesWithQ;
        aliveQ.noNode = livesWithQ;

        QuestionNode relationQ = new QuestionNode("Do you want to specify this person's relation?");
        relationQ.onYes = () -> {
            String input = JOptionPane.showInputDialog("Enter the relation:");
            form.getRelationBox().setText(input != null ? input.trim() : "");
        };
        relationQ.onNo = () -> form.getRelationBox().setText("Unknown");
        relationQ.yesNode = aliveQ;
        relationQ.noNode = aliveQ;

        QuestionNode nameQ = new QuestionNode("Do you want to enter a family member?");
        nameQ.onYes = () -> {
            String input = JOptionPane.showInputDialog("What is their name?");
            form.getNameBox().setText(input != null ? input.trim() : "");
        };
        nameQ.onNo = () -> JOptionPane.showMessageDialog(null, "Interview skipped.");
        nameQ.yesNode = relationQ;
        nameQ.noNode = null;
        
        return nameQ;
    }
}
