
package healthcare_application.DBUtils;


import java.sql.*;
import healthcare_application.Immunizations;
public class Immunizations_DBOperations {
    
    public static ResultSet PatientDBUtils(int patientID) {
        ResultSet rs = null;
        Connection con = null;
        CallableStatement stmt = null;

        try {
            // Establish a connection
            con = PatientSelection_DBOperations.connectToDatabase();
            if (con != null) {
                // Prepare the stored procedure call with the PatientID parameter
                String qrySP = "{ CALL GetImmunizationsByPatient(?) }";
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
    
    public static void addImmunizationHistory(Immunizations immu, int patientID) {
        try (Connection con = PatientSelection_DBOperations.connectToDatabase()) {
            if (con == null) {
                System.out.println("Connection to the database failed!");
                return;
            }

            String storedProc = "{CALL AddImmunizationHistory(?, ?, ?, ?, ?, ?, ?)}"; // 7 input parameters

            try (CallableStatement stmt = con.prepareCall(storedProc)) {

                if (immu == null) {
                    System.out.println("Patient data is null!");
                    return;
                }

                // Set input parameters
                stmt.setInt(1, immu.getPatientID());  // assuming you have patient ID stored
                stmt.setString(2, immu.getVaccine());
                java.util.Date immunizationDate = immu.getImmu_Date().getDate(); // getDate() is needed from JDateChooser
                stmt.setTimestamp(3, immunizationDate != null ? new java.sql.Timestamp(immunizationDate.getTime()) : null);

                java.util.Date expirationDate = immu.getImmu_Exp_Date().getDate();
                stmt.setTimestamp(4, expirationDate != null ? new java.sql.Timestamp(expirationDate.getTime()) : null);

                stmt.setString(5, immu.getDelivery());
                stmt.setString(6, immu.getComments());
                stmt.setString(7, immu.getHCPId());

                // Execute stored procedure
                stmt.executeUpdate();

                System.out.println("Immunization history added successfully.");

            } catch (SQLException ex) {
                System.err.println("Error executing stored procedure: " + ex.getMessage());
                System.err.println("SQL State: " + ex.getSQLState() + " | Error Code: " + ex.getErrorCode());
            }
        } catch (SQLException ex) {
            System.err.println("Database connection error: " + ex.getMessage());
        }
}

    
    
}
