package healthcare_application;

import General_Functionality.LoggerUtility;
import javax.swing.table.DefaultTableModel;
import healthcare_application.DBUtils.PatientSelection_DBOperations;
import healthcare_application.DBUtils.Patient_Demographics_DBOperations;
import healthcare_application.DBUtils.GMH_DBOperations;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import java.awt.Font;

public class Patient_Selection extends javax.swing.JFrame {

    private static int PatientID;
    private static String PName;
    
    public Patient_Selection() {
        initComponents();
        this.setTitle("Patient Selection");
        GetAllPatients();
    }
    
    public Patient_Selection(int PatientID, String PName){
        initComponents();
        this.setTitle("Patient Selection");
        setPatientID(PatientID);
        setPName(PName);
        GetAllPatients();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_PSelect_Title = new javax.swing.JLabel();
        panel_PSelect = new javax.swing.JPanel();
        lbl_Search = new javax.swing.JLabel();
        txt_Search_Box = new javax.swing.JTextField();
        cbox_Search_Box = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabl_Patient_Table = new javax.swing.JTable();
        btn_Search = new javax.swing.JButton();
        btn_BackToAll = new javax.swing.JButton();
        btn_New_Patient = new javax.swing.JButton();
        menu_PSelect_Bar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        patientSelectNavBtn = new javax.swing.JMenuItem();
        patientDemographicsNavBtn = new javax.swing.JMenuItem();
        immunizationsNavBtn = new javax.swing.JMenuItem();
        GMHNavBtn = new javax.swing.JMenuItem();
        familyHistoryNavBtn = new javax.swing.JMenuItem();
        SoBNavBtn = new javax.swing.JMenuItem();
        activityToleranceNavBtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_PSelect_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_PSelect_Title.setText("Patient Selection ");

        lbl_Search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Search.setText("Search Patients");

        txt_Search_Box.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cbox_Search_Box.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_Search_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Last Name" }));

        tabl_Patient_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabl_Patient_Table);

