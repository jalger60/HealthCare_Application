
package healthcare_application.DBUtils;

import java.sql.*;
import healthcare_application.Patient_Demographics;
public class Patient_Demographics_DBOperations {
    
    public Patient_Demographics getPatientDemographics(int patientID) {
        Patient_Demographics patient = new Patient_Demographics();
        
        Connection con = PatientSelection_DBOperations.connectToDatabase();
        if (con != null) {
            CallableStatement stmt = null;
            ResultSet rs = null;
            try {
                // Call the stored procedure SelectPatientDemographics with the PatientID as parameter
                String storedProc = "{CALL GetPatientDemographics(?)}";
                stmt = con.prepareCall(storedProc);
                stmt.setInt(1, patientID);  // Set the PatientID parameter

                // Execute the stored procedure
                rs = stmt.executeQuery();

                // Process the result set
                if (rs.next()) {
                    // Set the fields with the retrieved values
                    patient.setTxt_LastName(rs.getString("PtLastName"));
                    patient.setTxt_PreLastName(rs.getString("PtPreviousLastName"));
                    patient.setTxt_FirstName(rs.getString("PtFirstName"));
                    patient.setTxt_HomeAddress(rs.getString("HomeAddress1"));
                    patient.setTxt_City(rs.getString("HomeCity"));
                    patient.setCbox_State(rs.getString("HomeState/Province/Region"));
                    patient.setTxt_ZipCode(rs.getString("HomeZip"));
                    patient.setCbox_Country(rs.getString("Country"));
                    patient.setCbox_Citizenship(rs.getString("Citizenship"));
                    patient.setTxt_MobilePhone(rs.getString("PtMobilePhone"));
                    patient.setTxt_Em_Phone_Num(rs.getString("EmergencyPhoneNumber"));
                    patient.setTxt_Email(rs.getString("EmailAddress"));
                    patient.setPass_SSN(rs.getString("PtSS#"));
                    patient.setDatechooser_DOB(rs.getDate("DOB"));
                    patient.setCbox_Gender(rs.getString("Gender"));
                    patient.setCbox_Ethnicity(rs.getString("EthnicAssociation"));
                    patient.setCbox_Martial_Status(rs.getString("MaritalStatus"));
                    patient.setTxtA_CurrentHCP(rs.getString("CurrentPrimaryHCP"));
                    patient.setTxtA_Comments(rs.getString("Comments"));
                    patient.setTxt_NOKR(rs.getString("NextOfKin"));
                    patient.setTxt_Next_of_kin(rs.getString("NextOfKinRelationshipToPatient"));
                } else {
                    System.out.println("No patient found with ID: " + patientID);
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
            System.out.println("Connection to the database failed!");
        }
        
        return patient;
    }
    
}
