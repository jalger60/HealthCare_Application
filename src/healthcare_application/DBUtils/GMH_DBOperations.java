
package healthcare_application.DBUtils;


import java.sql.*;

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

    
    
    
    
}
