
package healthcare_application.DBUtils;


import java.sql.*;
import healthcare_application.Shortness_of_Breath_Interview;


public class Shortness_Of_Breath_DBOperations {
    
    public static ResultSet PatientDBUtils(int patientID) {
        ResultSet rs = null;
        Connection con = null;
        CallableStatement stmt = null;

        try {
            // Establish a connection
            con = PatientSelection_DBOperations.connectToDatabase();
            if (con != null) {
                // Prepare the stored procedure call with the PatientID parameter
                String qrySP = "{ CALL GetSOBRecordsByPatient(?) }";
                stmt = con.prepareCall(qrySP);

                // Set the PatientID parameter
                stmt.setInt(1, patientID);

                // Execute the stored procedure and get the result
                rs = stmt.executeQuery();
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            System.out.println("Error executing stored procedure: " + e.getMessage());
        }

        // Don't close the resources here. The calling method should manage the closing of resources.
        return rs;
    }
    
    public void editSOBAssessment(int sobID, int patientID, Shortness_of_Breath_Interview sobInterview) {
        Connection con = null;
        CallableStatement stmt = null;


        try {
            // Establish database connection
            con = PatientSelection_DBOperations.connectToDatabase();
            if (con != null) {
                // Prepare stored procedure call
                String qrySP = "{ CALL EditSOBAssessment(?, ?, ?, ?, ?) }";
                stmt = con.prepareCall(qrySP);



                // Set parameters for stored procedure
                stmt.setInt(1, sobID);                               // Record ID
                stmt.setInt(2, patientID);                           // Patient ID
                stmt.setInt(3, "Yes".equals(sobInterview.getCbox_SOBT()) ? 1 : 0);
                stmt.setString(4, sobInterview.getCbox_SOBScale());              // Severity Level
                stmt.setInt(5, "Yes".equals(sobInterview.getCbox_SOBYesterday()) ? 1 : 0);
                // Execute stored procedure
                stmt.executeUpdate();

            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            System.out.println("Error executing stored procedure: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }

    
}



   

    
}
