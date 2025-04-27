package healthcare_application.DBUtils;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class PatientSelection_DBOperations {

    public static Connection connectToDatabase() {
        String dbURL = "jdbc:mysql://127.0.0.1:3306"
                + "/healthcare_application_java?autoReconnect=true&useSSL=false";
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbURL, "root", "toor");
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

        // Define column names
        String[] columnNames = {"Patient ID", "Last Name", "First Name", "Phone Number", "Date of Birth"};

        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells non-editable
            }
        };

        if (dbConnection != null) {
            try {
                String searchforpatientsSP = "{CALL GetPatient(?)}";
                callableStatement = dbConnection.prepareCall(searchforpatientsSP);
                callableStatement.setString(1, searchText);

                resultSet = callableStatement.executeQuery();

                if (resultSet != null) {
                    int columnCount = resultSet.getMetaData().getColumnCount();

                    if (!resultSet.isBeforeFirst()) { 
                        JOptionPane.showMessageDialog(null, 
                            "No patients found matching the search criteria.", 
                            "Information", JOptionPane.INFORMATION_MESSAGE);
                        return SearchforAllPatients(); 
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
            } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (callableStatement != null) callableStatement.close();
                if (dbConnection != null) dbConnection.close();  
                     System.out.println("Connection Closed");
            } catch (SQLException ex) {
                System.err.println("Error closing database resources: " + ex.getMessage());
            }
        }
        } else {
            System.out.println("Database connection was not established. Cannot search for patients.");
        }
        return tableModel;
    }
    
    
    public DefaultTableModel SearchforAllPatients() {
        Connection dbConnection = connectToDatabase();
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;

        // Create the table model with column names
        String[] columnNames = {"Patient ID", "First Name", "Last Name", "Phone Number", "Date of Birth"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells non-editable
            }
        };

        if (dbConnection != null) {
            try {
                String searchForPatientsSP = "{CALL GetAllPatients()}";
                callableStatement = dbConnection.prepareCall(searchForPatientsSP);
                resultSet = callableStatement.executeQuery();

                if (!resultSet.isBeforeFirst()) {
                    JOptionPane.showMessageDialog(null, "No patients found.", "Information", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    while (resultSet.next()) {
                        Object[] rowData = new Object[5];
                        rowData[0] = resultSet.getString("PatientID");
                        rowData[1] = resultSet.getString("PtFirstName");
                        rowData[2] = resultSet.getString("PtLastName");
                        rowData[3] = resultSet.getString("PtMobilePhone");
                        rowData[4] = resultSet.getString("DOB");
                        tableModel.addRow(rowData);
                    }
                }

            } catch (SQLException ex) {
                System.err.println("Error executing stored procedure: " + ex.getMessage());
            } finally {
                try {
                    if (resultSet != null) resultSet.close();
                    if (callableStatement != null) callableStatement.close();
                    if (dbConnection != null) dbConnection.close();
                    System.out.println("Connection Closed");
                } catch (SQLException e) {
                    System.err.println("Error closing resources: " + e.getMessage());
                }
            }
        } else {
            System.out.println("Database connection was not established. Cannot retrieve patients.");
        }

        return tableModel;
    }


    
    
  

  

    
}