
package healthcare_application.DBUtils;


import java.sql.*;
import healthcare_application.General_Medical_History;

public class GMH_DBOperations {
    
    public static void insertGeneralMedicalHistory(
        int patientID,
        String tobacco,
        String tobaccoQuantity,
        String tobaccoDuration,
        String alcohol,
        String alcoholQuantity,
        String alcoholDuration,
        String drug,
        String drugType,
        String drugDuration,
        String bloodType,
        String rh
) {
    String sql = "CALL AddGeneralMedicalHistory(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = PatientSelection_DBOperations.connectToDatabase();
         CallableStatement stmt = conn.prepareCall(sql)) {

        stmt.setInt(1, patientID);
        stmt.setString(2, tobacco);
        stmt.setString(3, tobaccoQuantity);
        stmt.setString(4, tobaccoDuration);
        stmt.setString(5, alcohol);
        stmt.setString(6, alcoholQuantity);
        stmt.setString(7, alcoholDuration);
        stmt.setString(8, drug);
        stmt.setString(9, drugType);
        stmt.setString(10, drugDuration);
        stmt.setString(11, bloodType);
        stmt.setString(12, rh);

        stmt.execute();

    } catch (SQLException e) {
        System.out.println("SQL Error: " + e.getMessage());
    }
    
    
    
    
    
}
    
    
    public General_Medical_History getGeneralMedicalHistory(int patientID) {
        General_Medical_History history = new General_Medical_History();

        Connection con = PatientSelection_DBOperations.connectToDatabase();
        if (con != null) {
            CallableStatement stmt = null;
            ResultSet rs = null;

            try {
                String storedProc = "{CALL GetGeneralMedicalHistoryByPatientID(?)}";
                stmt = con.prepareCall(storedProc);
                stmt.setInt(1, patientID);

                rs = stmt.executeQuery();

                if (rs.next()) {
                    history.setGMHID(rs.getInt("GeneralMedicalHistoryID"));
                    history.setPatientID(rs.getInt("PatientID"));
                    history.setTobaccoUse(rs.getString("Tobacco"));
                    history.setTobaccoQuantity(rs.getString("TobaccoQuantity"));
                    history.setTobaccoDuration(rs.getString("Tobaccoduraton"));
                    history.setAlcoholUse(rs.getString("Alcohol"));
                    history.setAlcoholQuantity(rs.getString("AlcoholQuantity"));
                    history.setAlcoholDuration(rs.getString("Alcoholduration"));
                    history.setDrugUse(rs.getString("Drug"));
                    history.setDrugType(rs.getString("DrugType"));
                    history.setDrugDuration(rs.getString("Drugduration"));
                    history.setBloodType(rs.getString("BloodType"));
                    history.setRH(rs.getString("Rh"));
                } else {
                    System.out.println("No medical history found for Patient ID: " + patientID);
                }
            } catch (SQLException ex) {
                System.err.println("Error executing stored procedure: " + ex.getMessage());
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException ex) {
                    System.err.println("Error closing resources: " + ex.getMessage());
                }
            }
        } else {
            System.out.println("Connection failed.");
        }

        return history;
    }

    public static void updateGeneralMedicalHistory(General_Medical_History history, int generalMedicalHistoryID, int patientID) {

        if (history == null) {
            System.out.println("General Medical History object is null for Patient ID: " + patientID);
            return;
        }

        try (Connection con = PatientSelection_DBOperations.connectToDatabase()) {

            if (con == null) {
                System.out.println("Connection to the database failed!");
                return;
            }

            String storedProc = "{CALL EditGeneralMedicalHistory(?,?,?,?,?,?,?,?,?,?,?,?,?)}"; // 13 parameters

            try (CallableStatement stmt = con.prepareCall(storedProc)) {

                // Set stored procedure parameters
                stmt.setInt(1, generalMedicalHistoryID); // p_GeneralMedicalHistoryID
                stmt.setInt(2, patientID);               // p_PatientID
                stmt.setString(3, history.getTobaccoUse()); // p_Tobacco
                stmt.setString(4, history.getTobaccoQuantity()); // p_TobaccoQuantity
                stmt.setString(5, history.getTobaccoDuration()); // p_Tobaccoduraton
                stmt.setString(6, history.getAlcoholUse());          // p_Alcohol
                stmt.setString(7, history.getAlcoholQuantity());  // p_AlcoholQuantity
                stmt.setString(8, history.getAlcoholDuration());  // p_Alcoholduration
                stmt.setString(9, history.getDrugUse());             // p_Drug
                stmt.setString(10, history.getDrugType());        // p_DrugType
                stmt.setString(11, history.getDrugDuration());    // p_Drugduration
                stmt.setString(12, history.getBloodType());       // p_BloodType
                stmt.setString(13, history.getRH());              // p_Rh

                System.out.println("Updating GeneralMedicalHistoryID: " + generalMedicalHistoryID + " for PatientID: " + patientID);

                // Execute the update
                stmt.executeUpdate();

            } catch (SQLException ex) {
                System.err.println("Error executing stored procedure: " + ex.getMessage());
                System.err.println("SQL State: " + ex.getSQLState() + " | Error Code: " + ex.getErrorCode());
            }
        } catch (SQLException ex) {
            System.err.println("Database connection error: " + ex.getMessage());
        }
        
        
        
    }
    
    
    public static void deleteGeneralMedicalHistory(int generalMedicalHistoryID, int patientID) {
        try (Connection con = PatientSelection_DBOperations.connectToDatabase()) {

            if (con == null) {
                System.out.println("Connection to the database failed!");
                return;
            }

            String storedProc = "{CALL DeleteGeneralMedicalHistory(?, ?)}"; // Updated to match the new stored procedure

            try (CallableStatement stmt = con.prepareCall(storedProc)) {
                // Set both parameters
                stmt.setInt(1, generalMedicalHistoryID);
                stmt.setInt(2, patientID);

                // Execute update
                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("General Medical History ID " + generalMedicalHistoryID + " for Patient ID " + patientID + " marked as deleted.");
                } else {
                    System.out.println("No general medical history record found with ID: " + generalMedicalHistoryID + " and Patient ID: " + patientID);
                }

            } catch (SQLException ex) {
                System.err.println("Error executing stored procedure: " + ex.getMessage());
                System.err.println("SQL State: " + ex.getSQLState() + " | Error Code: " + ex.getErrorCode());
            }

        } catch (SQLException ex) {
            System.err.println("Database connection error: " + ex.getMessage());
        }
    }


    
    
    


    
    
    
    

     
    
}
