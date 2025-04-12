
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
                stmt.setInt(1, patientID);  // assuming you have patient ID stored
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
    
    
    public static void editImmunizationHistory(Immunizations immu, int patientID, int RecordID) {
        try (Connection con = PatientSelection_DBOperations.connectToDatabase()) {
            if (con == null) {
                System.out.println("Connection to the database failed!");
                return;
            }

            String storedProc = "{CALL EditImmunizationHistory(?, ?, ?, ?, ?, ?, ?, ?)}"; // 8 input parameters

            try (CallableStatement stmt = con.prepareCall(storedProc)) {

                if (immu == null) {
                    System.out.println("Immunization data is null!");
                    return;
                }

                // Set input parameters
                stmt.setInt(1, RecordID);  // ImmunizationsID
                stmt.setInt(2, patientID);                  // PatientID
                stmt.setString(3, immu.getVaccine());       // Vaccine

                java.util.Date immunizationDate = immu.getImmu_Date().getDate();
                stmt.setTimestamp(4, immunizationDate != null ? new java.sql.Timestamp(immunizationDate.getTime()) : null); // ImmunizationDate

                java.util.Date expirationDate = immu.getImmu_Exp_Date().getDate();
                stmt.setTimestamp(5, expirationDate != null ? new java.sql.Timestamp(expirationDate.getTime()) : null); // ExperationDate

                stmt.setString(6, immu.getDelivery());       // Delivery
                stmt.setString(7, immu.getComments());       // Comments
                stmt.setString(8, immu.getHCPId());          // HCPId

                // Execute stored procedure
                stmt.executeUpdate();

                System.out.println("Immunization history updated successfully.");

            } catch (SQLException ex) {
                System.err.println("Error executing stored procedure: " + ex.getMessage());
                System.err.println("SQL State: " + ex.getSQLState() + " | Error Code: " + ex.getErrorCode());
            }
        } catch (SQLException ex) {
            System.err.println("Database connection error: " + ex.getMessage());
        }
    }
    
    public static void deleteImmunizationHistory(int immunizationsID, int patientID) {
        Connection con = null;
        CallableStatement stmt = null;

        try {
            // Establish database connection
            con = PatientSelection_DBOperations.connectToDatabase();
            if (con != null) {
                // Prepare stored procedure call with two parameters
                String qrySP = "{ CALL DeleteImmunizationHistory(?, ?) }";
                stmt = con.prepareCall(qrySP);

                // Set parameters for the stored procedure
                stmt.setInt(1, immunizationsID);  // ImmunizationsID
                stmt.setInt(2, patientID);        // PatientID

                // Execute stored procedure
                stmt.executeUpdate();
                System.out.println("Immunization record marked as deleted.");
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
