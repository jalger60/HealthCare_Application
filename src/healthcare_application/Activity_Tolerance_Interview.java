
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
        lbl_ATClimb1_3steps = new javax.swing.JLabel();
        lbl_ATClimb4_6steps = new javax.swing.JLabel();
        lbl_ATClimb7_10steps = new javax.swing.JLabel();
        txt_ATEating = new javax.swing.JTextField();
        txt_ATDrinking = new javax.swing.JTextField();
        txt_ATDressing = new javax.swing.JTextField();
        txt_ATWalking_House = new javax.swing.JTextField();
        txt_ATClimbing_Stairs = new javax.swing.JTextField();
        txt_ATClimb1_3steps = new javax.swing.JTextField();
        txt_ATClimb4_6steps = new javax.swing.JTextField();
        txt_ATClimb7_10steps = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_ATAdd = new javax.swing.JButton();
        txt_ATDelete = new javax.swing.JButton();
        txt_ATEdit = new javax.swing.JButton();
        txt_ATSave = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_SOBA = new javax.swing.JMenu();
        SOBA_form = new javax.swing.JMenuItem();

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

        lbl_ATClimb1_3steps.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_ATClimb1_3steps.setText("Able to Climb 1-3 Steps");

        lbl_ATClimb4_6steps.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_ATClimb4_6steps.setText("Able to Climb 4-6 Steps");

        lbl_ATClimb7_10steps.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_ATClimb7_10steps.setText("Able to Climb 7-10 Steps");

        txt_ATEating.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_ATDrinking.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_ATDressing.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_ATWalking_House.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_ATClimbing_Stairs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_ATClimb1_3steps.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_ATClimb4_6steps.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_ATClimb7_10steps.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout panel_ATALayout = new javax.swing.GroupLayout(panel_ATA);
        panel_ATA.setLayout(panel_ATALayout);
        panel_ATALayout.setHorizontalGroup(
            panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ATALayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ATALayout.createSequentialGroup()
                        .addComponent(lbl_ATClimbing_Stairs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ATClimbing_Stairs, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ATALayout.createSequentialGroup()
                        .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_ATALayout.createSequentialGroup()
                                .addComponent(lbl_ATEating)
                                .addGap(18, 18, 18)
                                .addComponent(txt_ATEating)
                                .addGap(14, 14, 14))
                            .addComponent(lbl_ATWalking_House))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_ATWalking_House, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panel_ATALayout.createSequentialGroup()
                            .addComponent(lbl_ATDressing)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_ATDressing))
                        .addGroup(panel_ATALayout.createSequentialGroup()
                            .addComponent(lbl_ATDrinking)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_ATDrinking, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_ATALayout.createSequentialGroup()
                            .addComponent(lbl_ATClimb7_10steps)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_ATClimb7_10steps))
                        .addGroup(panel_ATALayout.createSequentialGroup()
                            .addComponent(lbl_ATClimb4_6steps)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_ATClimb4_6steps))
                        .addGroup(panel_ATALayout.createSequentialGroup()
                            .addComponent(lbl_ATClimb1_3steps)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_ATClimb1_3steps, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        panel_ATALayout.setVerticalGroup(
            panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ATALayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ATEating)
                    .addComponent(txt_ATEating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ATDrinking)
                    .addComponent(txt_ATDrinking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ATDressing)
                    .addComponent(txt_ATDressing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ATWalking_House)
                    .addComponent(txt_ATWalking_House, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ATClimbing_Stairs)
                    .addComponent(txt_ATClimbing_Stairs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ATClimb1_3steps)
                    .addComponent(txt_ATClimb1_3steps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ATClimb4_6steps)
                    .addComponent(txt_ATClimb4_6steps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_ATALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ATClimb7_10steps)
                    .addComponent(txt_ATClimb7_10steps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
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

        txt_ATAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_ATAdd.setText("Add Record");
        txt_ATAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ATAddActionPerformed(evt);
            }
        });

        txt_ATDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_ATDelete.setText("Delete Record");
        txt_ATDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ATDeleteActionPerformed(evt);
            }
        });

        txt_ATEdit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_ATEdit.setText("Edit Record");
        txt_ATEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ATEditActionPerformed(evt);
            }
        });

        txt_ATSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_ATSave.setText("Save Record");
        txt_ATSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ATSaveActionPerformed(evt);
            }
        });

        menu_SOBA.setText("Forms");

        SOBA_form.setText("Shortness of Breath Form");
        SOBA_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SOBA_formActionPerformed(evt);
            }
        });
        menu_SOBA.add(SOBA_form);

        jMenuBar1.add(menu_SOBA);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_AT_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_ATAdd)
                        .addGap(67, 67, 67)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_ATEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(txt_ATSave)
                        .addGap(70, 70, 70)
                        .addComponent(txt_ATDelete)
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(panel_ATA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ATEdit)
                    .addComponent(txt_ATAdd)
                    .addComponent(txt_ATSave)
                    .addComponent(txt_ATDelete))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ATAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ATAddActionPerformed
        UnlockScreen();
    }//GEN-LAST:event_txt_ATAddActionPerformed

    private void txt_ATEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ATEditActionPerformed
        UnlockScreen();
    }//GEN-LAST:event_txt_ATEditActionPerformed

    private void txt_ATSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ATSaveActionPerformed
        LockScreen();
    }//GEN-LAST:event_txt_ATSaveActionPerformed

    private void txt_ATDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ATDeleteActionPerformed
        LockScreen();
    }//GEN-LAST:event_txt_ATDeleteActionPerformed

    private void SOBA_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SOBA_formActionPerformed
        Shortness_of_Breath_Interview SOBA = new Shortness_of_Breath_Interview();
        SOBA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SOBA_formActionPerformed

    
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
        txt_ATEating.setEditable(false);
        txt_ATEating.setBackground(Color.lightGray);
        
        txt_ATDrinking.setEditable(false);
        txt_ATDrinking.setBackground(Color.lightGray);
        
        txt_ATDressing.setEditable(false);
        txt_ATDressing.setBackground(Color.lightGray);
        
        txt_ATWalking_House.setEditable(false);
        txt_ATWalking_House.setBackground(Color.lightGray);
        
        
        txt_ATClimbing_Stairs.setEditable(false);
        txt_ATClimbing_Stairs.setBackground(Color.lightGray);
        
        txt_ATClimb1_3steps.setEditable(false);
        txt_ATClimb1_3steps.setBackground(Color.lightGray);
        
        txt_ATClimb4_6steps.setEditable(false);
        txt_ATClimb4_6steps.setBackground(Color.lightGray);
        
        txt_ATClimb7_10steps.setEditable(false);
        txt_ATClimb7_10steps.setBackground(Color.lightGray);
                         
                
    }
    
    private void UnlockScreen () {
        txt_ATEating.setEditable(true);
        txt_ATEating.setBackground(Color.white);
        
        txt_ATDrinking.setEditable(true);
        txt_ATDrinking.setBackground(Color.white);
        
        txt_ATDressing.setEditable(true);
        txt_ATDressing.setBackground(Color.white);
        
        txt_ATWalking_House.setEditable(true);
        txt_ATWalking_House.setBackground(Color.white);
        
        txt_ATClimbing_Stairs.setEditable(true);
        txt_ATClimbing_Stairs.setBackground(Color.white);
        
        txt_ATClimb1_3steps.setEditable(true);
        txt_ATClimb1_3steps.setBackground(Color.white);
        
        txt_ATClimb4_6steps.setEditable(true);
        txt_ATClimb4_6steps.setBackground(Color.white);
        
        txt_ATClimb7_10steps.setEditable(true);
        txt_ATClimb7_10steps.setBackground(Color.white);
                         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SOBA_form;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_ATClimb1_3steps;
    private javax.swing.JLabel lbl_ATClimb4_6steps;
    private javax.swing.JLabel lbl_ATClimb7_10steps;
    private javax.swing.JLabel lbl_ATClimbing_Stairs;
    private javax.swing.JLabel lbl_ATDressing;
    private javax.swing.JLabel lbl_ATDrinking;
    private javax.swing.JLabel lbl_ATEating;
    private javax.swing.JLabel lbl_ATWalking_House;
    private javax.swing.JLabel lbl_AT_Title;
    private javax.swing.JMenu menu_SOBA;
    private javax.swing.JPanel panel_ATA;
    private javax.swing.JButton txt_ATAdd;
    private javax.swing.JTextField txt_ATClimb1_3steps;
    private javax.swing.JTextField txt_ATClimb4_6steps;
    private javax.swing.JTextField txt_ATClimb7_10steps;
    private javax.swing.JTextField txt_ATClimbing_Stairs;
    private javax.swing.JButton txt_ATDelete;
    private javax.swing.JTextField txt_ATDressing;
    private javax.swing.JTextField txt_ATDrinking;
    private javax.swing.JTextField txt_ATEating;
    private javax.swing.JButton txt_ATEdit;
    private javax.swing.JButton txt_ATSave;
    private javax.swing.JTextField txt_ATWalking_House;
    // End of variables declaration//GEN-END:variables
}
