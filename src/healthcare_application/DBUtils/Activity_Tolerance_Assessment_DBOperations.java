/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare_application.DBUtils;

import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import healthcare_application.Activity_Tolerance_Interview;

public class Activity_Tolerance_Assessment_DBOperations {
    
    public static ResultSet PatientDBUtils(int patientID) {
        ResultSet rs = null;
        Connection con = null;
        CallableStatement stmt = null;

        try {
            // Establish a connection
            con = PatientSelection_DBOperations.connectToDatabase();
            if (con != null) {
                // Prepare the stored procedure call with the PatientID parameter
                String qrySP = "{ CALL GetActivitiesToleranceByPatient(?) }";
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
    
    
    public static void insertActivityToleranceRecord(
        int patientID,
        boolean eating,
        boolean drinking,
        boolean gettingDressed,
        boolean walking,
        boolean stairs,
        Integer stairQty // Can be null
        ) {
    // Updated SQL to match stored procedure (with 10 parameters)
    String sql = "CALL InsertActivityTolerance(?, ?, ?, ?, ?, ?, ?, ?, ?)";

    Connection conn = null;
    CallableStatement stmt = null;

    try {
        conn = PatientSelection_DBOperations.connectToDatabase();
        stmt = conn.prepareCall(sql);

        // Setting parameters for the stored procedure
        stmt.setInt(1, patientID); // PatientID
        stmt.setDate(2, Date.valueOf(LocalDate.now())); // ATDate
        stmt.setTime(3, Time.valueOf(LocalTime.now())); // ATTime
        stmt.setBoolean(4, eating); // Eating
        stmt.setBoolean(5, drinking); // Drinking
        stmt.setBoolean(6, gettingDressed); // GettingDressed
        stmt.setBoolean(7, walking); // Walking
        stmt.setBoolean(8, stairs); // Stairs

        // Handling the stairQty parameter if it is null or not
        if (stairQty != null) {
            stmt.setInt(9, stairQty); // StairQty
        } else {
            stmt.setNull(9, java.sql.Types.INTEGER); // Setting null for stairQty if it's not provided
        }

        // Executing the stored procedure
        stmt.execute();
        System.out.println("Activity Tolerance record inserted successfully.");

    } catch (SQLException e) {
        System.err.println("Error executing procedure: " + e);
        // Log or rethrow exception here for better debugging
    } finally {
        // Close the statement
        try {
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error closing CallableStatement: " + ex.getMessage());
        }

        // Close the connection
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error closing Connection: " + ex.getMessage());
        }
      }
    }
    
    
    public static void editActivityToleranceByPatient(int activityToleranceID, int patientID, Activity_Tolerance_Interview activityTolerance) {
        Connection con = null;
        CallableStatement stmt = null;

        try {
            // Establish database connection
            con = PatientSelection_DBOperations.connectToDatabase();
            if (con != null) {
                // Prepare stored procedure call with parameters
                String qrySP = "{ CALL EditActivityToleranceByPatient(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
                stmt = con.prepareCall(qrySP);

                // Retrieve Date and Time from JTable
                String activityDate = activityTolerance.getSelectedATDate();  // Activity Date (e.g., "April / 01 / 2025")
                String activityTime = activityTolerance.getSelectedATTime();  // Activity Time (e.g., "02:30 PM")
                
              
                
                // Convert Activity Date to MySQL DATE format (YYYY-MM-DD)
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM / dd / yyyy");
                LocalDate date = LocalDate.parse(activityDate, dateFormatter);  // Convert to LocalDate
                String formattedDate = date.toString();  // MySQL format is 'YYYY-MM-DD'

                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                LocalTime time = LocalTime.parse(activityTime, timeFormatter);
                String formattedTime = time.toString();  // Already in 24-hour format
                
                // Combine Date and Time into a MySQL-compatible DATETIME (YYYY-MM-DD HH:MM:SS)
                String formattedDateTime = formattedDate + " " + formattedTime;


                // Set parameters for stored procedure
                stmt.setInt(1, activityToleranceID);  // Patient ID
                stmt.setInt(2, patientID);  // Activity Tolerance ID
                stmt.setString(3, formattedDateTime);  // Set the DATE in column 2 (YYYY-MM-DD)
                stmt.setString(4, formattedTime);  // Set the TIME in column 3 (HH:mm:ss)
                stmt.setString(5, activityTolerance.getCbox_Eating());  // TroubleEating
                stmt.setString(6, activityTolerance.getCbox_Drinking());  // TroubleDrinking
                stmt.setString(7, activityTolerance.getCbox_Dressed());  // TroubleGettingDressed
                stmt.setString(8, activityTolerance.getCbox_House());  // TroubleWalkingAroundHouse
                stmt.setString(9, activityTolerance.getCbox_ClimbStairs());  // TroubleClimbingStairs

                // Handle txt_NumStairs value (if it's not null)
                Integer numberOfStairs = activityTolerance.getTxt_NumStairs();  // Get NumberOfStairs from ActivityToleranceForm
                if (numberOfStairs != null) {
                    stmt.setInt(10, numberOfStairs);  // Set as integer if not null
                } else {
                    stmt.setNull(10, java.sql.Types.INTEGER);  // Set as null if no number of stairs
                }



                // Execute stored procedure
                stmt.executeUpdate();

            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            System.out.println("Error executing stored procedure: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
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
    
    
    public static void deleteATAssessment(int ATID, int patientID) {
        Connection con = null;
        CallableStatement stmt = null;

        try {
            // Establish database connection
            con = PatientSelection_DBOperations.connectToDatabase();
            if (con != null) {
                // Prepare stored procedure call with two parameters
                String qrySP = "{ CALL DeleteActivityTolerance(?, ?) }";
                stmt = con.prepareCall(qrySP);

                // Set parameters for the stored procedure
                stmt.setInt(1, ATID);  // SOB ID
                stmt.setInt(2, patientID);  // Patient ID

                // Execute stored procedure
                stmt.executeUpdate();
                System.out.println("Activity Assessment record marked as deleted.");
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





