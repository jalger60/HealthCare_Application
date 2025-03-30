package healthcare_application.DBUtils;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class PatientSelection_DBOperations {

    public static Connection connectToDatabase() {
        String dbURL = "jdbc:mysql://127.0.0.1:3306"
                + "/healthcare_app_java?autoReconnect=true&useSSL=false";
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbURL, "root", "password");
            System.out.println("Database connected successfully!"); // Optional confirmation message
        } catch (SQLException ex) {
            System.err.println("Database Connection Error: " + ex.getMessage());
            // Consider throwing the exception or handling it more gracefully
            // For now, printing the error and returning null connection
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PatientSelection_DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }


    public DefaultTableModel SearchforPatients(String searchText) {
        Connection dbConnection = connectToDatabase();
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;
        
        DefaultTableModel tableModel = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Make all cells non-editable
        }
        };
        
        

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

                    // Check if resultSet is empty (i.e., no matching names found)
                    if (!resultSet.isBeforeFirst()) { 
                        JOptionPane.showMessageDialog(null, 
                            "No patients found matching the search criteria.", 
                            "Information", JOptionPane.INFORMATION_MESSAGE);
                        return SearchforAllPatients(); 
                    
                    } else {
                        // Add data rows to the table model
                        while (resultSet.next()) {
                            Object[] rowData = new Object[columnCount];
                            for (int i = 1; i <= columnCount; i++) {
                                rowData[i - 1] = resultSet.getString(i); 
                            }
                            tableModel.addRow(rowData);
                        }
                    }
                }

            } catch (SQLException ex) {
                System.err.println("Error executing stored procedure: " + ex.getMessage());
                // Handle error, perhaps return an empty table model or null to indicate error
            } 
        } else {
            System.out.println("Database connection was not established. Cannot search for patients.");
            // Handle no connection, perhaps return an empty table model or null
        }
        return tableModel; // Return the populated DefaultTableModel
    }
    
    
    public DefaultTableModel SearchforAllPatients() {
        Connection dbConnection = connectToDatabase();
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;

        DefaultTableModel tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells non-editable
            }
        };

        if (dbConnection != null) {
            try {
                String searchForPatientsSP = "{CALL GetAllPatient()}"; // No parameter required
                callableStatement = dbConnection.prepareCall(searchForPatientsSP);

                resultSet = callableStatement.executeQuery();

                if (resultSet != null) {
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();

                    // Add column names to the table model
                    for (int i = 1; i <= columnCount; i++) {
                        tableModel.addColumn(metaData.getColumnName(i));
                    }

                    if (!resultSet.isBeforeFirst()) { 
                        JOptionPane.showMessageDialog(null, 
                            "No patients found.", 
                            "Information", JOptionPane.INFORMATION_MESSAGE);
                         
                    } else {
                        while (resultSet.next()) {
                            Object[] rowData = new Object[columnCount];
                            for (int i = 1; i <= columnCount; i++) {
                                rowData[i - 1] = resultSet.getString(i);
                            }
                            tableModel.addRow(rowData);
                        }
                    }
                }

            } catch (SQLException ex) {
                System.err.println("Error executing stored procedure: " + ex.getMessage());
            } 
        } else {
            System.out.println("Database connection was not established. Cannot retrieve patients.");
        }

        return tableModel;
    }
  

    
}