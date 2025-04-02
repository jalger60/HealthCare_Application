
package healthcare_application.DBUtils;

import java.sql.*;



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


   

    
}