        btn_Search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Search.setText("Search ");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        btn_BackToAll.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_BackToAll.setText("Back To All Results");
        btn_BackToAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackToAllActionPerformed(evt);
            }
        });

        btn_New_Patient.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_New_Patient.setText("Enter New Patient");
        btn_New_Patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_New_PatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_PSelectLayout = new javax.swing.GroupLayout(panel_PSelect);
        panel_PSelect.setLayout(panel_PSelectLayout);
        panel_PSelectLayout.setHorizontalGroup(
            panel_PSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PSelectLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(btn_New_Patient)
                .addGap(34, 34, 34))
            .addGroup(panel_PSelectLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(lbl_Search)
                .addGap(18, 18, 18)
                .addComponent(txt_Search_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbox_Search_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_BackToAll)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel_PSelectLayout.setVerticalGroup(
            panel_PSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PSelectLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_PSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbox_Search_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Search_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Search)
                    .addComponent(btn_Search)
                    .addComponent(btn_BackToAll))
                .addGap(28, 28, 28)
                .addGroup(panel_PSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_New_Patient))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        menu_PSelect_Bar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu1.setText("Switch Pages");

        patientSelectNavBtn.setText("Patient Selection");
        patientSelectNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSelectNavBtnActionPerformed(evt);
            }
        });
        jMenu1.add(patientSelectNavBtn);

        patientDemographicsNavBtn.setText("Patient Demographics");
        patientDemographicsNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDemographicsNavBtnActionPerformed(evt);
            }
        });
        jMenu1.add(patientDemographicsNavBtn);

        immunizationsNavBtn.setText("Immunizations");
        immunizationsNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                immunizationsNavBtnActionPerformed(evt);
            }
        });
        jMenu1.add(immunizationsNavBtn);

        GMHNavBtn.setText("General Medical History");
        GMHNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GMHNavBtnActionPerformed(evt);
            }
        });
        jMenu1.add(GMHNavBtn);

        familyHistoryNavBtn.setText("Family History");
        familyHistoryNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyHistoryNavBtnActionPerformed(evt);
            }
        });
        jMenu1.add(familyHistoryNavBtn);

        SoBNavBtn.setText("Shortness of Breath Assessment");
        SoBNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoBNavBtnActionPerformed(evt);
            }
        });
        jMenu1.add(SoBNavBtn);

        activityToleranceNavBtn.setText("Activity Tolerance Assessment");
        activityToleranceNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityToleranceNavBtnActionPerformed(evt);
            }
        });
        jMenu1.add(activityToleranceNavBtn);

        menu_PSelect_Bar.add(jMenu1);

        setJMenuBar(menu_PSelect_Bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panel_PSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_PSelect_Title)
                        .addGap(350, 350, 350))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lbl_PSelect_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_PSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void activityToleranceNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityToleranceNavBtnActionPerformed
        Activity_Tolerance_Interview ATA = new  Activity_Tolerance_Interview(getPatientID(), getPName());
        ATA.setVisible(true);
        LoggerUtility.logFormChange(ATA, PName);
        this.dispose();
    }//GEN-LAST:event_activityToleranceNavBtnActionPerformed

    private void SoBNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoBNavBtnActionPerformed
        

        // Create an instance of Shortness_of_Breath_Interview and pass the patientID
        Shortness_of_Breath_Interview sobaInterviewForm = new Shortness_of_Breath_Interview(getPatientID(), getPName());
        // Set the form to be visible
        sobaInterviewForm.setVisible(true);
        LoggerUtility.logFormChange(sobaInterviewForm, PName);
        this.dispose();
       
        
     
    }//GEN-LAST:event_SoBNavBtnActionPerformed

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        performSearch();
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void patientDemographicsNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDemographicsNavBtnActionPerformed
        Patient_Demographics_DBOperations operations = new Patient_Demographics_DBOperations();
        
        Patient_Demographics patient = operations.getPatientDemographics(getPatientID());
            if (patient != null) {
                patient.setVisible(true);
                LoggerUtility.logFormChange(patient, PName);
                patient.setPatientIDPD(getPatientID());
                patient.setPName(getPName());
            } else {
                JOptionPane.showMessageDialog(this, "No patient data found!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        // Close the current form
        this.dispose();
        
        
    }//GEN-LAST:event_patientDemographicsNavBtnActionPerformed

    private void btn_BackToAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackToAllActionPerformed
        GetAllPatients();
        
    }//GEN-LAST:event_btn_BackToAllActionPerformed

    private void GMHNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GMHNavBtnActionPerformed
        GMH_DBOperations gmho = new GMH_DBOperations();
        General_Medical_History history = gmho.getGeneralMedicalHistory(PatientID);
        history.setPName(PName);
        history.setVisible(true);
        LoggerUtility.logFormChange(history, PName);
        this.dispose();
    }//GEN-LAST:event_GMHNavBtnActionPerformed

    private void immunizationsNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_immunizationsNavBtnActionPerformed
        Immunizations immunizations = new Immunizations(getPatientID(), getPName());
        immunizations.setVisible(true);
        LoggerUtility.logFormChange(immunizations, PName);
        this.dispose();
    }//GEN-LAST:event_immunizationsNavBtnActionPerformed

    private void patientSelectNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSelectNavBtnActionPerformed
        // TODO add your handling code here:
        Patient_Selection newPS = new Patient_Selection(getPatientID(), getPName());
        newPS.setVisible(true);
        LoggerUtility.logFormChange(newPS, PName);
        this.dispose();
    }//GEN-LAST:event_patientSelectNavBtnActionPerformed

    private void familyHistoryNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyHistoryNavBtnActionPerformed
        // TODO add your handling code here:
        Family_History newFH = new Family_History(getPatientID(), getPName());
        newFH.setVisible(true);
        LoggerUtility.logFormChange(newFH, PName);
        this.dispose();
    }//GEN-LAST:event_familyHistoryNavBtnActionPerformed

    private void btn_New_PatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_New_PatientActionPerformed
        setPatientID(0);
        // No patient selected, open a blank Patient_Demographics form for a new patient
        Patient_Demographics newPatientForm = new Patient_Demographics();
        newPatientForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_New_PatientActionPerformed

    public String GetTxt_Search_BoxText() {
        return txt_Search_Box.getText();
    }
    
    public static int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int patientID) {
        this.PatientID = patientID;
    }
    
    public static String getPName(){
        return PName;
    }
    
    public void setPName(String PName){
        this.PName = PName;
    }

    public void setPName(String FPName, String LPName){
        this.PName = FPName + " " + LPName;
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_Selection().setVisible(true);
            }
        });
        
          
        
    }
    
    private void performSearch() {
        String searchText = txt_Search_Box.getText();
        PatientSelection_DBOperations dbOperations = new PatientSelection_DBOperations();
        DefaultTableModel table = dbOperations.SearchforPatients(searchText);

        // Directly set the model without modifying columns again
        tabl_Patient_Table.setModel(table);

        JTableHeader header = tabl_Patient_Table.getTableHeader();
        header.setFont(header.getFont().deriveFont(Font.BOLD));

        // Check if the table has rows before adding selection listener
        if (tabl_Patient_Table.getRowCount() > 0) {
            tabl_Patient_Table.getSelectionModel().addListSelectionListener(event -> {
                if (!event.getValueIsAdjusting()) { // Prevent duplicate triggering
                    int selectedRow = tabl_Patient_Table.getSelectedRow();

                    if (selectedRow != -1) { // Ensure a row is selected
                        int patientIDColumnIndex = 0; // Index of "Patient ID" column

                        Object patientIDValue = tabl_Patient_Table.getValueAt(selectedRow, patientIDColumnIndex);
                        Object PFName = tabl_Patient_Table.getValueAt(selectedRow, 1);
                        Object PLName = tabl_Patient_Table.getValueAt(selectedRow, 2);

                        if (patientIDValue != null) {
                            try {
                                int patientID = Integer.parseInt(patientIDValue.toString());
                                setPatientID(patientID); // Store the selected Patient ID
                                setPName(PFName.toString(), PLName.toString());
                                LoggerUtility.initialize(patientID);
                                System.out.println("Selected Patient ID: " + getPatientID());
                                System.out.println("Selected Patient Name: " + getPName());
                            } catch (NumberFormatException e) {
                                System.err.println("Invalid Patient ID format: " + e.getMessage());
                            }
                        }
                    }
                }
            });
        }
    }


    
    private void GetAllPatients() {
        PatientSelection_DBOperations dbOperations = new PatientSelection_DBOperations();
        DefaultTableModel tableModel = dbOperations.SearchforAllPatients();

        // Set the table model and refresh the table
        tabl_Patient_Table.setModel(tableModel);
        JTableHeader header = tabl_Patient_Table.getTableHeader();
        header.setFont(header.getFont().deriveFont(Font.BOLD));

        // Ensure row selection event triggers
        tabl_Patient_Table.getSelectionModel().addListSelectionListener(event -> {
            if (!event.getValueIsAdjusting()) { // Prevent double triggering
                int selectedRow = tabl_Patient_Table.getSelectedRow();
                if (selectedRow != -1) { 
                    Object patientIDValue = tabl_Patient_Table.getValueAt(selectedRow, 0); // Patient ID column
                    Object PFName = tabl_Patient_Table.getValueAt(selectedRow, 1);
                    Object PLName = tabl_Patient_Table.getValueAt(selectedRow, 2);

                    if (patientIDValue != null) {
                        try {
                            int patientID = Integer.parseInt(patientIDValue.toString());
                            setPatientID(patientID); // Store the selected Patient ID
                            setPName(PFName.toString(), PLName.toString());
                            LoggerUtility.initialize(patientID);
                        } catch (NumberFormatException e) {
                            System.err.println("Invalid Patient ID format: " + e.getMessage());
                        }
                    }
                }
            }
        });
    }

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GMHNavBtn;
    private javax.swing.JMenuItem SoBNavBtn;
    private javax.swing.JMenuItem activityToleranceNavBtn;
    private javax.swing.JButton btn_BackToAll;
    private javax.swing.JButton btn_New_Patient;
    private javax.swing.JButton btn_Search;
    private javax.swing.JComboBox<String> cbox_Search_Box;
    private javax.swing.JMenuItem familyHistoryNavBtn;
    private javax.swing.JMenuItem immunizationsNavBtn;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_PSelect_Title;
    private javax.swing.JLabel lbl_Search;
    private javax.swing.JMenuBar menu_PSelect_Bar;
    private javax.swing.JPanel panel_PSelect;
    private javax.swing.JMenuItem patientDemographicsNavBtn;
    private javax.swing.JMenuItem patientSelectNavBtn;
    private javax.swing.JTable tabl_Patient_Table;
    private javax.swing.JTextField txt_Search_Box;
    // End of variables declaration//GEN-END:variables
}
