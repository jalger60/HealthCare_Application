
package healthcare_application.Validation;



public class ActivityTolerance_Validation {
    
    public static String validateDigitsOnly(String input) {
        // Allow null input (treat as valid, return it)
        if (input == null) {
            return null;
        }

        // Trim and check if it's empty
        if (input.trim().isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty.");
        }

        // Must be digits only
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException("Input must contain only digits with no spaces.");
        }

        return input;
    }
    
    
}
