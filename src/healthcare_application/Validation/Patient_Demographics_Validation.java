
package healthcare_application.Validation;

import java.util.regex.Pattern;


public class Patient_Demographics_Validation {

    
    private static final Pattern NAME_PATTERN = Pattern.compile("^[A-Z][a-z]*$");

    
    public static String validateFirstName(String firstName) {

        // 1. Check for null or empty/whitespace
        if (firstName == null || firstName.trim().isEmpty()) {
            return "First Name cannot be null or empty."; // Specific error for null/empty
        }

       
        if (!NAME_PATTERN.matcher(firstName).matches()) {
            // If regex fails, try to determine a more specific reason for clarity

            if (firstName.contains(" ")) {
                 return "First Name cannot contain spaces.";
            } else if (!Character.isUpperCase(firstName.charAt(0))) {
                 
                 return "First Name must start with a capital letter.";
            } else {
               
                 boolean onlyLowercaseAfterFirst = true;
                 for (int i = 1; i < firstName.length(); i++) {
                     if (!Character.isLowerCase(firstName.charAt(i))) {
                         onlyLowercaseAfterFirst = false;
                         break;
                     }
                 }
                 if (!onlyLowercaseAfterFirst) {
                     
                     return "First Name must contain only lowercase letters after the first capital letter.";
                 } else {
                    
                     return "Invalid First Name format.\nMust contain only letters (A-Z, a-z), start with one capital, and have no spaces.";
                 }
            }
        }

 
        return null; 
    }
    
     // Shared method for Last Name and City
    private static String validateAlphaWithSpaces(String input, String fieldName) {
        if (input == null || input.trim().isEmpty()) {
            return fieldName + " cannot be null or empty.";
        }

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                return fieldName + " cannot contain numbers.";
            } else if (!Character.isLetter(c) && c != ' ') {
                return fieldName + " can only contain letters and spaces.";
            }
        }

        return null;
    }

    public static String validateLastName(String lastName) {
        return validateAlphaWithSpaces(lastName, "Last Name");
    }

    public static String validateCity(String city) {
        return validateAlphaWithSpaces(city, "City");
    }
    
    public static String validateZipCode(String zipCode) {
        if (zipCode == null || zipCode.trim().isEmpty()) {
            return "Zip Code cannot be null or empty.";
        }

        if (!zipCode.matches("\\d{5}")) {
            return "Zip Code must be exactly 5 digits.";
        }

        return null; // Valid
    }
    
    public static String validatePhone(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be null or empty.");
        }

        // Remove all non-digit characters
        String digitsOnly = input.replaceAll("[^\\d]", "");

        // Check if it has exactly 10 digits
        if (digitsOnly.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number. It must contain exactly 10 digits.");
        }

        // Format as xxx-xxx-xxxx
        return digitsOnly.replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "$1-$2-$3");
    }
    

    

    
}