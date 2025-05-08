/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare_application.DBUtils;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jaked
 */
public class Family_History_DBOperations {
    public static Connection connectToDatabase(){
        String dbURL = "jdbc:mysql://127.0.0.1:3306/healthcare_application_java?autoReconnect=true&useSSL=false";
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, "root", "toor");
        }
        catch(SQLException ex){
            System.err.println("ERROR - COULD NOT CONNECT TO DATABASE!");
        }
        catch(ClassNotFoundException ex){
            System.err.println("ERROR - DRIVER NOT FOUND!");
        }
        return conn;
    }
    
    public void addFHRecord(int PID, String name, String relation, int alive, int LWP, String majorDisorder, String SToD, int HRF, int deleted){
        Connection conn = null;
        CallableStatement stmt = null;
        
        try{
            conn = connectToDatabase();
            stmt = conn.prepareCall("{CALL AddFamilyHistory(?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            stmt.setInt(1, PID);
            stmt.setString(2, name);
            stmt.setString(3, relation);
            stmt.setInt(4, alive);
            stmt.setInt(5, LWP);
            stmt.setString(6, majorDisorder);
            stmt.setString(7, SToD);
            stmt.setInt(8, HRF);
            stmt.setInt(9, deleted);
            
            stmt.execute();
            JOptionPane.showMessageDialog(null , "Record added successfully!", "Record Added", JOptionPane.INFORMATION_MESSAGE);
            
            stmt.close();
            conn.close();
        }
        catch(SQLException ex){
            System.err.println("DATABASE ERROR! " + ex.toString());
        }
    }
    
    public void editFHRecord(int FID, String name, String relation, int alive, int LWP, String majorDisorder, String SToD, int HRF){
        Connection conn = null;
        CallableStatement stmt = null;
        
        try{
            conn = connectToDatabase();
            stmt = conn.prepareCall("{CALL EditFamilyHistory(?, ?, ?, ?, ?, ?, ?, ?)}");
            stmt.setInt(1, FID);
            stmt.setString(2, name);
            stmt.setString(3, relation);
            stmt.setInt(4, alive);
            stmt.setInt(5, LWP);
            stmt.setString(6, majorDisorder);
            stmt.setString(7, SToD);
            stmt.setInt(8, HRF);
            
            stmt.execute();
            JOptionPane.showMessageDialog(null , "Record edited successfully!", "Record Edited", JOptionPane.INFORMATION_MESSAGE);
            
            stmt.close();
            conn.close();
        }
        catch(SQLException ex){
            System.err.println("DATABASE ERROR! " + ex.toString());
        }
    }
    
    public void delFHRecord(int FID){
        Connection conn = null;
        CallableStatement stmt = null; 
        
        try{
            conn = connectToDatabase();
            stmt = conn.prepareCall("{CALL DeleteFamilyHistory(?)}");
            stmt.setInt(1, FID);
            
            stmt.execute();
            JOptionPane.showMessageDialog(null , "Record deleted successfully!", "Record Deleted", JOptionPane.INFORMATION_MESSAGE);
            
            stmt.close();
            conn.close();
        }
        catch(SQLException ex){
            System.err.println("DATABASE ERROR! " + ex.toString());
        }
    }
    
    public void displayFH(int PID, javax.swing.JTable table){
        Connection conn = null;
        CallableStatement stmt = null;
        
        try{
            conn = connectToDatabase();
            
            stmt = conn.prepareCall("{CALL getFamilyHistory(?)}");
            stmt.setInt(1, PID);
            
            ResultSet tblVals = stmt.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            model.setRowCount(0);
            
            while (tblVals.next()){
                model.addRow(new Object[]{
                    tblVals.getInt("FamilyID"),
                    tblVals.getInt("PatientID"),
                    tblVals.getString("Name"),
                    tblVals.getString("Relation"),
                    tblVals.getInt("Alive"),
                    tblVals.getInt("Lives with patient"),
                    tblVals.getString("MajorDisorder"),
                    tblVals.getString("SpecificTypeDisorder"),
                    tblVals.getInt("DisorderHRF"),
                    tblVals.getInt("deleted")
                });
            }
            
            conn.close();
        }
        catch(SQLException ex){
            System.err.println("DATABASE ERROR!");
        }      
    }
}
