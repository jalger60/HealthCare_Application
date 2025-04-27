package healthcare_application;

import General_Functionality.User_Modes;

public class Family_History extends javax.swing.JFrame {

    int modeFlag;
    
    public Family_History() {
        initComponents();
        User_Modes.View_Only_Mode(this);
        User_Modes.View_Only_Message(this);
        
        modeFlag = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        FIDbox = new javax.swing.JTextField();
        PIDbox = new javax.swing.JTextField();
        nameBox = new javax.swing.JTextField();
        relationBox = new javax.swing.JTextField();
        aliveBox = new javax.swing.JTextField();
        LWPBox = new javax.swing.JTextField();
        MDisorderBox = new javax.swing.JTextField();
        SDisorderBox = new javax.swing.JTextField();
        DisorderHRFBox = new javax.swing.JTextField();
        deletedBox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        goToActivityTolerance = new javax.swing.JRadioButtonMenuItem();
        goToFamHistory = new javax.swing.JRadioButtonMenuItem();
        goToGenMedHistory = new javax.swing.JRadioButtonMenuItem();
        goToImmunizations = new javax.swing.JRadioButtonMenuItem();
        goToPatientDemos = new javax.swing.JRadioButtonMenuItem();
        goToPatientSelection = new javax.swing.JRadioButtonMenuItem();
        goToShortnessOfBreathInterview = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        addButton = new javax.swing.JRadioButtonMenuItem();
        editButton = new javax.swing.JRadioButtonMenuItem();
        delButton = new javax.swing.JRadioButtonMenuItem();
        saveButton = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        FH_Interview_Btn = new javax.swing.JRadioButtonMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Family ID:");
        jLabel1.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel1.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Patient ID:");
        jLabel2.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel2.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Name: ");
        jLabel3.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel3.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Relation:");
        jLabel4.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel4.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel4.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Alive: ");
        jLabel5.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel5.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel5.setName(""); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Lives With Patient:");
        jLabel6.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel6.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel6.setName(""); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Disorder HRF:");
        jLabel7.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel7.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel7.setName(""); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Deleted:");
        jLabel8.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel8.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel8.setName(""); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Major Disorder:");
        jLabel11.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel11.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel11.setName(""); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Specific Type of Disorder:");
        jLabel12.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel12.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel12.setName(""); // NOI18N

        FIDbox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FIDbox.setMinimumSize(new java.awt.Dimension(65, 30));
        FIDbox.setPreferredSize(new java.awt.Dimension(70, 30));

        PIDbox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PIDbox.setMinimumSize(new java.awt.Dimension(65, 30));
        PIDbox.setPreferredSize(new java.awt.Dimension(70, 30));

        nameBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nameBox.setMinimumSize(new java.awt.Dimension(65, 30));
        nameBox.setPreferredSize(new java.awt.Dimension(70, 30));

        relationBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        relationBox.setMinimumSize(new java.awt.Dimension(65, 30));
        relationBox.setPreferredSize(new java.awt.Dimension(70, 30));

        aliveBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aliveBox.setMinimumSize(new java.awt.Dimension(65, 30));
        aliveBox.setPreferredSize(new java.awt.Dimension(70, 30));

        LWPBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LWPBox.setMinimumSize(new java.awt.Dimension(65, 30));
        LWPBox.setPreferredSize(new java.awt.Dimension(70, 30));

        MDisorderBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MDisorderBox.setMinimumSize(new java.awt.Dimension(65, 30));
        MDisorderBox.setPreferredSize(new java.awt.Dimension(70, 30));

        SDisorderBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SDisorderBox.setMinimumSize(new java.awt.Dimension(65, 30));
        SDisorderBox.setPreferredSize(new java.awt.Dimension(70, 30));

        DisorderHRFBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DisorderHRFBox.setMinimumSize(new java.awt.Dimension(65, 30));
        DisorderHRFBox.setPreferredSize(new java.awt.Dimension(70, 30));

        deletedBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deletedBox.setMinimumSize(new java.awt.Dimension(65, 30));
        deletedBox.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Family History");

        jMenuBar1.setPreferredSize(new java.awt.Dimension(141, 40));

        jMenu1.setText("Switch Pages");

        goToActivityTolerance.setSelected(true);
        goToActivityTolerance.setText("Activity Tolerance Interview");
        goToActivityTolerance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToActivityToleranceActionPerformed(evt);
            }
        });
        jMenu1.add(goToActivityTolerance);

        goToFamHistory.setSelected(true);
        goToFamHistory.setText("Family History");
        goToFamHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToFamHistoryActionPerformed(evt);
            }
        });
        jMenu1.add(goToFamHistory);

        goToGenMedHistory.setSelected(true);
        goToGenMedHistory.setText("General Medical History");
        goToGenMedHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToGenMedHistoryActionPerformed(evt);
            }
        });
        jMenu1.add(goToGenMedHistory);

        goToImmunizations.setSelected(true);
        goToImmunizations.setText("Immunizations");
        goToImmunizations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToImmunizationsActionPerformed(evt);
            }
        });
        jMenu1.add(goToImmunizations);

        goToPatientDemos.setSelected(true);
        goToPatientDemos.setText("Patient Demographics");
        goToPatientDemos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToPatientDemosActionPerformed(evt);
            }
        });
        jMenu1.add(goToPatientDemos);

        goToPatientSelection.setSelected(true);
        goToPatientSelection.setText("Patient Selection");
        goToPatientSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToPatientSelectionActionPerformed(evt);
            }
        });
        jMenu1.add(goToPatientSelection);

        goToShortnessOfBreathInterview.setSelected(true);
        goToShortnessOfBreathInterview.setText("Shortness Of Breath Interview");
        goToShortnessOfBreathInterview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToShortnessOfBreathInterviewActionPerformed(evt);
            }
        });
        jMenu1.add(goToShortnessOfBreathInterview);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Actions");

        addButton.setSelected(true);
        addButton.setText("Add Record");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jMenu2.add(addButton);

        editButton.setSelected(true);
        editButton.setText("Edit Record");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        jMenu2.add(editButton);

        delButton.setSelected(true);
        delButton.setText("Delete Record");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });
        jMenu2.add(delButton);

        saveButton.setSelected(true);
        saveButton.setText("Save Record");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jMenu2.add(saveButton);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Interview");

        FH_Interview_Btn.setSelected(true);
        FH_Interview_Btn.setText("Start Interview");
        jMenu3.add(FH_Interview_Btn);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FIDbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PIDbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(relationBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aliveBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LWPBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MDisorderBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SDisorderBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DisorderHRFBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deletedBox, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(FIDbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(PIDbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(relationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(aliveBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(LWPBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MDisorderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SDisorderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DisorderHRFBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletedBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        modeFlag = 2;
        
        User_Modes.Edit_Mode(this);
        User_Modes.Edit_Message(this);
    }//GEN-LAST:event_editButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        switch(modeFlag){
            case 1:
                
        }
                
    }//GEN-LAST:event_saveButtonActionPerformed

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
         modeFlag = 3;
    }//GEN-LAST:event_delButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
         modeFlag = 1;
    }//GEN-LAST:event_addButtonActionPerformed

    private void goToActivityToleranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToActivityToleranceActionPerformed
        // TODO add your handling code here:
        Activity_Tolerance_Interview newATI = new Activity_Tolerance_Interview();
        newATI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goToActivityToleranceActionPerformed

    private void goToFamHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToFamHistoryActionPerformed
        // TODO add your handling code here:
        Family_History newFH = new Family_History();
        newFH.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goToFamHistoryActionPerformed

    private void goToGenMedHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToGenMedHistoryActionPerformed
        // TODO add your handling code here:
        General_Medical_History newGMH = new General_Medical_History();
        newGMH.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goToGenMedHistoryActionPerformed

    private void goToImmunizationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToImmunizationsActionPerformed
        // TODO add your handling code here:
        Immunizations newI = new Immunizations();
        newI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goToImmunizationsActionPerformed

    private void goToPatientDemosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToPatientDemosActionPerformed
        // TODO add your handling code here:
        Patient_Demographics newPD = new Patient_Demographics();
        newPD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goToPatientDemosActionPerformed

    private void goToPatientSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToPatientSelectionActionPerformed
        // TODO add your handling code here:
        Patient_Selection newPS = new Patient_Selection();
        newPS.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goToPatientSelectionActionPerformed

    private void goToShortnessOfBreathInterviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToShortnessOfBreathInterviewActionPerformed
        // TODO add your handling code here:
        Shortness_of_Breath_Interview newSOBI = new Shortness_of_Breath_Interview();
        newSOBI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goToShortnessOfBreathInterviewActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Family_History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DisorderHRFBox;
    private javax.swing.JRadioButtonMenuItem FH_Interview_Btn;
    private javax.swing.JTextField FIDbox;
    private javax.swing.JTextField LWPBox;
    private javax.swing.JTextField MDisorderBox;
    private javax.swing.JTextField PIDbox;
    private javax.swing.JTextField SDisorderBox;
    private javax.swing.JRadioButtonMenuItem addButton;
    private javax.swing.JTextField aliveBox;
    private javax.swing.JRadioButtonMenuItem delButton;
    private javax.swing.JTextField deletedBox;
    private javax.swing.JRadioButtonMenuItem editButton;
    private javax.swing.JRadioButtonMenuItem goToActivityTolerance;
    private javax.swing.JRadioButtonMenuItem goToFamHistory;
    private javax.swing.JRadioButtonMenuItem goToGenMedHistory;
    private javax.swing.JRadioButtonMenuItem goToImmunizations;
    private javax.swing.JRadioButtonMenuItem goToPatientDemos;
    private javax.swing.JRadioButtonMenuItem goToPatientSelection;
    private javax.swing.JCheckBoxMenuItem goToShortnessOfBreathInterview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField nameBox;
    private javax.swing.JTextField relationBox;
    private javax.swing.JRadioButtonMenuItem saveButton;
    // End of variables declaration//GEN-END:variables
}
