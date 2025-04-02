
package healthcare_application;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import healthcare_application.DBUtils.Shortness_Of_Breath_DBOperations;
import java.util.ArrayList;
import java.util.List;


public class Shortness_of_Breath_Interview extends javax.swing.JFrame {
    
    private int patientID;
    private int RecordID;
    Shortness_Of_Breath_DBOperations soba = new Shortness_Of_Breath_DBOperations();
   
    public Shortness_of_Breath_Interview() {
        initComponents();
        LockScreen();
    }
    
    public Shortness_of_Breath_Interview(int patientID) {
        this.patientID = patientID;
        initComponents();
        LockScreen();
        initializeTable();
        
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
        cbox_SOBT = new javax.swing.JComboBox<>();
        cbox_SOBScale = new javax.swing.JComboBox<>();
        cbox_SOBYesterday = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabl_SOBRecords = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_Forms = new javax.swing.JMenu();
        menu_ATA = new javax.swing.JMenuItem();
        menu_Patient_Selection = new javax.swing.JMenuItem();
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

        cbox_SOBT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_SOBT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        cbox_SOBScale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_SOBScale.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Mild", "More Severe", "Very Severe" }));

        cbox_SOBYesterday.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbox_SOBYesterday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        javax.swing.GroupLayout panel_SOBALayout = new javax.swing.GroupLayout(panel_SOBA);
        panel_SOBA.setLayout(panel_SOBALayout);
        panel_SOBALayout.setHorizontalGroup(
            panel_SOBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SOBALayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panel_SOBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_SOBYesterday)
                    .addComponent(l_SOBScale)
                    .addComponent(l_SOBToday))
                .addGap(18, 18, 18)
                .addGroup(panel_SOBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbox_SOBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox_SOBScale, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox_SOBYesterday, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panel_SOBALayout.setVerticalGroup(
            panel_SOBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SOBALayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panel_SOBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_SOBToday)
                    .addComponent(cbox_SOBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(panel_SOBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbox_SOBScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_SOBScale))
                .addGap(45, 45, 45)
                .addGroup(panel_SOBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_SOBYesterday)
                    .addComponent(cbox_SOBYesterday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        tabl_SOBRecords.setAutoCreateRowSorter(true);
        tabl_SOBRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Shortness of Breath", "Severity Level", "Worse"
            }
        ));
        tabl_SOBRecords.setShowGrid(true);
        jScrollPane2.setViewportView(tabl_SOBRecords);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menu_Forms.setText("Forms");

        menu_ATA.setText("Activity Tolerance Form");
        menu_ATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ATAActionPerformed(evt);
            }
        });
        menu_Forms.add(menu_ATA);

        menu_Patient_Selection.setText("Patient Selection Form");
        menu_Patient_Selection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Patient_SelectionActionPerformed(evt);
            }
        });
        menu_Forms.add(menu_Patient_Selection);

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
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(l_SOBA, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(panel_SOBA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(l_SOBA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_SOBA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
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
        
        soba.editSOBAssessment(RecordID, patientID, this);
        LockScreen();
    }//GEN-LAST:event_menu_SaveActionPerformed

    private void menu_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_DeleteActionPerformed
        LockScreen();
    }//GEN-LAST:event_menu_DeleteActionPerformed

    private void menu_Patient_SelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Patient_SelectionActionPerformed
        Patient_Selection patient_select = new Patient_Selection();
        patient_select.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_Patient_SelectionActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shortness_of_Breath_Interview().setVisible(true);
            }
        });
    }
    
    
    private void LockScreen () {
        cbox_SOBT.setEditable(false);
        cbox_SOBT.setBackground(Color.lightGray);
        cbox_SOBT.setSelectedIndex(-1);
        cbox_SOBT.setEnabled(false);
        
        cbox_SOBScale.setEditable(false);
        cbox_SOBScale.setBackground(Color.lightGray);
        cbox_SOBScale.setSelectedIndex(-1);
        cbox_SOBScale.setEnabled(false);
        
        cbox_SOBYesterday.setEnabled(false);
        cbox_SOBYesterday.setBackground(Color.lightGray);
        cbox_SOBYesterday.setSelectedIndex(-1);
        cbox_SOBYesterday.setEditable(false);
        
        
    }
    
    private void UnlockScreen () {
        
        cbox_SOBT.setEnabled(true);
        cbox_SOBT.setBackground(Color.white);
        cbox_SOBT.setEditable(false);
        
        cbox_SOBScale.setEnabled(true);
        cbox_SOBScale.setBackground(Color.white);
        cbox_SOBScale.setEditable(false);
        
        
        cbox_SOBYesterday.setEnabled(true);
        cbox_SOBYesterday.setBackground(Color.white);
        cbox_SOBYesterday.setEditable(false);
        
    }
    
    private void initializeTable() {
    // Call the PatientDBUtils method to get the ResultSet
    ResultSet rs = Shortness_Of_Breath_DBOperations.PatientDBUtils(patientID);

    if (rs != null) {
        // Table model to display data in JTable
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Date");
        model.addColumn("Time");
        model.addColumn("Shortness of Breath");
        model.addColumn("Severity Level");
        model.addColumn("Worse Than Yesterday");
        model.addColumn("Record ID");

        // Store data for comboboxes in a list or map for later use
        List<Object[]> rowDataList = new ArrayList<>();

        // Populate table with result set data
        try {
            while (rs.next()) {
                Object[] row = new Object[6];
                row[0] = rs.getString("Date");
                row[1] = rs.getString("Time");

                // Convert the "Shortness of Breath" value (1 -> Yes, 0 -> No)
                int sob = rs.getInt("Shortness of Breath Today");
                row[2] = (sob == 1) ? "Yes" : "No";

                // Convert the "Worse Than Yesterday" value (1 -> Yes, 0 -> No)
                int worseYesterday = rs.getInt("MoreShortThanYesterday");
                row[4] = (worseYesterday == 1) ? "Yes" : "No";

                // For severity, you can display as-is or map it to other values if necessary
                row[3] = rs.getString("SeverityLevel");
                
                RecordID = rs.getInt("SOBID");
                

                // Add row to model
                model.addRow(row);

                // Store data in the list for future reference
                rowDataList.add(row);
            }

            // Set the model to the existing JTable
            tabl_SOBRecords.setModel(model);

            // Hide the columns (indexes 1, 2, and 3)
            tabl_SOBRecords.getColumnModel().getColumn(2).setMaxWidth(0);
            tabl_SOBRecords.getColumnModel().getColumn(2).setMinWidth(0);
            tabl_SOBRecords.getColumnModel().getColumn(2).setPreferredWidth(0);
            
            tabl_SOBRecords.getColumnModel().getColumn(3).setMaxWidth(0);
            tabl_SOBRecords.getColumnModel().getColumn(3).setMinWidth(0);
            tabl_SOBRecords.getColumnModel().getColumn(3).setPreferredWidth(0);

            tabl_SOBRecords.getColumnModel().getColumn(4).setMaxWidth(0);
            tabl_SOBRecords.getColumnModel().getColumn(4).setMinWidth(0);
            tabl_SOBRecords.getColumnModel().getColumn(4).setPreferredWidth(0);
            
            tabl_SOBRecords.getColumnModel().getColumn(5).setMaxWidth(0);
            tabl_SOBRecords.getColumnModel().getColumn(5).setMinWidth(0);
            tabl_SOBRecords.getColumnModel().getColumn(5).setPreferredWidth(0);

            // Add ListSelectionListener to the JTable to capture selection changes
            tabl_SOBRecords.getSelectionModel().addListSelectionListener(e -> {
                if (!e.getValueIsAdjusting()) {  // Check if the selection has changed
                    int selectedRow = tabl_SOBRecords.getSelectedRow();
                    if (selectedRow != -1) {
                        // Get the values of the selected row from the stored list
                        Object[] selectedRowData = rowDataList.get(selectedRow);
                        String date = (String) selectedRowData[0];
                        String Time = (String) selectedRowData[1];
                        String sob = (String) selectedRowData[2];
                        String severity = (String) selectedRowData[3];
                        String worseYesterday = (String) selectedRowData[4];
                        String Record_ID = (String) selectedRowData[5];

                        // Populate the JComboBox components with values from the selected record
                        cbox_SOBScale.setSelectedItem(severity);  // Set the severity level in the SOB Scale ComboBox
                        cbox_SOBT.setSelectedItem(sob);  // Set the Shortness of Breath value in the SOBT ComboBox
                        cbox_SOBYesterday.setSelectedItem(worseYesterday);  // Set the Worse Than Yesterday value
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




    
    

    public String getCbox_SOBScale() {
        return cbox_SOBScale.getSelectedItem().toString();
    }

    public String getCbox_SOBT() {
        return cbox_SOBT.getSelectedItem().toString();
    }

    public String getCbox_SOBYesterday() {
        return cbox_SOBYesterday.getSelectedItem().toString();
    }
    
    public void setCbox_SOBScale(javax.swing.JComboBox<String> cbox_SOBScale) {
        this.cbox_SOBScale = cbox_SOBScale;
    }

    public void setCbox_SOBT(javax.swing.JComboBox<String> cbox_SOBT) {
        this.cbox_SOBT = cbox_SOBT;
    }

    public void setCbox_SOBYesterday(javax.swing.JComboBox<String> cbox_SOBYesterday) {
        this.cbox_SOBYesterday = cbox_SOBYesterday;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbox_SOBScale;
    private javax.swing.JComboBox<String> cbox_SOBT;
    private javax.swing.JComboBox<String> cbox_SOBYesterday;
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
    private javax.swing.JMenuItem menu_Patient_Selection;
    private javax.swing.JMenuItem menu_Save;
    private javax.swing.JPanel panel_SOBA;
    private javax.swing.JTable tabl_SOBRecords;
    // End of variables declaration//GEN-END:variables
}
