
package healthcare_application.DBUtils;


import javax.swing.*;

   
public class Shortness_of_Breath_Auto_Interview {
    
    public static void conductInterview(int patientID) {
        // Create the decision tree Node root, q2
        DecisionNode root, q2;

        // Build the decision tree
        root = new DecisionNode("Did you have any shortness of breath today?");
        q2 = new DecisionNode("Is it noticeably more short than yesterday?");
        
        root.yesBranch = q2;
        root.noBranch = null; // No further questions if NO
        q2.yesBranch = null;
        q2.noBranch = null;

        boolean shortnessOfBreath = false;
        String severityLevel = null;
        boolean moreShortThanYesterday = false;

        DecisionNode currentNode = root;

        // Conduct the interview based on the decision tree
        while (currentNode != null) {
            int response = JOptionPane.showConfirmDialog(null, currentNode.question, "Shortness of Breath Interview", JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.YES_OPTION) {
                if (currentNode == root) { // Q1: Shortness of Breath
                    shortnessOfBreath = true;
                    boolean valid = false;
                    int severity = 0;
                    
                    // Validate severity input between 1 and 5
                    while (!valid) {
                        try {
                            String severityInput = JOptionPane.showInputDialog("On a scale of 1-5, how severe is it?");
                            if (severityInput == null) {
                                JOptionPane.showMessageDialog(null, "Severity input canceled.");
                                return; // Exit interview early if canceled
                            }

                            severity = Integer.parseInt(severityInput);

                            if (severity >= 1 && severity <= 5) {
                                valid = true;
                            } else {
                                JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 5.");
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value between 1 and 5.");
                        }
                    }
                       
               
                    if (severity >= 1 && severity <= 3) {
                        severityLevel = "Mild";
                    } else if (severity == 4) {
                        severityLevel = "More Severe";
                    } else if (severity == 5) {
                        severityLevel = "Very Severe";
                    }
                } else if (currentNode == root.yesBranch) { // Q3: More than yesterday
                    moreShortThanYesterday = true;
                }
                currentNode = currentNode.yesBranch;
            } else {
               
                currentNode = currentNode.noBranch;
            }
        }

        // Call insertRecord from DBOperations class to insert interview data into the database
        Shortness_Of_Breath_DBOperations.insertRecord(patientID, shortnessOfBreath, severityLevel, moreShortThanYesterday);
        JOptionPane.showMessageDialog(null, "Interview recorded successfully!");
    }

    // DecisionNode class to represent each question in the decision tree
    private static class DecisionNode {
        String question;
        DecisionNode yesBranch;
        DecisionNode noBranch;

        public DecisionNode(String question) {
            this.question = question;
        }
    }
    
   

    
    
    
}
