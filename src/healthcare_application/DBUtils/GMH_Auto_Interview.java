package healthcare_application.DBUtils;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import healthcare_application.Validation.GMH_Auto_Interview_Validation;

public class GMH_Auto_Interview {

  private static class QuestionNode {
        String question;
        QuestionNode yesNode;
        QuestionNode noNode;
        Runnable onYes;
        Runnable onNo;

        QuestionNode(String question) {
            this.question = question;
        }
    }

    private static Map<String, String> answers = new HashMap<>();

    public static void start(int patientID) {
        QuestionNode root = buildInterviewTree();
        runInterview(root);

        

        // Collect values
        String tobacco = answers.get("Tobacco");
        String tobaccoQuantity = answers.get("Tobacco Quantity");
        String tobaccoDuration = answers.get("Tobacco Duraton");

        String alcohol = answers.get("Alcohol");
        String alcoholQuantity = answers.get("Alcohol Quantity");
        String alcoholDuration = answers.get("Alcohol Duration");

        String drugType = answers.get("DrugType");
        String drugDuration = answers.get("Drug Duration");
        String drug = (drugType != null && !drugType.trim().isEmpty()) ? "Yes" : "No";

        String bloodType = answers.get("BloodType");
        String rh = answers.get("Rh");

        // Call stored procedure
        GMH_DBOperations.insertGeneralMedicalHistory(
            patientID,
            tobacco,
            tobaccoQuantity,
            tobaccoDuration,
            alcohol,
            alcoholQuantity,
            alcoholDuration,
            drug,
            drugType,
            drugDuration,
            bloodType,
            rh
        );

        // Optional display
        StringBuilder result = new StringBuilder("Interview Results:\n");
        for (Map.Entry<String, String> entry : answers.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        JOptionPane.showMessageDialog(null, result.toString(), "Results", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "General medical history successfully saved!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void runInterview(QuestionNode node) {
        while (node != null) {
            int response = JOptionPane.showConfirmDialog(null, node.question, "Medical Interview", JOptionPane.YES_NO_OPTION);

            switch (response) {
                case JOptionPane.YES_OPTION:
                    if (node.onYes != null) node.onYes.run();
                    node = node.yesNode;
                    break;
                case JOptionPane.NO_OPTION:
                    if (node.onNo != null) node.onNo.run();
                    node = node.noNode;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Interview canceled.");
                    System.exit(0);
            }
        }
    }

    private static QuestionNode buildInterviewTree() {
        // Same tree-building logic as before...

        // Blood Type
        QuestionNode bloodQ = new QuestionNode("Do you know your blood type?");
        bloodQ.onYes = () -> {
            String bloodType = null;
            boolean isValid = false;

            while (!isValid) {
                bloodType = JOptionPane.showInputDialog("Enter Blood Type (A, B, AB, O):");

                try {
                    bloodType = GMH_Auto_Interview_Validation.validateBloodType(bloodType);
                    isValid = true; // Exit loop if valid
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            String rh = null;
            boolean isValidRh = false;

            while (!isValidRh) {
                rh = JOptionPane.showInputDialog("Enter Rh factor (+ or -):");

                try {
                    rh = GMH_Auto_Interview_Validation.validateRhFactor(rh);
                    isValidRh = true; // Exit loop if valid
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            answers.put("BloodType", bloodType);
            answers.put("Rh", rh);
        };
        bloodQ.onNo = () -> {
            answers.put("BloodType", "Unknown");
            answers.put("Rh", "Unknown");
        };

        
        QuestionNode drugQ = new QuestionNode("Do you use recreational drugs?");
        drugQ.onYes = () -> {
             // Drug Use
            String duration =  JOptionPane.showInputDialog("How long have you used drugs?");
            String drugLength  = JOptionPane.showInputDialog("Enter drug use duration:");
            answers.put("Drug Duration", duration);
            answers.put("Drug Length", drugLength);
        };
        drugQ.onNo = () -> {
            answers.put("Drug Duration", null);
            answers.put("Drug Length", null);
        };    

        QuestionNode drugType = new QuestionNode("What type of drug do you use?");
        drugType.onYes = () -> {
            String type = JOptionPane.showInputDialog("Enter type of drug used:");
            answers.put("DrugType", type);
        };
        
        
        QuestionNode alcoholQ = new QuestionNode("Do you consume alcohol?");
        alcoholQ.onYes = () -> {
            String alcoholQty = JOptionPane.showInputDialog("How much alcohol do you consume?");
            String alcoholDuration = JOptionPane.showInputDialog("How long have you consumed alcohol?");
            answers.put("Alcohol", "Yes");
            answers.put("Alcohol Quantity", alcoholQty);
            answers.put("Alcohol Duration", alcoholDuration);
        };
        alcoholQ.onNo = () -> {
            answers.put("Alcohol", "No");
            answers.put("Alcohol Quantity", null);
            answers.put("Alcohol Duration", null);
        };
        
        QuestionNode tobaccoQ = new QuestionNode("Do you use tobacco?");
        tobaccoQ.onYes = () -> {
            String tobaccoQty = JOptionPane.showInputDialog("How much tobacco do you use?");
            String tobaccoDuration = JOptionPane.showInputDialog("How long have you used tobacco?");
            answers.put("Tobacco", "Yes");
            answers.put("Tobacco Quantity", tobaccoQty);
            answers.put("Tobacco Duraton", tobaccoDuration);
        };
        tobaccoQ.onNo = () -> {
            answers.put("Tobacco", "No");
            answers.put("Tobacco Quantity", null);
            answers.put("Tobacco Duraton", null);
        };
        
        // --- LINKING THE QUESTIONS IN ORDER ---

        bloodQ.yesNode = drugQ;
        bloodQ.noNode = drugQ;

        drugQ.yesNode = drugType;
        drugQ.noNode = alcoholQ;

        drugType.yesNode = alcoholQ;
        drugType.noNode = alcoholQ;

        alcoholQ.yesNode = tobaccoQ;
        alcoholQ.noNode = tobaccoQ;

        tobaccoQ.yesNode = null;
        tobaccoQ.noNode = null;

        // Start the tree with the first question
        return bloodQ;

    }
 
}


