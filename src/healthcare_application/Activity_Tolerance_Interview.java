
package healthcare_application;

import General_Functionality.*;
import healthcare_application.DBUtils.Activity_Tolerance_Assessment_Auto_Interview;
import java.awt.Color;
import java.sql.*;
import healthcare_application.DBUtils.Activity_Tolerance_Assessment_DBOperations;
import healthcare_application.DBUtils.GMH_DBOperations;
import healthcare_application.DBUtils.Patient_Demographics_DBOperations;
import static healthcare_application.Patient_Selection.getPatientID;
import healthcare_application.Validation.ActivityTolerance_Validation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import healthcare_application.*;

public class Activity_Tolerance_Interview extends javax.swing.JFrame {
    
    private int patientID;
    private int RecordID;
    private String PName;
    
    public Activity_Tolerance_Interview() {
        initComponents();
        this.setTitle("Activity Tolerance Interview");
        User_Modes.View_Only_Mode(this);
        User_Modes.View_Only_Message(this);
    }
    
    public Activity_Tolerance_Interview(int patientID, String PName) {
        setPatientID(patientID);
        setPName(PName);
        
        initComponents();
        this.setTitle("Activity Tolerance Interview");
        initializeTable();
 
        User_Modes.View_Only_Mode(this);
        User_Modes.View_Only_Message(this);
    }
    
    private void refreshForm() {
        this.dispose(); // Close current form
        new Activity_Tolerance_Interview(getPatientID(), getPName()).setVisible(true); 
    }
    
    public int getPatientID() {
        return this.patientID;
    }
    
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    
    public String getPName(){
        return this.PName;
    }
    
    public void setPName(String PName){
        this.PName = PName;
    }
    
    public int getRecordID() {
        return this.RecordID;
    }
    
    public void setRecordID(int RecordID) {
        this.RecordID = RecordID;
    }
    
    // Getter and Setter for cbox_ClimbStairs (returns selected value as String)
    public String getCbox_ClimbStairs() {
        return (String) cbox_ClimbStairs.getSelectedItem();
    }

    public void setCbox_ClimbStairs(String value) {
        cbox_ClimbStairs.setSelectedItem(value);
    }

    // Getter and Setter for cbox_Dressed (returns selected value as String)
    public String getCbox_Dressed() {
        return (String) cbox_Dressed.getSelectedItem();
    }

    public void setCbox_Dressed(String value) {
        cbox_Dressed.setSelectedItem(value);
    }

    // Getter and Setter for cbox_Drinking (returns selected value as String)
    public String getCbox_Drinking() {
        return (String) cbox_Drinking.getSelectedItem();
    }

    public void setCbox_Drinking(String value) {
        cbox_Drinking.setSelectedItem(value);
    }

    // Getter and Setter for cbox_Eating (returns selected value as String)
    public String getCbox_Eating() {
        return (String) cbox_Eating.getSelectedItem();
    }

    public void setCbox_Eating(String value) {
        cbox_Eating.setSelectedItem(value);
    }

    // Getter and Setter for cbox_House (returns selected value as String)
    public String getCbox_House() {
        return (String) cbox_House.getSelectedItem();
    }

    public void setCbox_House(String value) {
        cbox_House.setSelectedItem(value);
    }

    // Getter and Setter for txt_NumStairs (returns the value as an int if it's not null)
    public Integer getTxt_NumStairs() {
        try {
            String text = txt_NumStairs.getText();
            if (text != null && !text.isEmpty()) {
                return Integer.valueOf(text);
            }
        } catch (NumberFormatException e) {
            // Return a default value (e.g., 0) if the conversion fails or text is not a valid integer
            System.err.println(e);
        }
        return null; // Default value if not a valid integer
    }

    public void setTxt_NumStairs(int value) {
        txt_NumStairs.setText(String.valueOf(value));
    }
    
    public String getSelectedATDate() {
        int selectedRow = tabl_Activity.getSelectedRow();
        if (selectedRow != -1) {
            return tabl_Activity.getValueAt(selectedRow, 0).toString(); // Adjust index if necessary
        }
        return null; // No row selected
    }

