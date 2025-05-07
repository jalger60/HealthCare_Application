package healthcare_application.DBUtils;

import General_Functionality.LoggerUtility;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class GMH_Auto_Interview {

    // --- QuestionNode Class (Keep as is) ---
    private static class QuestionNode {
        String question;
        QuestionNode yesNode;
        QuestionNode noNode;
        Runnable onYes; // Action to run BEFORE moving to yesNode
        Runnable onNo;  // Action to run BEFORE moving to noNode

        QuestionNode(String question) {
            this.question = question;
            // Default actions do nothing
            this.onYes = () -> {};
            this.onNo = () -> {};
        }
    }

    // --- Answers Map (Keep as is) ---
    private static Map<String, String> answers = new HashMap<>();

    // --- start Method (Keep mostly as is, just ensure keys match) ---
    public static void start(int patientID, String PName) {
        //Log that user has started the interview
        LoggerUtility.logTemplate("User started the General Medical History Interview", PName);
        
        // Reset answers for a new interview
        answers.clear();

        QuestionNode root = buildInterviewTree(PName);
        runInterview(root, PName);

        // --- Collect values (Ensure keys match those used in buildInterviewTree) ---
        String tobacco = answers.getOrDefault("Tobacco", "No"); // Default to No if not set
        String tobaccoQuantity = answers.get("Tobacco Quantity");
        String tobaccoDuration = answers.get("Tobacco Duration"); // Corrected key typo

        String alcohol = answers.getOrDefault("Alcohol", "No"); // Default to No
        String alcoholQuantity = answers.get("Alcohol Quantity");
        String alcoholDuration = answers.get("Alcohol Duration");

        String drugType = answers.get("DrugType");
        String drugDuration = answers.get("Drug Duration");
        // Determine 'drug' based on whether drugType was provided (or another indicator if needed)
        String drug = (drugType != null && !drugType.trim().isEmpty()) ? "Yes" : answers.getOrDefault("Drug Use", "No");

        String bloodType = answers.get("BloodType");
        String rh = answers.get("Rh");

        // --- Call stored procedure (Keep as is) ---
        // Ensure GMH_DBOperations is correctly implemented and accessible
         try {
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
             JOptionPane.showMessageDialog(null, "General medical history successfully saved!", "Success", JOptionPane.INFORMATION_MESSAGE);

         } catch (Exception e) {
             // Handle potential exceptions during DB operation
             JOptionPane.showMessageDialog(null, "Error saving medical history: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
             System.err.println(); // Log the full error for debugging
         }


        // --- Optional display (Keep as is) ---
        StringBuilder result = new StringBuilder("Interview Results:\n");
        for (Map.Entry<String, String> entry : answers.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        // Consider showing results only if save was successful or for debugging
        // JOptionPane.showMessageDialog(null, result.toString(), "Results", JOptionPane.INFORMATION_MESSAGE);

    }

    // --- runInterview Method (Keep as is) ---
    private static void runInterview(QuestionNode node, String PName) {
        while (node != null) {
            int response = JOptionPane.showConfirmDialog(
                    null,
                    node.question,
                    "Medical Interview",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE // Added message type icon
            );

            QuestionNode nextNode = null; // Determine next node based on response

            switch (response) {
                case JOptionPane.YES_OPTION:
                    if (node.onYes != null) {
                        LoggerUtility.logTemplate("Q: " + node.question + "A: Yes", PName);
                        node.onYes.run(); // Execute action associated with answering Yes
                    }
                    nextNode = node.yesNode; // Set the next node for the Yes path
                    break;
                case JOptionPane.NO_OPTION:
                    if (node.onNo != null) {
                        LoggerUtility.logTemplate("Q: " + node.question + "A: No", PName);
                        node.onNo.run(); // Execute action associated with answering No
                    }
                    nextNode = node.noNode; // Set the next node for the No path
                    break;
                case JOptionPane.CLOSED_OPTION: // Handle closing the dialog
                default: // Includes CLOSED_OPTION and any other unexpected value
                    LoggerUtility.logTemplate("Interview Canceled or Invalid Response", PName);
                    JOptionPane.showMessageDialog(null, "Interview canceled or invalid response.", "Interview Cancelled", JOptionPane.WARNING_MESSAGE);
                    // Decide how to handle cancellation - exit or maybe store partial data?
                    // For simplicity, we can clear answers and return, preventing DB save.
                    answers.clear(); // Clear potentially partial answers
                    return; // Exit the runInterview method
            }
            node = nextNode; // Move to the next node
        }
        // Interview completes when node becomes null
        System.out.println("Interview finished.");
        LoggerUtility.logTemplate("User Completed General Medical History Interview", PName);
    }


    // --- buildInterviewTree Method (MODIFIED) ---
    private static QuestionNode buildInterviewTree(String PName) {

        // --- Define Subsequent Main Questions First (Drug, Alcohol, Tobacco) ---
        // We need these defined so the blood type branches can link to the *next* main question.

        // Tobacco Question (Last in this sequence)
        QuestionNode tobaccoQ = new QuestionNode("Do you use tobacco?");
        tobaccoQ.onYes = () -> {
            String tobaccoQty = JOptionPane.showInputDialog("How much tobacco do you use per day/week?");
            String tobaccoDuration = JOptionPane.showInputDialog("For how many years have you used tobacco?");
            answers.put("Tobacco", "Yes");
            answers.put("Tobacco Quantity", tobaccoQty);
            if(tobaccoQty != null){
                LoggerUtility.logTemplate("User uses " + tobaccoQty + " per day/week.", PName);
            }
            answers.put("Tobacco Duration", tobaccoDuration); // Corrected key
            if(tobaccoDuration != null){
                LoggerUtility.logTemplate("User has used tobacco for " + tobaccoDuration + " year(s).", PName);
            }
        };
        tobaccoQ.onNo = () -> {
            answers.put("Tobacco", "No");
            // No need to put nulls explicitly if using getOrDefault later
            // answers.put("Tobacco Quantity", null);
            // answers.put("Tobacco Duration", null);
        };
        // Both paths end the interview sequence for now
        tobaccoQ.yesNode = null;
        tobaccoQ.noNode = null;


        // Alcohol Question
        QuestionNode alcoholQ = new QuestionNode("Do you consume alcohol?");
        alcoholQ.onYes = () -> {
            String alcoholQty = JOptionPane.showInputDialog("How many alcoholic drinks do you consume per week?");
            String alcoholDuration = JOptionPane.showInputDialog("For how many years have you consumed alcohol?");
            answers.put("Alcohol", "Yes");
            answers.put("Alcohol Quantity", alcoholQty);
            if(alcoholQty != null){
                LoggerUtility.logTemplate( "User drinks " + alcoholQty + " per week.", PName);
            }
            answers.put("Alcohol Duration", alcoholDuration);
            if(alcoholDuration != null){
                LoggerUtility.logTemplate( "User has consumed alcohol for " + alcoholDuration + " years.", PName);
            }
        };
        alcoholQ.onNo = () -> {
            answers.put("Alcohol", "No");
        };
        // Both paths lead to the tobacco question
        alcoholQ.yesNode = tobaccoQ;
        alcoholQ.noNode = tobaccoQ;


        // Drug Questions
        QuestionNode drugTypeQ = new QuestionNode("Do you use prescription or over-the-counter drugs?");
        drugTypeQ.onYes = () -> { // Using onYes to capture the type, assuming 'Yes' means they will enter a type
            String type = JOptionPane.showInputDialog("Enter type(s) of drug(s) used:");
            answers.put("DrugType", type);
            if(type != null){
                LoggerUtility.logTemplate("User uses the following drug(s): " + type + ".", PName);
            }
            // Ask duration immediately after type
            String duration = JOptionPane.showInputDialog("For how long (e.g., months, years) have you used these drugs?");
            answers.put("Drug Duration", duration);
            if(duration != null){
                LoggerUtility.logTemplate("User has been using those drugs for " + duration + ".", PName);
            }
        };
        // If they say 'No' to the type question (unlikely prompt, but handles cancel), skip duration
        drugTypeQ.onNo = () -> {
             answers.put("DrugType", "Declined to specify"); // Or null, or "Unknown"
             LoggerUtility.logTemplate("User does not use drugs/declined to specify", PName);
             answers.put("Drug Duration", null);
             LoggerUtility.logTemplate("No drug duration.", PName);
        };
        // Both paths from drug type lead to the alcohol question
        drugTypeQ.yesNode = alcoholQ;
        drugTypeQ.noNode = alcoholQ; // Even if they cancel/say no to type, proceed

       
        


        // --- Blood Type Confirmation Tree ---

        // Define the NEXT main question after blood type is determined or skipped
        QuestionNode nextQuestionAfterBlood = drugTypeQ; // Link all blood type paths here

        // Actions to store the final confirmed blood type
        Runnable storeAPos = () -> { answers.put("BloodType", "A"); answers.put("Rh", "+"); LoggerUtility.logTemplate("User's bloodtype is A+.", PName); };
        Runnable storeANeg = () -> { answers.put("BloodType", "A"); answers.put("Rh", "-"); LoggerUtility.logTemplate("User's bloodtype is A-.", PName); };
        Runnable storeBPos = () -> { answers.put("BloodType", "B"); answers.put("Rh", "+"); LoggerUtility.logTemplate("User's bloodtype is B+.", PName); };
        Runnable storeBNeg = () -> { answers.put("BloodType", "B"); answers.put("Rh", "-"); LoggerUtility.logTemplate("User's bloodtype is B-.", PName); };
        Runnable storeABPos = () -> { answers.put("BloodType", "AB"); answers.put("Rh", "+"); LoggerUtility.logTemplate("User's bloodtype is AB+.", PName); };
        Runnable storeABNeg = () -> { answers.put("BloodType", "AB"); answers.put("Rh", "-"); LoggerUtility.logTemplate("User's bloodtype is AB-.", PName); };
        Runnable storeOPos = () -> { answers.put("BloodType", "O"); answers.put("Rh", "+"); LoggerUtility.logTemplate("User's bloodtype is O+.", PName); };
        Runnable storeONeg = () -> { answers.put("BloodType", "O"); answers.put("Rh", "-"); LoggerUtility.logTemplate("User's bloodtype is O-.", PName); };
        Runnable storeUnknown = () -> { answers.put("BloodType", "Unknown"); answers.put("Rh", "Unknown"); LoggerUtility.logTemplate("User does not know their bloodtype.", PName); };

        // Rh Factor Question Nodes (Leaf nodes of the confirmation sub-tree)
        QuestionNode rhQ_A = new QuestionNode("Is your blood type Rh Positive (+)?");
        rhQ_A.onYes = storeAPos;
        rhQ_A.onNo = storeANeg;
        rhQ_A.yesNode = nextQuestionAfterBlood; // Link back to main flow
        rhQ_A.noNode = nextQuestionAfterBlood;  // Link back to main flow

        QuestionNode rhQ_B = new QuestionNode("Is your blood type Rh Positive (+)?");
        rhQ_B.onYes = storeBPos;
        rhQ_B.onNo = storeBNeg;
        rhQ_B.yesNode = nextQuestionAfterBlood;
        rhQ_B.noNode = nextQuestionAfterBlood;

        QuestionNode rhQ_AB = new QuestionNode("Is your blood type Rh Positive (+)?");
        rhQ_AB.onYes = storeABPos;
        rhQ_AB.onNo = storeABNeg;
        rhQ_AB.yesNode = nextQuestionAfterBlood;
        rhQ_AB.noNode = nextQuestionAfterBlood;

        QuestionNode rhQ_O = new QuestionNode("Is your blood type Rh Positive (+)?");
        rhQ_O.onYes = storeOPos;
        rhQ_O.onNo = storeONeg;
        rhQ_O.yesNode = nextQuestionAfterBlood;
        rhQ_O.noNode = nextQuestionAfterBlood;

        // ABO Group Question Nodes
        QuestionNode bAntigenCheck_GivenA = new QuestionNode("Does it ALSO have the 'B' antigen? (Making it AB)");
        bAntigenCheck_GivenA.yesNode = rhQ_AB; // If yes (A and B), ask Rh for AB
        bAntigenCheck_GivenA.noNode = rhQ_A;   // If no (Just A), ask Rh for A
        // No actions needed here, just navigation

        QuestionNode bAntigenCheck_GivenNotA = new QuestionNode("Does your blood type have the 'B' antigen? (Making it B)");
        bAntigenCheck_GivenNotA.yesNode = rhQ_B; // If yes (Just B), ask Rh for B
        bAntigenCheck_GivenNotA.noNode = rhQ_O;  // If no (Neither A nor B), ask Rh for O
        // No actions needed here, just navigation

        QuestionNode aAntigenCheck = new QuestionNode("Does your blood type have the 'A' antigen? (Types A and AB have it)");
        aAntigenCheck.yesNode = bAntigenCheck_GivenA;     // If yes, check for B
        aAntigenCheck.noNode = bAntigenCheck_GivenNotA;  // If no, check for B
        // No actions needed here, just navigation

        // --- Top-Level Blood Type Question ---
        QuestionNode knowBloodTypeQ = new QuestionNode("Do you know your specific blood type (e.g., A+, O-)?");
        knowBloodTypeQ.yesNode = aAntigenCheck; // Start the confirmation tree
        knowBloodTypeQ.noNode = nextQuestionAfterBlood; // Skip confirmation, go to next main question
        knowBloodTypeQ.onNo = storeUnknown; // Set blood type to Unknown if they answer No here


        // --- START THE INTERVIEW ---
        // The root of the entire interview tree is the first question you want to ask.
        return knowBloodTypeQ; // Start with the "Do you know your blood type?" question
    }

    
}