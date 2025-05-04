
package healthcare_application;

import General_Functionality.User_Modes;
import healthcare_application.DBUtils.GMH_DBOperations;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import healthcare_application.DBUtils.Shortness_Of_Breath_DBOperations;
import healthcare_application.DBUtils.Shortness_of_Breath_Auto_Interview;
import static healthcare_application.Patient_Selection.getPatientID;
import java.util.ArrayList;
import java.util.List;


public class Shortness_of_Breath_Interview extends javax.swing.JFrame {
    
    private int patientID;
    private int RecordID;
    
    
   
    public Shortness_of_Breath_Interview() {
        initComponents();
        User_Modes.View_Only_Mode(this);
        User_Modes.View_Only_Message(this);
//        LockScreen();
    }
    
    public Shortness_of_Breath_Interview(int patientID) {
        setPatientIDSOBA(patientID);
        initComponents();
        initializeTable();
        User_Modes.View_Only_Mode(this);
        User_Modes.View_Only_Message(this);
//        LockScreen();
        
    }
    
    private void refreshForm() {
        this.dispose(); // Close current form
        new Shortness_of_Breath_Interview(getPatientID()).setVisible(true); 
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
        JMenu = new javax.swing.JMenu();
        patientSelectNavBtn = new javax.swing.JMenuItem();
        patientDemoNavBtn = new javax.swing.JMenuItem();
        immunizationsNavBtn = new javax.swing.JMenuItem();
        GMHNavBtn = new javax.swing.JMenuItem();
        familyHistoryNavBtn = new javax.swing.JMenuItem();
        SoBNavBtn = new javax.swing.JMenuItem();
        activityToleranceNavBtn = new javax.swing.JMenuItem();
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

        JMenu.setText("Forms");

        patientSelectNavBtn.setText("Patient Selection");
        patientSelectNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSelectNavBtnActionPerformed(evt);
            }
        });
        JMenu.add(patientSelectNavBtn);

        patientDemoNavBtn.setText("Patient Demographics");
        patientDemoNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDemoNavBtnActionPerformed(evt);
            }
        });
        JMenu.add(patientDemoNavBtn);

        immunizationsNavBtn.setText("Immunizations");
        immunizationsNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                immunizationsNavBtnActionPerformed(evt);
            }
        });
        JMenu.add(immunizationsNavBtn);

        GMHNavBtn.setText("General Medical History");
        GMHNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GMHNavBtnActionPerformed(evt);
            }
        });
        JMenu.add(GMHNavBtn);

        familyHistoryNavBtn.setText("Family History");
        familyHistoryNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyHistoryNavBtnActionPerformed(evt);
            }
        });
        JMenu.add(familyHistoryNavBtn);

        SoBNavBtn.setText("Shortness of Breath Assessment");
        SoBNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoBNavBtnActionPerformed(evt);
            }
        });
        JMenu.add(SoBNavBtn);

        activityToleranceNavBtn.setText("Activity Tolerance Assessment");
        activityToleranceNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityToleranceNavBtnActionPerformed(evt);
            }
        });
        JMenu.add(activityToleranceNavBtn);

        jMenuBar1.add(JMenu);

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

    private void activityToleranceNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityToleranceNavBtnActionPerformed
        Activity_Tolerance_Interview ATA = new  Activity_Tolerance_Interview(getPatientIDSOBA());
        ATA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_activityToleranceNavBtnActionPerformed

    private void menu_Add_RecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Add_RecordActionPerformed
        
        Shortness_of_Breath_Auto_Interview.conductInterview(getPatientIDSOBA());
        refreshForm();
        
    }//GEN-LAST:event_menu_Add_RecordActionPerformed

    private void menu_Edit_ModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Edit_ModeActionPerformed
        User_Modes.Edit_Mode(this);
    }//GEN-LAST:event_menu_Edit_ModeActionPerformed

    private void menu_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_SaveActionPerformed
        
        Shortness_Of_Breath_DBOperations.editSOBAssessment(RecordID, getPatientIDSOBA(), this);
        refreshForm();
    }//GEN-LAST:event_menu_SaveActionPerformed

    private void menu_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_DeleteActionPerformed
        
        Shortness_Of_Breath_DBOperations.deleteSOBAssessment(RecordID, getPatientIDSOBA());
        User_Modes.View_Only_Mode(this);
    }//GEN-LAST:event_menu_DeleteActionPerformed

    private void patientSelectNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSelectNavBtnActionPerformed
        Patient_Selection patient_select = new Patient_Selection();
        patient_select.setVisible(true);
        patient_select.setPatientID(getPatientIDSOBA());
        this.dispose();
    }//GEN-LAST:event_patientSelectNavBtnActionPerformed

    private void GMHNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GMHNavBtnActionPerformed
        GMH_DBOperations gmho = new GMH_DBOperations();
        General_Medical_History history = gmho.getGeneralMedicalHistory(getPatientIDSOBA());
        
        history.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GMHNavBtnActionPerformed

    //Could not find jMenuItem anywhere in the form to delete it. 
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void immunizationsNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_immunizationsNavBtnActionPerformed
        // TODO add your handling code here:
        Immunizations newI = new Immunizations(getPatientID());
        newI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_immunizationsNavBtnActionPerformed

    private void patientDemoNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDemoNavBtnActionPerformed
        // TODO add your handling code here:
        Patient_Demographics newPD = new Patient_Demographics(getPatientID());
        newPD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_patientDemoNavBtnActionPerformed

    private void familyHistoryNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyHistoryNavBtnActionPerformed
        // TODO add your handling code here:
        Family_History newFH = new Family_History(getPatientID());
        newFH.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_familyHistoryNavBtnActionPerformed

    private void SoBNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoBNavBtnActionPerformed
        // TODO add your handling code here:
        Shortness_of_Breath_Interview newSoB = new Shortness_of_Breath_Interview(getPatientID());
        newSoB.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SoBNavBtnActionPerformed

    
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
        cbox_SOBT.setEnabled(false);
        cbox_SOBT.setSelectedIndex(-1);
        
        cbox_SOBScale.setEditable(false);
        cbox_SOBScale.setBackground(Color.lightGray);
        cbox_SOBScale.setEnabled(false);
        cbox_SOBScale.setSelectedIndex(-1);
        
        cbox_SOBYesterday.setEnabled(false);
        cbox_SOBYesterday.setBackground(Color.lightGray);
        cbox_SOBYesterday.setEditable(false);
        cbox_SOBYesterday.setSelectedIndex(-1);
        
        
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
        
         tabl_SOBRecords.clearSelection();
        // Call the PatientDBUtils method to get the ResultSet
        ResultSet rs = Shortness_Of_Breath_DBOperations.PatientDBUtils(patientID);

        if (rs != null) {
            
            
            // Read-only table model
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
           
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

                    row[5] = rs.getInt("SOBID");


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
                        if (selectedRow != -1 && selectedRow < rowDataList.size()) {
                            // Get the values of the selected row from the stored list
                            Object[] selectedRowData = rowDataList.get(selectedRow);
                            String date = (String) selectedRowData[0];
                            String Time = (String) selectedRowData[1];
                            String sob = (String) selectedRowData[2];
                            String severity = (String) selectedRowData[3];
                            String worseYesterday = (String) selectedRowData[4];
                            RecordID = (int) selectedRowData[5];  
                            
                            setRecordID(RecordID);
                            
                            

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
    
    public int getRecordID () {
        return this.RecordID;
    }
    
    public int getPatientIDSOBA () {
        return this.patientID;
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
    
    public void setRecordID (int RecordID) {
        this.RecordID = RecordID;
    }
    
    public void setPatientIDSOBA (int patientID) {
        this.patientID = patientID;
    }
    
    
    
    // Method to get SOB Date from the selected row
    public String getSelectedSOBDate() {
        int selectedRow = tabl_SOBRecords.getSelectedRow();
        if (selectedRow != -1) {
            return tabl_SOBRecords.getValueAt(selectedRow, 0).toString(); // Adjust index if necessary
        }
        return null; // No row selected
    }

    // Method to get SOB Time from the selected row
    public String getSelectedSOBTime() {
        int selectedRow = tabl_SOBRecords.getSelectedRow();
        if (selectedRow != -1) {
            return tabl_SOBRecords.getValueAt(selectedRow, 1).toString(); // Adjust index if necessary
        }
        return null; // No row selected
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GMHNavBtn;
    private javax.swing.JMenu JMenu;
    private javax.swing.JMenuItem SoBNavBtn;
    private javax.swing.JMenuItem activityToleranceNavBtn;
    private javax.swing.JComboBox<String> cbox_SOBScale;
    private javax.swing.JComboBox<String> cbox_SOBT;
    private javax.swing.JComboBox<String> cbox_SOBYesterday;
    private javax.swing.JMenuItem familyHistoryNavBtn;
    private javax.swing.JMenuItem immunizationsNavBtn;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel l_SOBA;
    private javax.swing.JLabel l_SOBScale;
    private javax.swing.JLabel l_SOBToday;
    private javax.swing.JLabel l_SOBYesterday;
    private javax.swing.JMenu menu_Actions;
    private javax.swing.JMenuItem menu_Add_Record;
    private javax.swing.JMenuItem menu_Delete;
    private javax.swing.JMenuItem menu_Edit_Mode;
    private javax.swing.JMenuItem menu_Save;
    private javax.swing.JPanel panel_SOBA;
    private javax.swing.JMenuItem patientDemoNavBtn;
    private javax.swing.JMenuItem patientSelectNavBtn;
    private javax.swing.JTable tabl_SOBRecords;
    // End of variables declaration//GEN-END:variables
}
