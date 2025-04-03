
package healthcare_application;

import java.awt.Color;


public class Activity_Tolerance_Interview extends javax.swing.JFrame {

   
    public Activity_Tolerance_Interview() {
        initComponents();
        LockScreen();
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
        cbox_numStairs = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_SOBA = new javax.swing.JMenu();
        SOBA_form = new javax.swing.JMenuItem();
        menu_Patient_Select = new javax.swing.JMenuItem();
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
        cbox_Eating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        cbox_Drinking.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_Drinking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        cbox_Dressed.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_Dressed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        cbox_House.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_House.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        cbox_ClimbStairs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_ClimbStairs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        cbox_numStairs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_numStairs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1-3", "4-6", "7-10" }));

        javax.swing.GroupLayout panel_ATALayout = new javax.swing.GroupLayout(panel_ATA);
        panel_ATA.setLayout(panel_ATALayout);
        panel_ATALayout.setHorizontalGroup(
            panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ATALayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(cbox_numStairs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(cbox_numStairs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menu_SOBA.setText("Forms");

        SOBA_form.setText("Shortness of Breath Form");
        SOBA_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SOBA_formActionPerformed(evt);
            }
        });
        menu_SOBA.add(SOBA_form);

        menu_Patient_Select.setText("Patient Selection Form");
        menu_Patient_Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Patient_SelectActionPerformed(evt);
            }
        });
        menu_SOBA.add(menu_Patient_Select);

        jMenuBar1.add(menu_SOBA);

        menu_ATAOptions.setText("Actions");

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
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SOBA_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SOBA_formActionPerformed
        Shortness_of_Breath_Interview SOBA = new Shortness_of_Breath_Interview();
        SOBA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SOBA_formActionPerformed

    private void menu_Edit_RecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Edit_RecordActionPerformed
        UnlockScreen();
    }//GEN-LAST:event_menu_Edit_RecordActionPerformed

    private void menu_Add_RecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Add_RecordActionPerformed
        UnlockScreen();
    }//GEN-LAST:event_menu_Add_RecordActionPerformed

    private void menu_Save_RecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Save_RecordActionPerformed
        LockScreen();
    }//GEN-LAST:event_menu_Save_RecordActionPerformed

    private void menu_Delete_RecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Delete_RecordActionPerformed
        LockScreen();
    }//GEN-LAST:event_menu_Delete_RecordActionPerformed

    private void menu_Patient_SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Patient_SelectActionPerformed
        Patient_Selection patient_select = new Patient_Selection();
        patient_select.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_Patient_SelectActionPerformed

    
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
    
    
    private void LockScreen () {
        cbox_Eating.setEnabled(false);
        cbox_Eating.setBackground(Color.lightGray);
        cbox_Eating.setSelectedIndex(-1);
        
        cbox_Drinking.setEnabled(false);
        cbox_Drinking.setBackground(Color.lightGray);
        cbox_Drinking.setSelectedIndex(-1);
        
        cbox_Dressed.setEnabled(false);
        cbox_Dressed.setBackground(Color.lightGray);
        cbox_Dressed.setSelectedIndex(-1);
        
        cbox_House.setEnabled(false);
        cbox_House.setBackground(Color.lightGray);
        cbox_House.setSelectedIndex(-1);
        
        cbox_ClimbStairs.setEnabled(false);
        cbox_ClimbStairs.setBackground(Color.lightGray);
        cbox_ClimbStairs.setSelectedIndex(-1);
        
        cbox_numStairs.setEnabled(false);
        cbox_numStairs.setBackground(Color.lightGray);
        cbox_numStairs.setSelectedIndex(-1);
                         
                
    }
    
    private void UnlockScreen () {
       
        cbox_Eating.setEnabled(true);
        cbox_Eating.setBackground(Color.white);
        cbox_Eating.setSelectedIndex(-1);
        
        cbox_Drinking.setEnabled(true);
        cbox_Drinking.setBackground(Color.white);
        cbox_Drinking.setSelectedIndex(-1);
        
        cbox_Dressed.setEnabled(true);
        cbox_Dressed.setBackground(Color.white);
        cbox_Dressed.setSelectedIndex(-1);
        
        cbox_House.setEnabled(true);
        cbox_House.setBackground(Color.white);
        cbox_House.setSelectedIndex(-1);
        
        cbox_ClimbStairs.setEnabled(true);
        cbox_ClimbStairs.setBackground(Color.white);
        cbox_ClimbStairs.setSelectedIndex(-1);
        
        cbox_numStairs.setEnabled(true);
        cbox_numStairs.setBackground(Color.white);
        cbox_numStairs.setSelectedIndex(-1);
        
                         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SOBA_form;
    private javax.swing.JComboBox<String> cbox_ClimbStairs;
    private javax.swing.JComboBox<String> cbox_Dressed;
    private javax.swing.JComboBox<String> cbox_Drinking;
    private javax.swing.JComboBox<String> cbox_Eating;
    private javax.swing.JComboBox<String> cbox_House;
    private javax.swing.JComboBox<String> cbox_numStairs;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
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
    private javax.swing.JMenuItem menu_Patient_Select;
    private javax.swing.JMenu menu_SOBA;
    private javax.swing.JMenuItem menu_Save_Record;
    private javax.swing.JPanel panel_ATA;
    // End of variables declaration//GEN-END:variables
}
