
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

                    // Retrieve the datetime (timestamp) from the database
                    java.sql.Timestamp dobTimestamp = rs.getTimestamp("DOB"); // Gets a java.sql.Timestamp
                    if (dobTimestamp != null) { // Ensure the date is not null
                        // Convert to java.util.Date and set only the date part in JDateChooser
                        java.util.Date dobDate = new java.util.Date(dobTimestamp.getTime());
                        patient.getDatechooser_DOB().setDate(dobDate);
                    }

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
    
    public void updatePatientDemographics(int patientID) {
        Patient_Demographics patient = new Patient_Demographics();
        Connection con = PatientSelection_DBOperations.connectToDatabase();
        if (con != null) {
            CallableStatement stmt = null;
            
            try {
                // Call the stored procedure EditPatientDemographics
                String storedProc = "{CALL EditPatientDemographics(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
                stmt = con.prepareCall(storedProc);
                
                stmt.setInt(1, patientID); // Only for filtering, not updating
             
                // Set parameters - ensuring PatientID is set first
                stmt.setString(2, patient.getTxt_LastNameValue());
                stmt.setString(3, patient.getTxt_PreLastNameValue());
                stmt.setString(4, patient.getTxt_FirstNameValue());
                stmt.setString(5, patient.getTxt_HomeAddressValue());
                stmt.setString(6, patient.getTxt_CityValue());
                stmt.setString(7, patient.getCbox_StateValue());
                stmt.setString(8, patient.getTxt_ZipCodeValue());
                stmt.setString(9, patient.getCbox_CountryValue());
                stmt.setString(10, patient.getCbox_CitizenshipValue());
                stmt.setString(11, patient.getTxt_MobilePhoneValue());
                stmt.setString(12, patient.getTxt_Em_Phone_NumValue());
                stmt.setString(13, patient.getTxt_EmailValue());
                stmt.setString(14, patient.getPass_SSNValue());

                // Handle the DOB field safely
                java.util.Date dob = patient.getDatechooser_DOB().getDate();
                if (dob != null) {
                    stmt.setDate(15, new java.sql.Date(dob.getTime()));
                } else {
                    stmt.setNull(15, java.sql.Types.DATE); // In case DOB is null
                }

                stmt.setString(16, patient.getCbox_GenderValue());
                stmt.setString(17, patient.getCbox_EthnicityValue());
                stmt.setString(18, patient.getCbox_Martial_StatusValue());
                stmt.setString(19, patient.getTxtA_CurrentHCPValue());
                stmt.setString(20, patient.getTxtA_CommentsValue());
                stmt.setString(21, patient.getTxt_NOKRValue());
                stmt.setString(22, patient.getTxt_Next_of_kinValue());

                // Execute update
                stmt.executeUpdate();

            } catch (SQLException ex) {
                System.err.println("Error executing stored procedure: " + ex.getMessage());
                
            } finally {
                try {
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException ex) {
                    System.err.println("Error closing resources: " + ex.getMessage());
                }
            }
        } else {
            System.out.println("Connection to the database failed!");
            
        }
    }



    
}
