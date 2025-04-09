
package healthcare_application;


import healthcare_application.DBUtils.GMH_DBOperations;
import java.awt.Color;
public class General_Medical_History extends javax.swing.JFrame {

    private int patientID;
    private int gmhID;
    public General_Medical_History() {
        initComponents();
        LockScreen();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenMedTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_GMH_ID = new javax.swing.JTextField();
        txt_Patient_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
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
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        menu_Edit = new javax.swing.JRadioButtonMenuItem();
        menu_Save = new javax.swing.JRadioButtonMenuItem();
        menu_Delete = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(840, 748));

        GenMedTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        GenMedTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenMedTitle.setText("General Medical History");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("General Medical History ID: ");

        txt_GMH_ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_Patient_ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("*Patient ID: ");

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

        jMenu2.setText("Navigate");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem1.setText("Patient Selection");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Patient Demographics");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("General Medical History");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Shortness of Breath");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Activity Tolerance");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Actions");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Add Record");
        jMenu1.add(jRadioButtonMenuItem1);

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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_Patient_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_GMH_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_GMH_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_Patient_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
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
                            .addComponent(txt_Alcohol_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(cbox_BloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(cbox_RH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_EditActionPerformed
        UnLockScreen();
    }//GEN-LAST:event_menu_EditActionPerformed

    private void menu_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_SaveActionPerformed
        patientID = Integer.parseInt(getPatientID());
        gmhID = Integer.parseInt(getGMHID());
        GMH_DBOperations.updateGeneralMedicalHistory(this, gmhID, patientID);
        
    }//GEN-LAST:event_menu_SaveActionPerformed

    private void menu_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_DeleteActionPerformed
        GMH_DBOperations.deleteGeneralMedicalHistory(gmhID, patientID);
    }//GEN-LAST:event_menu_DeleteActionPerformed

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

    public String getGMHID() {
        return txt_GMH_ID.getText();
    }

    public void setGMHID(String gmhID) {
        txt_GMH_ID.setText(gmhID);
    }

    public String getPatientID() {
        return txt_Patient_ID.getText();
    }

    public void setPatientID(String patientID) {
        txt_Patient_ID.setText(patientID);
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

        txt_GMH_ID.setEditable(false);
        txt_GMH_ID.setBackground(Color.LIGHT_GRAY);

        txt_Patient_ID.setEditable(false);
        txt_Patient_ID.setBackground(Color.LIGHT_GRAY);

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

        // GMH_ID and Patient_ID: Read-only (not editable)
        txt_GMH_ID.setEditable(false);
        txt_GMH_ID.setBackground(Color.WHITE);

        txt_Patient_ID.setEditable(false);
        txt_Patient_ID.setBackground(Color.WHITE);

        // Enable and set background for JComboBoxes
        cbox_BloodType.setEnabled(true);
        cbox_BloodType.setBackground(Color.WHITE);

        cbox_RH.setEnabled(true);
        cbox_RH.setBackground(Color.WHITE);
        
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GenMedTitle;
    private javax.swing.JComboBox<String> cbox_BloodType;
    private javax.swing.JComboBox<String> cbox_RH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem menu_Delete;
    private javax.swing.JRadioButtonMenuItem menu_Edit;
    private javax.swing.JRadioButtonMenuItem menu_Save;
    private javax.swing.JTextField txt_Alcohol_Duration;
    private javax.swing.JTextField txt_Alcohol_Quantity;
    private javax.swing.JTextField txt_Alcohol_Use;
    private javax.swing.JTextField txt_Drug_Duration;
    private javax.swing.JTextField txt_Drug_Type;
    private javax.swing.JTextField txt_Drug_Use;
    private javax.swing.JTextField txt_GMH_ID;
    private javax.swing.JTextField txt_Patient_ID;
    private javax.swing.JTextField txt_Tob_Duration;
    private javax.swing.JTextField txt_Tob_Quantity;
    private javax.swing.JTextField txt_Tobacco_Use;
    // End of variables declaration//GEN-END:variables
}
