
package healthcare_application.Validation;


public class GMH_Auto_Interview_Validation {
    
   public static String validateBloodType(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Blood type is required.");
        }

        String normalized = input.trim().toUpperCase();

        if (!normalized.equals("A") && !normalized.equals("B") &&
            !normalized.equals("AB") && !normalized.equals("O")) {
            throw new IllegalArgumentException("Invalid blood type. Allowed types: A, B, AB, O.");
        }

        return normalized;
   }
   
   
   public static String validateRhFactor(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Rh factor is required.");
        }

        String trimmed = input.trim();

        if (!trimmed.equals("+") && !trimmed.equals("-")) {
            throw new IllegalArgumentException("Invalid Rh factor. Only + or - is allowed.");
        }

        return trimmed;
   }
   
   
    
    
    
}
