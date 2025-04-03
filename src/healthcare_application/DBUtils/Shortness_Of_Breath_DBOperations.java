
package healthcare_application.DBUtils;


import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
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
                // Prepare stored procedure call with seven parameters
                String qrySP = "{ CALL EditSOBAssessment(?, ?, ?, ?, ?, ?, ?) }";
                stmt = con.prepareCall(qrySP);

                // Retrieve selected row from JTable


                // Retrieve DateTime and Time from JTable
                String sobDate = sobInterview.getSelectedSOBDate();  // SOB Date (e.g., "April / 01 / 2025")
                String sobTime = sobInterview.getSelectedSOBTime();  // SOB Time (e.g., "02:30 PM")

                // Convert SOB Date to MySQL DATETIME format (YYYY-MM-DD)
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM / dd / yyyy");
                LocalDate date = LocalDate.parse(sobDate, dateFormatter);  // Convert to LocalDate
                String formattedDate = date.toString();  // MySQL format is 'YYYY-MM-DD'

                // Convert SOB Time to MySQL TIME format (HH:MM:SS)
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                LocalTime time = LocalTime.parse(sobTime, timeFormatter);  // Convert to LocalTime
                String formattedTime = time.toString();  // MySQL format is 'HH:mm:ss'

                // Combine Date and Time into a MySQL-compatible DATETIME (YYYY-MM-DD HH:MM:SS)
                String formattedDateTime = formattedDate + " " + formattedTime;

                // Set parameters for stored procedure
                stmt.setInt(1, sobID);  // Record ID
                stmt.setInt(2, patientID);  // Patient ID
                stmt.setString(3, formattedDateTime); // DATETIME (YYYY-MM-DD HH:MM:SS)
                stmt.setString(4, formattedTime); // TIME (HH:MM:SS)
                stmt.setBoolean(5, "Yes".equals(sobInterview.getCbox_SOBT()));  // ShortnessOfBreath
                stmt.setString(6, sobInterview.getCbox_SOBScale());  // Severity Level
                stmt.setBoolean(7, "Yes".equals(sobInterview.getCbox_SOBYesterday()));  // MoreShortThanYesterday

                // Execute stored procedure
                stmt.executeUpdate();


            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            System.out.println("Error executing stored procedure: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error parsing date or time: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
   }
    
 

    public void deleteSOBAssessment(int sobID, int patientID) {
        Connection con = null;
        CallableStatement stmt = null;

        try {
            // Establish database connection
            con = PatientSelection_DBOperations.connectToDatabase();
            if (con != null) {
                // Prepare stored procedure call with two parameters
                String qrySP = "{ CALL DeleteSOBAssessment(?, ?) }";
                stmt = con.prepareCall(qrySP);

                // Set parameters for the stored procedure
                stmt.setInt(1, sobID);  // SOB ID
                stmt.setInt(2, patientID);  // Patient ID

                // Execute stored procedure
                stmt.executeUpdate();
                System.out.println("SOBAssessment record marked as deleted.");
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
    
    public static void insertRecord(int patientID, boolean sob, String severity, boolean moreShort) {
        String sql = "CALL InsertShortnessOfBreath(?, ?, ?, ?, ?, ?)";

        try (Connection conn = PatientSelection_DBOperations.connectToDatabase();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, patientID);
            stmt.setDate(2, Date.valueOf(LocalDate.now()));
            stmt.setTime(3, Time.valueOf(LocalTime.now()));
            stmt.setBoolean(4, sob);
            stmt.setString(5, severity);
            stmt.setBoolean(6, moreShort);
            stmt.execute();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

  
    
}