    // Method to get SOB Time from the selected row
    public String getSelectedATTime() {
        int selectedRow = tabl_Activity.getSelectedRow();
        if (selectedRow != -1) {
            return tabl_Activity.getValueAt(selectedRow, 1).toString(); // Adjust index if necessary
        }
        return null; // No row selected
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_AT_Title = new javax.swing.JLabel();
        panel_ATA = new javax.swing.JPanel();
        lbl_ATEating = new javax.swing.JLabel();
        lbl_ATDrinking = new javax.swing.JLabel();
        lbl_ATDressing = new javax.swing.JLabel();
        lbl_ATWalking_House = new javax.swing.JLabel();
        lbl_ATClimbing_Stairs = new javax.swing.JLabel();
        lbl_ATClimb1_steps = new javax.swing.JLabel();
        cbox_Eating = new javax.swing.JComboBox<>();
        cbox_Drinking = new javax.swing.JComboBox<>();
        cbox_Dressed = new javax.swing.JComboBox<>();
        cbox_House = new javax.swing.JComboBox<>();
        cbox_ClimbStairs = new javax.swing.JComboBox<>();
        txt_NumStairs = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabl_Activity = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_SOBA = new javax.swing.JMenu();
        patientSelectNavBtn = new javax.swing.JMenuItem();
        patientDemoNavBtn = new javax.swing.JMenuItem();
        immunizationsNavBtn = new javax.swing.JMenuItem();
        GMHNavBtn = new javax.swing.JMenuItem();
        familyHistoryNavBtn = new javax.swing.JMenuItem();
        SoBNavBtn = new javax.swing.JMenuItem();
        activityToleranceNavBtn = new javax.swing.JMenuItem();
        menu_ATAOptions = new javax.swing.JMenu();
        menu_Add_Record = new javax.swing.JMenuItem();
        menu_Edit_Record = new javax.swing.JMenuItem();
        menu_Save_Record = new javax.swing.JMenuItem();
        menu_Delete_Record = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_AT_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_AT_Title.setText("Activitiy Tolerance Assessment");

        lbl_ATEating.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_ATEating.setText("Have Trouble Eating Food");

        lbl_ATDrinking.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_ATDrinking.setText("Have Trouble Drinking Liquids");

        lbl_ATDressing.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_ATDressing.setText("Have Trouble Getting Dressed");

        lbl_ATWalking_House.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_ATWalking_House.setText("Have Trouble Walking around the House");

        lbl_ATClimbing_Stairs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_ATClimbing_Stairs.setText("Have Trouble Climbing Stairs");

        lbl_ATClimb1_steps.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_ATClimb1_steps.setText("How many steps are you able to climb ");

        cbox_Eating.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_Eating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Yes", "No" }));

        cbox_Drinking.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_Drinking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Yes", "No" }));

        cbox_Dressed.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_Dressed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Yes", "No" }));

        cbox_House.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_House.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Yes", "No" }));

        cbox_ClimbStairs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_ClimbStairs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Yes", "No" }));

        txt_NumStairs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout panel_ATALayout = new javax.swing.GroupLayout(panel_ATA);
        panel_ATA.setLayout(panel_ATALayout);
        panel_ATALayout.setHorizontalGroup(
            panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ATALayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_ATALayout.createSequentialGroup()
                        .addComponent(lbl_ATDressing)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_Dressed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ATALayout.createSequentialGroup()
                        .addComponent(lbl_ATDrinking)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_Drinking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ATALayout.createSequentialGroup()
                        .addComponent(lbl_ATClimbing_Stairs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_ClimbStairs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ATALayout.createSequentialGroup()
                        .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_ATALayout.createSequentialGroup()
                                .addComponent(lbl_ATEating)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbox_Eating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_ATWalking_House))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_House, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ATALayout.createSequentialGroup()
                        .addComponent(lbl_ATClimb1_steps)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_NumStairs)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        panel_ATALayout.setVerticalGroup(
            panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ATALayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ATEating)
                    .addComponent(cbox_Eating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ATDrinking)
                    .addComponent(cbox_Drinking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ATDressing)
                    .addComponent(cbox_Dressed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ATWalking_House)
                    .addComponent(cbox_House, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ATClimbing_Stairs)
                    .addComponent(cbox_ClimbStairs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ATClimb1_steps)
                    .addComponent(txt_NumStairs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        tabl_Activity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Time"
            }
        ));
        jScrollPane1.setViewportView(tabl_Activity);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menu_SOBA.setText("Forms");

        patientSelectNavBtn.setText("Patient Selection");
        patientSelectNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSelectNavBtnActionPerformed(evt);
            }
        });
        menu_SOBA.add(patientSelectNavBtn);

        patientDemoNavBtn.setText("Patient Demographics");
        patientDemoNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDemoNavBtnActionPerformed(evt);
            }
        });
        menu_SOBA.add(patientDemoNavBtn);

        immunizationsNavBtn.setText("Immunizations");
        immunizationsNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                immunizationsNavBtnActionPerformed(evt);
            }
        });
        menu_SOBA.add(immunizationsNavBtn);

        GMHNavBtn.setText("General Medical History");
        GMHNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GMHNavBtnActionPerformed(evt);
            }
        });
        menu_SOBA.add(GMHNavBtn);

        familyHistoryNavBtn.setText("Family History");
        familyHistoryNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyHistoryNavBtnActionPerformed(evt);
            }
        });
        menu_SOBA.add(familyHistoryNavBtn);

        SoBNavBtn.setText("Shortness of Breath Assessment");
        SoBNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoBNavBtnActionPerformed(evt);
            }
        });
        menu_SOBA.add(SoBNavBtn);

        activityToleranceNavBtn.setText("Activity Tolerance Assessment");
        activityToleranceNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityToleranceNavBtnActionPerformed(evt);
            }
        });
        menu_SOBA.add(activityToleranceNavBtn);

        jMenuBar1.add(menu_SOBA);

        menu_ATAOptions.setText("Actions");
        menu_ATAOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ATAOptionsActionPerformed(evt);
            }
        });

        menu_Add_Record.setText("Add Record");
        menu_Add_Record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Add_RecordActionPerformed(evt);
            }
        });
        menu_ATAOptions.add(menu_Add_Record);

        menu_Edit_Record.setText("Edit Record");
        menu_Edit_Record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Edit_RecordActionPerformed(evt);
            }
        });
        menu_ATAOptions.add(menu_Edit_Record);

        menu_Save_Record.setText("Save Record");
        menu_Save_Record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Save_RecordActionPerformed(evt);
            }
        });
        menu_ATAOptions.add(menu_Save_Record);

        menu_Delete_Record.setText("Delete Record");
        menu_Delete_Record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Delete_RecordActionPerformed(evt);
            }
        });
        menu_ATAOptions.add(menu_Delete_Record);

        jMenuBar1.add(menu_ATAOptions);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(294, Short.MAX_VALUE)
                .addComponent(lbl_AT_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_ATA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lbl_AT_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_ATA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SoBNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoBNavBtnActionPerformed

        // Create an instance of Shortness_of_Breath_Interview and pass the patientID
        Shortness_of_Breath_Interview sobaInterviewForm = new Shortness_of_Breath_Interview(getPatientID(), getPName());
        
        //Log user moving to new form
        LoggerUtility.logFormChange(sobaInterviewForm, PName);
        // Set the form to be visible
        sobaInterviewForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SoBNavBtnActionPerformed

    private void menu_Edit_RecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Edit_RecordActionPerformed
//        UnlockScreen();
        LoggerUtility.logUserAction("edit", PName);
        User_Modes.Edit_Mode(this);
        User_Modes.Edit_Message(this);
    }//GEN-LAST:event_menu_Edit_RecordActionPerformed

    private void menu_Add_RecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Add_RecordActionPerformed
        LoggerUtility.logUserAction("add", PName);
        Activity_Tolerance_Assessment_Auto_Interview.conductInterview(patientID, PName);
        refreshForm();
    }//GEN-LAST:event_menu_Add_RecordActionPerformed

    private void menu_Save_RecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Save_RecordActionPerformed
        LoggerUtility.logUserAction("save", PName);
        String num_Steps = txt_NumStairs.getText();
        // Treat null or empty input as acceptable 
        if (num_Steps == null || num_Steps.trim().isEmpty()) {
           
            
        } else {
            try {
                ActivityTolerance_Validation.validateDigitsOnly(num_Steps);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Data Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        Activity_Tolerance_Assessment_DBOperations.editActivityToleranceByPatient(getRecordID(), patientID, this);
        System.out.println(getRecordID());
        refreshForm();

    }//GEN-LAST:event_menu_Save_RecordActionPerformed

    private void menu_Delete_RecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Delete_RecordActionPerformed
        LoggerUtility.logUserAction("delete", PName);
        Activity_Tolerance_Assessment_DBOperations.deleteATAssessment(getRecordID(), patientID);

    }//GEN-LAST:event_menu_Delete_RecordActionPerformed

    private void patientSelectNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSelectNavBtnActionPerformed
            Patient_Selection patient_select = new Patient_Selection(getPatientID(), getPName());
            LoggerUtility.logFormChange(patient_select, PName);
            patient_select.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_patientSelectNavBtnActionPerformed

    private void patientDemoNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDemoNavBtnActionPerformed
        Patient_Demographics_DBOperations operations = new Patient_Demographics_DBOperations();
        Patient_Demographics patient = operations.getPatientDemographics(getPatientID());
        LoggerUtility.logFormChange(patient, PName);
            if (patient != null) {
                patient.setVisible(true);
                patient.setPatientIDPD(getPatientID());
                patient.setPName(getPName());
            } else {
                JOptionPane.showMessageDialog(this, "No patient data found!", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_patientDemoNavBtnActionPerformed

    private void GMHNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GMHNavBtnActionPerformed
        GMH_DBOperations gmho = new GMH_DBOperations();
        General_Medical_History history = gmho.getGeneralMedicalHistory(getPatientID());
        history.setPName(getPName());
        LoggerUtility.logFormChange(history, PName);
        history.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GMHNavBtnActionPerformed

    private void immunizationsNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_immunizationsNavBtnActionPerformed
        Immunizations newImmunizations = new Immunizations(getPatientID(), getPName());
        LoggerUtility.logFormChange(newImmunizations, PName);
        newImmunizations.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_immunizationsNavBtnActionPerformed

    private void familyHistoryNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyHistoryNavBtnActionPerformed
        Family_History newFamilyHistory = new Family_History(getPatientID(), getPName());
        LoggerUtility.logFormChange(newFamilyHistory, PName);
        newFamilyHistory.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_familyHistoryNavBtnActionPerformed

    private void activityToleranceNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityToleranceNavBtnActionPerformed
        // TODO add your handling code here:
        Activity_Tolerance_Interview newATI = new Activity_Tolerance_Interview(getPatientID(), getPName());
        LoggerUtility.logFormChange(newATI, PName);
        newATI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_activityToleranceNavBtnActionPerformed

    private void menu_ATAOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ATAOptionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_ATAOptionsActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Activity_Tolerance_Interview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Activity_Tolerance_Interview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Activity_Tolerance_Interview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Activity_Tolerance_Interview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Activity_Tolerance_Interview().setVisible(true);
            }
        });
    }
    
    

    
    private void initializeTable() {
        // Call the PatientDBUtils method to get the ResultSet
        ResultSet rs = Activity_Tolerance_Assessment_DBOperations.PatientDBUtils(patientID);

        if (rs != null) {


            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Make all cells non-editable
                }
            };

            model.addColumn("Date");
            model.addColumn("Time");
            model.addColumn("Trouble Eating");
            model.addColumn("Trouble Drinking");
            model.addColumn("Trouble Getting Dressed");
            model.addColumn("Trouble Walking around the House");
            model.addColumn("Trouble Climbing Stairs");
            model.addColumn("Number of Stairs");
            model.addColumn("Record ID");

            // Store data for comboboxes in a list or map for later use
            List<Object[]> rowDataList = new ArrayList<>();

            // Populate table with result set data
            try {
                while (rs.next()) {
                    Object[] row = new Object[9];
                    row[0] = rs.getString("Date");
                    row[1] = rs.getString("Time");
                    row[2] = rs.getString("TroubleEating");
                    row[3] = rs.getString("TroubleDrinking");
                    row[4] = rs.getString("TroubleGettingDressed");
                    row[5] = rs.getString("TroubleWalkingAroundHouse");
                    row[6] = rs.getString("TroubleClimbingStairs");
                    row[7] = rs.getObject("Number_Of_Stairs");
                    row[8] = rs.getInt("Record ID");

                    // Add row to model
                    model.addRow(row);

                    // Store data in the list for future reference
                    rowDataList.add(row);
                }

                // Set the model to the existing JTable
                tabl_Activity.setModel(model);

                // Hide the columns (indexes 2 to 7)
                tabl_Activity.getColumnModel().getColumn(2).setMaxWidth(0);
                tabl_Activity.getColumnModel().getColumn(2).setMinWidth(0);
                tabl_Activity.getColumnModel().getColumn(2).setPreferredWidth(0);

                tabl_Activity.getColumnModel().getColumn(3).setMaxWidth(0);
                tabl_Activity.getColumnModel().getColumn(3).setMinWidth(0);
                tabl_Activity.getColumnModel().getColumn(3).setPreferredWidth(0);

                tabl_Activity.getColumnModel().getColumn(4).setMaxWidth(0);
                tabl_Activity.getColumnModel().getColumn(4).setMinWidth(0);
                tabl_Activity.getColumnModel().getColumn(4).setPreferredWidth(0);

                tabl_Activity.getColumnModel().getColumn(5).setMaxWidth(0);
                tabl_Activity.getColumnModel().getColumn(5).setMinWidth(0);
                tabl_Activity.getColumnModel().getColumn(5).setPreferredWidth(0);

                tabl_Activity.getColumnModel().getColumn(6).setMaxWidth(0);
                tabl_Activity.getColumnModel().getColumn(6).setMinWidth(0);
                tabl_Activity.getColumnModel().getColumn(6).setPreferredWidth(0);

                tabl_Activity.getColumnModel().getColumn(7).setMaxWidth(0);
                tabl_Activity.getColumnModel().getColumn(7).setMinWidth(0);
                tabl_Activity.getColumnModel().getColumn(7).setPreferredWidth(0);

                tabl_Activity.getColumnModel().getColumn(8).setMaxWidth(0);
                tabl_Activity.getColumnModel().getColumn(8).setMinWidth(0);
                tabl_Activity.getColumnModel().getColumn(8).setPreferredWidth(0);

                // Add ListSelectionListener to the JTable to capture selection changes
                tabl_Activity.getSelectionModel().addListSelectionListener(e -> {
                    if (!e.getValueIsAdjusting()) {  // Check if the selection has changed
                        int selectedRow = tabl_Activity.getSelectedRow();
                        if (selectedRow != -1 && selectedRow < rowDataList.size()) {
                            // Get the values of the selected row from the stored list
                            Object[] selectedRowData = rowDataList.get(selectedRow);
                            String date = (String) selectedRowData[0];
                            String time = (String) selectedRowData[1];
                            String troubleEating = (String) selectedRowData[2];
                            String troubleDrinking = (String) selectedRowData[3];
                            String troubleGettingDressed = (String) selectedRowData[4];
                            String troubleWalking = (String) selectedRowData[5];
                            String troubleClimbing = (String) selectedRowData[6];
                            Object stairsValue = selectedRowData[7];
                            RecordID = (int) selectedRowData[8];  // Get the Record ID from the row data

                            setRecordID(RecordID);

                            // Populate the JComboBox components with values from the selected record
                            cbox_Eating.setSelectedItem(troubleEating);  // Trouble Eating
                            cbox_Drinking.setSelectedItem(troubleDrinking);  // Trouble Drinking
                            cbox_Dressed.setSelectedItem(troubleGettingDressed);  // Trouble Getting Dressed
                            cbox_House.setSelectedItem(troubleWalking);  // Trouble Walking Around House
                            cbox_ClimbStairs.setSelectedItem(troubleClimbing);  // Trouble Climbing Stairs

                            // Handle the "Number of Stairs" field (null check)
                            if (stairsValue != null) {
                                txt_NumStairs.setText(stairsValue.toString());
                            } else {
                                txt_NumStairs.setText("");  // Leave empty if null
                            }
                        }
                    }
                });

            } catch (SQLException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(this, "Error processing data: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error retrieving data from database.");
        }
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GMHNavBtn;
    private javax.swing.JMenuItem SoBNavBtn;
    private javax.swing.JMenuItem activityToleranceNavBtn;
    private javax.swing.JComboBox<String> cbox_ClimbStairs;
    private javax.swing.JComboBox<String> cbox_Dressed;
    private javax.swing.JComboBox<String> cbox_Drinking;
    private javax.swing.JComboBox<String> cbox_Eating;
    private javax.swing.JComboBox<String> cbox_House;
    private javax.swing.JMenuItem familyHistoryNavBtn;
    private javax.swing.JMenuItem immunizationsNavBtn;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ATClimb1_steps;
    private javax.swing.JLabel lbl_ATClimbing_Stairs;
    private javax.swing.JLabel lbl_ATDressing;
    private javax.swing.JLabel lbl_ATDrinking;
    private javax.swing.JLabel lbl_ATEating;
    private javax.swing.JLabel lbl_ATWalking_House;
    private javax.swing.JLabel lbl_AT_Title;
    private javax.swing.JMenu menu_ATAOptions;
    private javax.swing.JMenuItem menu_Add_Record;
    private javax.swing.JMenuItem menu_Delete_Record;
    private javax.swing.JMenuItem menu_Edit_Record;
    private javax.swing.JMenu menu_SOBA;
    private javax.swing.JMenuItem menu_Save_Record;
    private javax.swing.JPanel panel_ATA;
    private javax.swing.JMenuItem patientDemoNavBtn;
    private javax.swing.JMenuItem patientSelectNavBtn;
    private javax.swing.JTable tabl_Activity;
    private javax.swing.JTextField txt_NumStairs;
    // End of variables declaration//GEN-END:variables
}
