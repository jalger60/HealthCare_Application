package healthcare_application.DBUtils;

import General_Functionality.LoggerUtility;
import javax.swing.JOptionPane;

public class Activity_Tolerance_Assessment_Auto_Interview {
    
    private static boolean eating = false;
    private static boolean drinking = false;
    private static boolean gettingDressed = false;
    private static boolean walking = false;
    private static boolean stairs = false;
    
    public static void conductInterview(int patientID, String PName) {
        // Define the root of the binary decision tree
        LoggerUtility.logTemplate("Activity Tolerance Interview Started", PName);
        DecisionNode root = buildDecisionTree();
        
        Integer stairsClimbed = null;  // Allow null for skipped input

        DecisionNode currentNode = root;
        while (currentNode != null) {
            int response = JOptionPane.showConfirmDialog(null, currentNode.getQuestion(), "Activity Tolerance Interview", JOptionPane.YES_NO_OPTION);
            String loggedResponse = (response == JOptionPane.YES_OPTION) ? "Yes" : "No";
            LoggerUtility.logTemplate("Q: " + currentNode.getQuestion() + " | A: " + loggedResponse, PName);
            
            if (response == JOptionPane.NO_OPTION && currentNode.getYesChild() != null) {
                currentNode = currentNode.getYesChild(); // Move to the next question if "No"
                continue;
            }

            if (response == JOptionPane.YES_OPTION) {
                if (currentNode.getQuestion().equals("Did you have more trouble with the activity of 'climbing stairs' as compared to yesterday?")) {
                    stairsClimbed = getStairsClimbed(PName);  // Prompt for stairs if relevant
                }

                // Record activity if "Yes" is selected
                if (currentNode.getQuestion().equals("Did you have more trouble with the activity of 'eating' as compared to yesterday?")) {
                    eating = true;
                } else if (currentNode.getQuestion().equals("Did you have more trouble with the activity of 'drinking' as compared to yesterday?")) {
                    drinking = true;
                } else if (currentNode.getQuestion().equals("Did you have more trouble with the activity of 'getting dressed' as compared to yesterday?")) {
                    gettingDressed = true;
                } else if (currentNode.getQuestion().equals("Did you have more trouble with the activity of 'walking around the house' as compared to yesterday?")) {
                    walking = true;
                } else if (currentNode.getQuestion().equals("Did you have more trouble with the activity of 'climbing stairs' as compared to yesterday?")) {
                    stairs = true;
                }

                // Exit loop after first "Yes"
                break;
            }
            currentNode = currentNode.getNoChild(); // Move to the next question if "No"
        }

        // Insert into the database
        Activity_Tolerance_Assessment_DBOperations.insertActivityToleranceRecord(
            patientID, eating, drinking, gettingDressed, walking, stairs, stairsClimbed
        );

        // Show success message to user
        LoggerUtility.logTemplate("Activity Tolerance Interview Completed.", PName);
        String message = "Interview recorded successfully!";
        if (stairsClimbed != null) {
            message += "\nStairs Climbed at One Time: " + stairsClimbed;
        }
        JOptionPane.showMessageDialog(null, message);
    }

    // Updated method to get the number of stairs climbed (nullable)
    private static Integer getStairsClimbed(String PName) {
        while (true) {
            String input = JOptionPane.showInputDialog("How many stairs are you able to climb at one time?");
            if (input == null) {
                LoggerUtility.logTemplate("Stairs Skipped by User", PName);
                JOptionPane.showMessageDialog(null, "Stairs input skipped.");
                return null; // Exit the loop and return null to indicate no input
            }

            try {
                int stairs = Integer.parseInt(input);
                if (stairs >= 0) {
                    LoggerUtility.logTemplate("User Climbed: " + stairs, PName);
                    return stairs;  // Return the valid stairs number
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a positive number.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.");
            }
        }
    }

    // Inner class for DecisionNode (Binary Tree)
    private static class DecisionNode {
        private String question;
        private DecisionNode yesChild;
        private DecisionNode noChild;

        public DecisionNode(String question) {
            this.question = question;
        }

        public String getQuestion() {
            return question;
        }

        public DecisionNode getYesChild() {
            return yesChild;
        }

        public void setYesChild(DecisionNode yesChild) {
            this.yesChild = yesChild;
        }

        public DecisionNode getNoChild() {
            return noChild;
        }

        public void setNoChild(DecisionNode noChild) {
            this.noChild = noChild;
        }
    }

    // Build the decision tree (binary decision structure)
    private static DecisionNode buildDecisionTree() {
        // Create decision nodes for each question
        DecisionNode root = new DecisionNode("Did you have more trouble with the activity of 'eating' as compared to yesterday?");
        DecisionNode drinkingNode = new DecisionNode("Did you have more trouble with the activity of 'drinking' as compared to yesterday?");
        DecisionNode gettingDressedNode = new DecisionNode("Did you have more trouble with the activity of 'getting dressed' as compared to yesterday?");
        DecisionNode walkingNode = new DecisionNode("Did you have more trouble with the activity of 'walking around the house' as compared to yesterday?");
        DecisionNode stairsNode = new DecisionNode("Did you have more trouble with the activity of 'climbing stairs' as compared to yesterday?");

        // Setting up tree structure
        root.setYesChild(drinkingNode);
        drinkingNode.setYesChild(gettingDressedNode);
        gettingDressedNode.setYesChild(walkingNode);
        walkingNode.setYesChild(stairsNode);

        // Set all "No" branches as null for simplicity (they can be expanded if needed)
        root.setNoChild(null);
        drinkingNode.setNoChild(null);
        gettingDressedNode.setNoChild(null);
        walkingNode.setNoChild(null);
        stairsNode.setNoChild(null);

        return root; // Return the root of the tree
    }
}
