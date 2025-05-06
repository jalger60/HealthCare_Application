
package healthcare_application;


import General_Functionality.*;
import healthcare_application.DBUtils.GMH_Auto_Interview;
import healthcare_application.DBUtils.GMH_DBOperations;
import healthcare_application.DBUtils.Patient_Demographics_DBOperations;
import java.awt.Color;
import javax.swing.JOptionPane;
import healthcare_application.*;
public class General_Medical_History extends javax.swing.JFrame {

    private int patientID;
    private int gmhID;
    private String PName;
    
    public General_Medical_History() {
        initComponents();
        User_Modes.View_Only_Mode(this);
        User_Modes.View_Only_Message(this);
//        LockScreen();
    }
    
    public General_Medical_History(int patientID, String PName){
        setPatientID(patientID);
        setPName(PName);
        initComponents();
        User_Modes.View_Only_Mode(this);
        User_Modes.View_Only_Message(this);
//        LockScreen();
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenMedTitle = new javax.swing.JLabel();
        txt_Tobacco_Use = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Tob_Quantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Tob_Duration = new javax.swing.JTextField();
        txt_Alcohol_Use = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Alcohol_Quantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_Alcohol_Duration = new javax.swing.JTextField();
        txt_Drug_Use = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_Drug_Type = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_Drug_Duration = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbox_BloodType = new javax.swing.JComboBox<>();
        cbox_RH = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_Shortness_Of_Breath = new javax.swing.JMenu();
        patientSelectNavBtn = new javax.swing.JMenuItem();
        patientDemoNavBtn = new javax.swing.JMenuItem();
        immunizationsNavBtn = new javax.swing.JMenuItem();
        GMHNavBtn = new javax.swing.JMenuItem();
        familyHistoryNavBtn = new javax.swing.JMenuItem();
        activityToleranceNavBtn = new javax.swing.JMenuItem();
        SoBNavBtn = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        radio_add = new javax.swing.JRadioButtonMenuItem();
        menu_Edit = new javax.swing.JRadioButtonMenuItem();
        menu_Save = new javax.swing.JRadioButtonMenuItem();
        menu_Delete = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GenMedTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        GenMedTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenMedTitle.setText("General Medical History");

        txt_Tobacco_Use.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("*Tobacco: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Tobacco Quantity: ");

        txt_Tob_Quantity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tobacco Duration: ");

        txt_Tob_Duration.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_Alcohol_Use.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("*Alcohol: ");

        txt_Alcohol_Quantity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText(" Alcohol Quanity: ");

        txt_Alcohol_Duration.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_Drug_Use.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("*Drug: ");

        txt_Drug_Type.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Drug Type: ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Drug Duration: ");

        txt_Drug_Duration.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Alcohol Duration: ");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("*Blood Type: ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("RH: ");

        cbox_BloodType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_BloodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O", "Unknown" }));

        cbox_RH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_RH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "Unknown" }));

        jMenuBar1.setPreferredSize(new java.awt.Dimension(92, 40));

        menu_Shortness_Of_Breath.setText("Switch Pages");
        menu_Shortness_Of_Breath.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        patientSelectNavBtn.setText("Patient Selection");
        patientSelectNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSelectNavBtnActionPerformed(evt);
            }
        });
        menu_Shortness_Of_Breath.add(patientSelectNavBtn);

        patientDemoNavBtn.setText("Patient Demographics");
        patientDemoNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDemoNavBtnActionPerformed(evt);
            }
        });
        menu_Shortness_Of_Breath.add(patientDemoNavBtn);

        immunizationsNavBtn.setText("Immunizations");
        immunizationsNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                immunizationsNavBtnActionPerformed(evt);
            }
        });
        menu_Shortness_Of_Breath.add(immunizationsNavBtn);

        GMHNavBtn.setText("General Medical History");
        GMHNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GMHNavBtnActionPerformed(evt);
            }
        });
        menu_Shortness_Of_Breath.add(GMHNavBtn);

        familyHistoryNavBtn.setText("Family History");
        familyHistoryNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyHistoryNavBtnActionPerformed(evt);
            }
        });
        menu_Shortness_Of_Breath.add(familyHistoryNavBtn);

        activityToleranceNavBtn.setText("Activity Tolerance Interview");
        activityToleranceNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityToleranceNavBtnActionPerformed(evt);
            }
        });
        menu_Shortness_Of_Breath.add(activityToleranceNavBtn);

        SoBNavBtn.setText("Shortness of Breath Interview");
        SoBNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoBNavBtnActionPerformed(evt);
            }
        });
        menu_Shortness_Of_Breath.add(SoBNavBtn);

        jMenuBar1.add(menu_Shortness_Of_Breath);

        jMenu1.setText("Actions");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        radio_add.setSelected(true);
        radio_add.setText("Add Record");
        radio_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_addActionPerformed(evt);
            }
        });
        jMenu1.add(radio_add);

        menu_Edit.setSelected(true);
        menu_Edit.setText("Edit Record");
        menu_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_EditActionPerformed(evt);
            }
        });
        jMenu1.add(menu_Edit);

        menu_Save.setSelected(true);
        menu_Save.setText("Save Record");
        menu_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_SaveActionPerformed(evt);
            }
        });
        jMenu1.add(menu_Save);

        menu_Delete.setSelected(true);
        menu_Delete.setText("Delete Record");
        menu_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_DeleteActionPerformed(evt);
            }
        });
        jMenu1.add(menu_Delete);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Tobacco_Use, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Tob_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Tob_Duration, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Alcohol_Use, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Alcohol_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbox_RH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbox_BloodType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_Alcohol_Duration, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_Drug_Use, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_Drug_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_Drug_Duration, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GenMedTitle)
                .addGap(296, 296, 296))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GenMedTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_Alcohol_Duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_Drug_Use, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_Drug_Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_Drug_Duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cbox_BloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Tobacco_Use, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Tob_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_Tob_Duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_Alcohol_Use, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_Alcohol_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbox_RH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_EditActionPerformed
        LoggerUtility.logUserAction("edit", PName);
        UnLockScreen();
    }//GEN-LAST:event_menu_EditActionPerformed

    private void menu_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_SaveActionPerformed
        LoggerUtility.logUserAction("save", PName);
        GMH_DBOperations.updateGeneralMedicalHistory(this, getGMHID(), getPatientID());
        
    }//GEN-LAST:event_menu_SaveActionPerformed

    private void menu_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_DeleteActionPerformed
        LoggerUtility.logUserAction("delete", PName);
        GMH_DBOperations.deleteGeneralMedicalHistory(getGMHID(), getPatientID());
    }//GEN-LAST:event_menu_DeleteActionPerformed

    private void patientDemoNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDemoNavBtnActionPerformed
        
        Patient_Demographics_DBOperations operations = new Patient_Demographics_DBOperations();
        Patient_Demographics patient = operations.getPatientDemographics(getPatientID());
        LoggerUtility.logFormChange(patient, PName);
            if (patient != null) {
                patient.setVisible(true);
                patient.setPatientIDPD(patientID);
                patient.setPName(PName);
            } else {
                JOptionPane.showMessageDialog(this, "No patient data found!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            this.dispose();
    }//GEN-LAST:event_patientDemoNavBtnActionPerformed

    private void SoBNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoBNavBtnActionPerformed
        // Create an instance of Shortness_of_Breath_Interview and pass the patientID
        Shortness_of_Breath_Interview sobaInterviewForm = new Shortness_of_Breath_Interview(getPatientID(), getPName());
        LoggerUtility.logFormChange(sobaInterviewForm, PName);
        // Set the form to be visible
        sobaInterviewForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SoBNavBtnActionPerformed

    private void activityToleranceNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityToleranceNavBtnActionPerformed
         Activity_Tolerance_Interview ATA = new  Activity_Tolerance_Interview(getPatientID(), getPName());
        LoggerUtility.logFormChange(ATA, PName);
         ATA.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_activityToleranceNavBtnActionPerformed

    private void patientSelectNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSelectNavBtnActionPerformed
        Patient_Selection select = new Patient_Selection (getPatientID(), getPName());
        LoggerUtility.logFormChange(select, PName);
        select.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_patientSelectNavBtnActionPerformed

    private void radio_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_addActionPerformed
        LoggerUtility.logUserAction("add", PName);
        GMH_Auto_Interview.start(getPatientID(), getPName());
        GMH_DBOperations gmho = new GMH_DBOperations();
        General_Medical_History history = gmho.getGeneralMedicalHistory(patientID);
        LoggerUtility.logFormChange(history, PName);
        history.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_radio_addActionPerformed

    private void immunizationsNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_immunizationsNavBtnActionPerformed
        // TODO add your handling code here:
        Immunizations newI = new Immunizations(getPatientID(), getPName());
        LoggerUtility.logFormChange(newI, PName);
        newI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_immunizationsNavBtnActionPerformed

    private void GMHNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GMHNavBtnActionPerformed
        // TODO add your handling code here:
        General_Medical_History newGMH = new General_Medical_History(getPatientID(), getPName());
        LoggerUtility.logFormChange(newGMH, PName);
        newGMH.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GMHNavBtnActionPerformed

    private void familyHistoryNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyHistoryNavBtnActionPerformed
        // TODO add your handling code here:
        Family_History newFH = new Family_History(getPatientID(), getPName());
        LoggerUtility.logFormChange(newFH, PName);
        newFH.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_familyHistoryNavBtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(General_Medical_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(General_Medical_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(General_Medical_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(General_Medical_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new General_Medical_History().setVisible(true);
            }
        });
    }
    
    // ComboBox Getters and Setters (returning and accepting Strings)
    public String getBloodType() {
        return (String) cbox_BloodType.getSelectedItem().toString();
    }

    public void setBloodType(String bloodType) {
        cbox_BloodType.setSelectedItem(bloodType);
    }

    public String getRH() {
        return (String) cbox_RH.getSelectedItem().toString();
    }

    public void setRH(String rh) {
        cbox_RH.setSelectedItem(rh);
    }

    // TextField Getters and Setters
    public String getAlcoholDuration() {
        return txt_Alcohol_Duration.getText();
    }

    public void setAlcoholDuration(String duration) {
        txt_Alcohol_Duration.setText(duration);
    }

    public String getAlcoholQuantity() {
        return txt_Alcohol_Quantity.getText();
    }

    public void setAlcoholQuantity(String quantity) {
        txt_Alcohol_Quantity.setText(quantity);
    }

    public String getAlcoholUse() {
        return txt_Alcohol_Use.getText();
    }

    public void setAlcoholUse(String use) {
        txt_Alcohol_Use.setText(use);
    }

    public String getDrugDuration() {
        return txt_Drug_Duration.getText();
    }

    public void setDrugDuration(String duration) {
        txt_Drug_Duration.setText(duration);
    }

    public String getDrugType() {
        return txt_Drug_Type.getText();
    }

    public void setDrugType(String type) {
        txt_Drug_Type.setText(type);
    }

    public String getDrugUse() {
        return txt_Drug_Use.getText();
    }

    public void setDrugUse(String use) {
        txt_Drug_Use.setText(use);
    }

    public int getGMHID() {
        return this.gmhID;
    }

    public void setGMHID(int gmhID) {
        this.gmhID = gmhID;
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

    public String getTobaccoDuration() {
        return txt_Tob_Duration.getText();
    }

    public void setTobaccoDuration(String duration) {
        txt_Tob_Duration.setText(duration);
    }

    public String getTobaccoQuantity() {
        return txt_Tob_Quantity.getText();
    }

    public void setTobaccoQuantity(String quantity) {
        txt_Tob_Quantity.setText(quantity);
    }

    public String getTobaccoUse() {
        return txt_Tobacco_Use.getText();
    }

    public void setTobaccoUse(String use) {
        txt_Tobacco_Use.setText(use);
    }
    
    private void LockScreen () {
        
        txt_Alcohol_Duration.setEditable(false);
        txt_Alcohol_Duration.setBackground(Color.LIGHT_GRAY);

        txt_Alcohol_Quantity.setEditable(false);
        txt_Alcohol_Quantity.setBackground(Color.LIGHT_GRAY);

        txt_Alcohol_Use.setEditable(false);
        txt_Alcohol_Use.setBackground(Color.LIGHT_GRAY);

        txt_Drug_Duration.setEditable(false);
        txt_Drug_Duration.setBackground(Color.LIGHT_GRAY);

        txt_Drug_Type.setEditable(false);
        txt_Drug_Type.setBackground(Color.LIGHT_GRAY);

        txt_Drug_Use.setEditable(false);
        txt_Drug_Use.setBackground(Color.LIGHT_GRAY);


        txt_Tob_Duration.setEditable(false);
        txt_Tob_Duration.setBackground(Color.LIGHT_GRAY);

        txt_Tob_Quantity.setEditable(false);
        txt_Tob_Quantity.setBackground(Color.LIGHT_GRAY);

        txt_Tobacco_Use.setEditable(false);
        txt_Tobacco_Use.setBackground(Color.LIGHT_GRAY);

        // Disable JComboBoxes and set background
        cbox_BloodType.setEnabled(false);
        cbox_BloodType.setBackground(Color.LIGHT_GRAY);

        cbox_RH.setEnabled(false);
        cbox_RH.setBackground(Color.LIGHT_GRAY); 
        
    }
    
    private void UnLockScreen () {
        
        txt_Alcohol_Duration.setEditable(true);
        txt_Alcohol_Duration.setBackground(Color.WHITE);

        txt_Alcohol_Quantity.setEditable(true);
        txt_Alcohol_Quantity.setBackground(Color.WHITE);

        txt_Alcohol_Use.setEditable(true);
        txt_Alcohol_Use.setBackground(Color.WHITE);

        txt_Drug_Duration.setEditable(true);
        txt_Drug_Duration.setBackground(Color.WHITE);

        txt_Drug_Type.setEditable(true);
        txt_Drug_Type.setBackground(Color.WHITE);

        txt_Drug_Use.setEditable(true);
        txt_Drug_Use.setBackground(Color.WHITE);

        txt_Tob_Duration.setEditable(true);
        txt_Tob_Duration.setBackground(Color.WHITE);

        txt_Tob_Quantity.setEditable(true);
        txt_Tob_Quantity.setBackground(Color.WHITE);

        txt_Tobacco_Use.setEditable(true);
        txt_Tobacco_Use.setBackground(Color.WHITE);

        // Enable and set background for JComboBoxes
        cbox_BloodType.setEnabled(true);
        cbox_BloodType.setBackground(Color.WHITE);

        cbox_RH.setEnabled(true);
        cbox_RH.setBackground(Color.WHITE);
        
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GMHNavBtn;
    private javax.swing.JLabel GenMedTitle;
    private javax.swing.JMenuItem SoBNavBtn;
    private javax.swing.JMenuItem activityToleranceNavBtn;
    private javax.swing.JComboBox<String> cbox_BloodType;
    private javax.swing.JComboBox<String> cbox_RH;
    private javax.swing.JMenuItem familyHistoryNavBtn;
    private javax.swing.JMenuItem immunizationsNavBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem menu_Delete;
    private javax.swing.JRadioButtonMenuItem menu_Edit;
    private javax.swing.JRadioButtonMenuItem menu_Save;
    private javax.swing.JMenu menu_Shortness_Of_Breath;
    private javax.swing.JMenuItem patientDemoNavBtn;
    private javax.swing.JMenuItem patientSelectNavBtn;
    private javax.swing.JRadioButtonMenuItem radio_add;
    private javax.swing.JTextField txt_Alcohol_Duration;
    private javax.swing.JTextField txt_Alcohol_Quantity;
    private javax.swing.JTextField txt_Alcohol_Use;
    private javax.swing.JTextField txt_Drug_Duration;
    private javax.swing.JTextField txt_Drug_Type;
    private javax.swing.JTextField txt_Drug_Use;
    private javax.swing.JTextField txt_Tob_Duration;
    private javax.swing.JTextField txt_Tob_Quantity;
    private javax.swing.JTextField txt_Tobacco_Use;
    // End of variables declaration//GEN-END:variables
}
