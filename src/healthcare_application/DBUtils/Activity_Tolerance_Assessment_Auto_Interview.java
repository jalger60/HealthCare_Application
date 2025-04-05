/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare_application.DBUtils;






import javax.swing.JOptionPane;

public class Activity_Tolerance_Assessment_Auto_Interview {
    
   public static void conductInterview(int patientID) {
    // Define questions for the interview
    DecisionNode[] questions = new DecisionNode[] {
        new DecisionNode("Did you have more trouble with the activity of 'eating' as compared to yesterday?"),
        new DecisionNode("Did you have more trouble with the activity of 'drinking' as compared to yesterday?"),
        new DecisionNode("Did you have more trouble with the activity of 'getting dressed' as compared to yesterday?"),
        new DecisionNode("Did you have more trouble with the activity of 'walking around the house' as compared to yesterday?"),
        new DecisionNode("Did you have more trouble with the activity of 'climbing stairs' as compared to yesterday?")
    };

    // Initialize activity status and variables
    boolean eating = false, drinking = false, gettingDressed = false, walking = false, stairs = false;
   
    Integer stairsClimbed = null; // Allow null

    for (int i = 0; i < questions.length; i++) {
        int response = JOptionPane.showConfirmDialog(null, questions[i].question, "Activity Tolerance Interview", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.NO_OPTION) {
            if (i == 4) { // If user says "No" to climbing stairs, ask sub-question
                stairsClimbed = getStairsClimbed();
            }
            continue;
        }

        // If answered "Yes", record the activity and get severity
        if (i == 0) eating = true;
        else if (i == 1) drinking = true;
        else if (i == 2) gettingDressed = true;
        else if (i == 3) walking = true;
        else if (i == 4) stairs = true;
        
        // If the user said "Yes" to climbing stairs, ask for the number of stairs they can climb
        if (i == 4 && response == JOptionPane.YES_OPTION) {
            stairsClimbed = getStairsClimbed();  // Prompt for the number of stairs
        }

      
        

        break; // Exit loop after first "Yes"
    }

    

    // Insert into database
    Activity_Tolerance_Assessment_DBOperations.insertActivityToleranceRecord(
        patientID, eating, drinking, gettingDressed, walking, stairs, stairsClimbed
    );

    // Show message to user
    String message = "Interview recorded successfully!";
    if (stairsClimbed != null) {
        message += "\nStairs Climbed at One Time: " + stairsClimbed;
    }
    JOptionPane.showMessageDialog(null, message);
}

    // Updated method to get the number of stairs climbed (nullable)
    private static Integer getStairsClimbed() {
    while (true) {
        String input = JOptionPane.showInputDialog("How many stairs are you able to climb at one time?");
        
        if (input == null) {
            JOptionPane.showMessageDialog(null, "Stairs input skipped.");
            return null; // Exit the loop and return null to indicate no input
        }

        try {
            int stairs = Integer.parseInt(input);
            if (stairs >= 0) {
                return stairs;  // Return the valid stairs number
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a positive number.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.");
        }
    }
}


    // Inner class for DecisionNode
    private static class DecisionNode {
        public String question;

        public DecisionNode(String question) {
            this.question = question;
        }
    }




}



