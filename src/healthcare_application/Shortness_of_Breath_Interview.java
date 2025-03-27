
package healthcare_application;

import java.awt.Color;


public class Shortness_of_Breath_Interview extends javax.swing.JFrame {

   
    public Shortness_of_Breath_Interview() {
        initComponents();
        LockScreen();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        l_SOBA = new javax.swing.JLabel();
        panel_SOBA = new javax.swing.JPanel();
        l_SOBToday = new javax.swing.JLabel();
        l_SOBScale = new javax.swing.JLabel();
        l_SOBYesterday = new javax.swing.JLabel();
        txt_SOBToday = new javax.swing.JTextField();
        txt_SOBScale = new javax.swing.JTextField();
        txt_SOBYesterday = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabl_SOBRecords = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_Forms = new javax.swing.JMenu();
        menu_ATA = new javax.swing.JMenuItem();
        menu_Actions = new javax.swing.JMenu();
        menu_Add_Record = new javax.swing.JMenuItem();
        menu_Edit_Mode = new javax.swing.JMenuItem();
        menu_Save = new javax.swing.JMenuItem();
        menu_Delete = new javax.swing.JMenuItem();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l_SOBA.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l_SOBA.setText("Shortness of Breath Assessment ");

        l_SOBToday.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l_SOBToday.setText("Shortness of Breath Today ");

        l_SOBScale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l_SOBScale.setText("Shortness of Breath Severity ");

        l_SOBYesterday.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l_SOBYesterday.setText("Worse than the day before");

        txt_SOBToday.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_SOBScale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_SOBYesterday.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout panel_SOBALayout = new javax.swing.GroupLayout(panel_SOBA);
        panel_SOBA.setLayout(panel_SOBALayout);
        panel_SOBALayout.setHorizontalGroup(
            panel_SOBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SOBALayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panel_SOBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_SOBToday)
                    .addGroup(panel_SOBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_SOBALayout.createSequentialGroup()
                            .addComponent(l_SOBYesterday)
                            .addGap(15, 15, 15))
                        .addComponent(l_SOBScale, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(13, 13, 13)
                .addGroup(panel_SOBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_SOBYesterday, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(txt_SOBToday)
                    .addComponent(txt_SOBScale))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        panel_SOBALayout.setVerticalGroup(
            panel_SOBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SOBALayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panel_SOBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_SOBToday)
                    .addComponent(txt_SOBToday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panel_SOBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_SOBScale)
                    .addComponent(txt_SOBScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panel_SOBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_SOBYesterday)
                    .addComponent(txt_SOBYesterday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        tabl_SOBRecords.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabl_SOBRecords);

        menu_Forms.setText("Forms");

        menu_ATA.setText("Activity Tolerance Form");
        menu_ATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ATAActionPerformed(evt);
            }
        });
        menu_Forms.add(menu_ATA);

        jMenuBar1.add(menu_Forms);

        menu_Actions.setText("Actions");

        menu_Add_Record.setText("Add Record");
        menu_Add_Record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Add_RecordActionPerformed(evt);
            }
        });
        menu_Actions.add(menu_Add_Record);

        menu_Edit_Mode.setText("Edit Record");
        menu_Edit_Mode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Edit_ModeActionPerformed(evt);
            }
        });
        menu_Actions.add(menu_Edit_Mode);

        menu_Save.setText("Save Record");
        menu_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_SaveActionPerformed(evt);
            }
        });
        menu_Actions.add(menu_Save);

        menu_Delete.setText("Delete Record");
        menu_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_DeleteActionPerformed(evt);
            }
        });
        menu_Actions.add(menu_Delete);

        jMenuBar1.add(menu_Actions);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(panel_SOBA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(l_SOBA, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(235, 235, 235))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(l_SOBA)
                        .addGap(18, 18, 18)
                        .addComponent(panel_SOBA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_ATAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ATAActionPerformed
         Activity_Tolerance_Interview ATA = new  Activity_Tolerance_Interview();
         ATA.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_menu_ATAActionPerformed

    private void menu_Add_RecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Add_RecordActionPerformed
        UnlockScreen();
    }//GEN-LAST:event_menu_Add_RecordActionPerformed

    private void menu_Edit_ModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Edit_ModeActionPerformed
        UnlockScreen();
    }//GEN-LAST:event_menu_Edit_ModeActionPerformed

    private void menu_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_SaveActionPerformed
        LockScreen();
    }//GEN-LAST:event_menu_SaveActionPerformed

    private void menu_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_DeleteActionPerformed
        LockScreen();
    }//GEN-LAST:event_menu_DeleteActionPerformed

    
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
            java.util.logging.Logger.getLogger(Shortness_of_Breath_Interview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shortness_of_Breath_Interview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shortness_of_Breath_Interview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shortness_of_Breath_Interview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shortness_of_Breath_Interview().setVisible(true);
            }
        });
    }
    
    
    private void LockScreen () {
        txt_SOBToday.setEditable(false);
        txt_SOBToday.setBackground(Color.lightGray);
        
        txt_SOBScale.setEditable(false);
        txt_SOBScale.setBackground(Color.lightGray);
        
        txt_SOBYesterday.setEditable(false);
        txt_SOBYesterday.setBackground(Color.lightGray);
        
        
    }
    
    private void UnlockScreen () {
        txt_SOBToday.setText(" ");
        txt_SOBToday.setEditable(true);
        txt_SOBToday.setBackground(Color.white);
        
        txt_SOBScale.setText(" ");
        txt_SOBScale.setEditable(true);
        txt_SOBScale.setBackground(Color.white);
        
        txt_SOBYesterday.setText(" ");
        txt_SOBYesterday.setEditable(true);
        txt_SOBYesterday.setBackground(Color.white);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel l_SOBA;
    private javax.swing.JLabel l_SOBScale;
    private javax.swing.JLabel l_SOBToday;
    private javax.swing.JLabel l_SOBYesterday;
    private javax.swing.JMenuItem menu_ATA;
    private javax.swing.JMenu menu_Actions;
    private javax.swing.JMenuItem menu_Add_Record;
    private javax.swing.JMenuItem menu_Delete;
    private javax.swing.JMenuItem menu_Edit_Mode;
    private javax.swing.JMenu menu_Forms;
    private javax.swing.JMenuItem menu_Save;
    private javax.swing.JPanel panel_SOBA;
    private javax.swing.JTable tabl_SOBRecords;
    private javax.swing.JTextField txt_SOBScale;
    private javax.swing.JTextField txt_SOBToday;
    private javax.swing.JTextField txt_SOBYesterday;
    // End of variables declaration//GEN-END:variables
}
