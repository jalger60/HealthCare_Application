package healthcare_application.DBUtils;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class PatientSelection_DBOperations {

    public static Connection connectToDatabase() {
        String dbURL = "jdbc:mysql://127.0.0.1:3306"
                + "/healthcare_app_java?autoReconnect=true&useSSL=false";
        Connection con = null;
        try {
            con = DriverManager.getConnection(dbURL, "root", "password");
            System.out.println("Database connected successfully!"); // Optional confirmation message
        } catch (SQLException ex) {
            System.err.println("Database Connection Error: " + ex.getMessage());
            // Consider throwing the exception or handling it more gracefully
            // For now, printing the error and returning null connection
        }
        return con;
    }


    public DefaultTableModel SearchforPatients(String searchText) {
        Connection dbConnection = connectToDatabase();
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;
        DefaultTableModel tableModel = new DefaultTableModel(); // Create a DefaultTableModel

        if (dbConnection != null) {
            try {
                String searchforpatientsSP = "{CALL GetPatient(?)}"; // Corrected stored procedure call syntax with parameter placeholder
                callableStatement = dbConnection.prepareCall(searchforpatientsSP);

                // Set the input parameter for the stored procedure
                callableStatement.setString(1, searchText); // Assuming the stored procedure expects a string as input

                // Execute the stored procedure and get the ResultSet
                resultSet = callableStatement.executeQuery();

                // Process the ResultSet
                if (resultSet != null) {
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();

                    // Get column names and add them to the table model
                    for (int i = 1; i <= columnCount; i++) {
                        tableModel.addColumn(metaData.getColumnName(i));
                    }

                    // Add data rows to the table model
                    while (resultSet.next()) {
                        Object[] rowData = new Object[columnCount];
                        for (int i = 1; i <= columnCount; i++) {
                            rowData[i - 1] = resultSet.getString(i); // Assuming String data, adjust if needed
                        }
                        tableModel.addRow(rowData);
                    }
                } else {
                    System.out.println("No patients found matching the search criteria.");
                    // You might want to clear the table model if no results are found, or handle it in the JFrame
                }

            } catch (SQLException ex) {
                System.err.println("Error executing stored procedure: " + ex.getMessage());
                // Handle error, perhaps return an empty table model or null to indicate error
            } finally {
                // Close resources in reverse order of creation
                try {
                    if (resultSet != null) resultSet.close();
                } catch (SQLException e) {
                    System.err.println("Error closing ResultSet: " + e.getMessage());
                }
                try {
                    if (callableStatement != null) callableStatement.close();
                } catch (SQLException e) {
                    System.err.println("Error closing CallableStatement: " + e.getMessage());
                }
                try {
                    if (dbConnection != null) dbConnection.close();
                } catch (SQLException e) {
                    System.err.println("Error closing Connection: " + e.getMessage());
                }
            }
        } else {
            System.out.println("Database connection was not established. Cannot search for patients.");
            // Handle no connection, perhaps return an empty table model or null
        }
        return tableModel; // Return the populated DefaultTableModel
    }


    public static void main(String[] args) {
        PatientSelection_DBOperations patientDB = new PatientSelection_DBOperations();
        // Example usage (without JFrame - for testing purposes)
        DefaultTableModel model = patientDB.SearchforPatients("John Doe");
        if (model.getRowCount() > 0) {
            // Print the table model content to console for testing
            for (int col = 0; col < model.getColumnCount(); col++) {
                System.out.printf("%-20s", model.getColumnName(col));
            }
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------");
            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    System.out.printf("%-20s", model.getValueAt(row, col));
                }
                System.out.println();
            }
        } else {
            System.out.println("No data in the table model.");
        }
    }
}