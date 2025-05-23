package healthcare_application;

import General_Functionality.*;
import healthcare_application.DBUtils.*;
import healthcare_application.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Family_History extends javax.swing.JFrame {
    Family_History_DBOperations FHops = new Family_History_DBOperations();
    private int modeFlag;
    private int patientID;
    private String PName;
    
    public Family_History() {
        initComponents();
        this.setTitle("Family History");
        User_Modes.View_Only_Mode(this);
        User_Modes.View_Only_Message(this);
        modeFlag = 0;        
    }
    
    public Family_History(int PatientID, String PName){
        initComponents();
        this.setTitle("Family History");
        User_Modes.View_Only_Mode(this);
        fhTable.setEnabled(true);
        User_Modes.View_Only_Message(this);
        setPatientID(PatientID);
        setPName(PName);
        FHops.displayFH(PatientID, fhTable);
    }
    
    public void setPatientID(int newPatientID){
        this.patientID = newPatientID;
    }
    
    public int getPatientID(){
        return this.patientID;
    }
    
    public String getPName(){
        return this.PName;
    }
    
    public void setPName(String PName){
        this.PName = PName;
    }

    public JTextField getNameBox() {
        return nameBox;
    }

    public void setNameBox(JTextField nameBox) {
        this.nameBox = nameBox;
    }

    public JTextField getRelationBox() {
        return relationBox;
    }

    public void setRelationBox(JTextField relationBox) {
        this.relationBox = relationBox;
    }

    public JCheckBox getAliveBox() {
        return aliveBox;
    }

    public void setAliveBox(JCheckBox aliveBox) {
        this.aliveBox = aliveBox;
    }

    public JCheckBox getLWPbox() {
        return LWPbox;
    }

    public void setLWPbox(JCheckBox LWPbox) {
        this.LWPbox = LWPbox;
    }

    public JTextField getMDisorderBox() {
        return MDisorderBox;
    }

    public void setMDisorderBox(JTextField MDisorderBox) {
        this.MDisorderBox = MDisorderBox;
    }

    public JTextField getSDisorderBox() {
        return SDisorderBox;
    }

    public void setSDisorderBox(JTextField SDisorderBox) {
        this.SDisorderBox = SDisorderBox;
    }

    public JCheckBox getHRFbox() {
        return HRFbox;
    }

    public void setHRFbox(JCheckBox HRFbox) {
        this.HRFbox = HRFbox;
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
        MDisorderBox = new javax.swing.JTextField();
        SDisorderBox = new javax.swing.JTextField();
        deletedBox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        aliveBox = new javax.swing.JCheckBox();
        HRFbox = new javax.swing.JCheckBox();
        LWPbox = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        fhTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu = new javax.swing.JMenu();
        patientSelectNavBtn = new javax.swing.JMenuItem();
        patientDemographicsNavBtn = new javax.swing.JMenuItem();
        immunizationsNavBtn = new javax.swing.JMenuItem();
        GMHNavBtn = new javax.swing.JMenuItem();
        familyHistoryNavBtn = new javax.swing.JMenuItem();
        SoBNavBtn = new javax.swing.JMenuItem();
        activityToleranceNavBtn = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        addRecord = new javax.swing.JMenuItem();
        editRecord = new javax.swing.JMenuItem();
        saveRecord = new javax.swing.JMenuItem();
        deleteRecord = new javax.swing.JMenuItem();
        cancelAction = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        startFHInterview = new javax.swing.JMenuItem();

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
        jLabel2.setText("*Patient ID:");
        jLabel2.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel2.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("*Name: ");
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

        MDisorderBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MDisorderBox.setMinimumSize(new java.awt.Dimension(65, 30));
        MDisorderBox.setPreferredSize(new java.awt.Dimension(70, 30));

        SDisorderBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SDisorderBox.setMinimumSize(new java.awt.Dimension(65, 30));
        SDisorderBox.setPreferredSize(new java.awt.Dimension(70, 30));

        deletedBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deletedBox.setMinimumSize(new java.awt.Dimension(65, 30));
        deletedBox.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Family History");

        aliveBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aliveBoxActionPerformed(evt);
            }
        });

        LWPbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LWPboxActionPerformed(evt);
            }
        });

        fhTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Family ID", "Paitent ID", "Name", "Relation", "Alive", "Lives With Patient", "Major Disorder", "Specific Type of Disorder", "Disorder HRF", "Deleted"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        fhTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fhTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(fhTable);
        if (fhTable.getColumnModel().getColumnCount() > 0) {
            fhTable.getColumnModel().getColumn(0).setResizable(false);
            fhTable.getColumnModel().getColumn(1).setResizable(false);
            fhTable.getColumnModel().getColumn(2).setResizable(false);
            fhTable.getColumnModel().getColumn(3).setResizable(false);
            fhTable.getColumnModel().getColumn(4).setResizable(false);
            fhTable.getColumnModel().getColumn(5).setResizable(false);
            fhTable.getColumnModel().getColumn(6).setResizable(false);
            fhTable.getColumnModel().getColumn(7).setResizable(false);
            fhTable.getColumnModel().getColumn(8).setResizable(false);
            fhTable.getColumnModel().getColumn(9).setResizable(false);
        }

        jMenuBar1.setPreferredSize(new java.awt.Dimension(141, 40));

        JMenu.setText("Switch Pages");

        patientSelectNavBtn.setText("Patient Selection");
        patientSelectNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSelectNavBtnActionPerformed(evt);
            }
        });
        JMenu.add(patientSelectNavBtn);

        patientDemographicsNavBtn.setText("Patient Demographics");
        patientDemographicsNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDemographicsNavBtnActionPerformed(evt);
            }
        });
        JMenu.add(patientDemographicsNavBtn);

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

        SoBNavBtn.setText("Shortness of Breath Interview");
        SoBNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoBNavBtnActionPerformed(evt);
            }
        });
        JMenu.add(SoBNavBtn);

        activityToleranceNavBtn.setText("Activity Tolerance Interview");
        activityToleranceNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityToleranceNavBtnActionPerformed(evt);
            }
        });
        JMenu.add(activityToleranceNavBtn);

        jMenuBar1.add(JMenu);

        jMenu2.setText("Actions");

        addRecord.setText("Add Record");
        addRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecordActionPerformed(evt);
            }
        });
        jMenu2.add(addRecord);

        editRecord.setText("Edit Record");
        editRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editRecordActionPerformed(evt);
            }
        });
        jMenu2.add(editRecord);

        saveRecord.setText("Save Record");
        saveRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveRecordActionPerformed(evt);
            }
        });
        jMenu2.add(saveRecord);

        deleteRecord.setText("Delete Record");
        deleteRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRecordActionPerformed(evt);
            }
        });
        jMenu2.add(deleteRecord);

        cancelAction.setText("Cancel Action");
        cancelAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionActionPerformed(evt);
            }
        });
        jMenu2.add(cancelAction);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Interview");

        startFHInterview.setText("Start Family History Interview");
        startFHInterview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startFHInterviewActionPerformed(evt);
            }
        });
        jMenu3.add(startFHInterview);

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
                            .addComponent(MDisorderBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SDisorderBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deletedBox, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(aliveBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HRFbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LWPbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(aliveBox)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LWPbox)
                                .addGap(33, 33, 33)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MDisorderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SDisorderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(HRFbox)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletedBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LWPboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LWPboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LWPboxActionPerformed

    private void aliveBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aliveBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aliveBoxActionPerformed

    private void SoBNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoBNavBtnActionPerformed
        // TODO add your handling code here:
        Shortness_of_Breath_Interview newSOBI = new Shortness_of_Breath_Interview(getPatientID(), getPName());
        LoggerUtility.logFormChange(newSOBI, PName);
        newSOBI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SoBNavBtnActionPerformed

    private void patientSelectNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSelectNavBtnActionPerformed
        // TODO add your handling code here:
        Patient_Selection newPS = new Patient_Selection(getPatientID(), getPName());
        LoggerUtility.logFormChange(newPS, PName);
        newPS.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_patientSelectNavBtnActionPerformed

    private void activityToleranceNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityToleranceNavBtnActionPerformed
        // TODO add your handling code here:
        Activity_Tolerance_Interview newATI = new Activity_Tolerance_Interview(getPatientID(), getPName());
        LoggerUtility.logFormChange(newATI, PName);
        newATI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_activityToleranceNavBtnActionPerformed

    private void patientDemographicsNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDemographicsNavBtnActionPerformed
        // TODO add your handling code here:
        Patient_Demographics newPD = new Patient_Demographics(getPatientID(), getPName());
        LoggerUtility.logFormChange(newPD, PName);
        newPD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_patientDemographicsNavBtnActionPerformed

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

    private void editRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editRecordActionPerformed
        // TODO add your handling code here:
        if(modeFlag == 1 || modeFlag == 3){
            JOptionPane.showMessageDialog(null, "You are already in another mode. You must click Save or Cancel to choose another mode.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        LoggerUtility.logUserAction("edit", PName);
        User_Modes.Edit_Mode(this);
        User_Modes.Edit_Message(this);
        modeFlag = 2;
        }
    }//GEN-LAST:event_editRecordActionPerformed

    private void saveRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveRecordActionPerformed
        // TODO add your handling code here:
         //Initialize transfer variables. 
        //Get text from textboxes and store them in variables for transfer to database via stored procedure. 
        LoggerUtility.logUserAction("save", PName);
        try{     
            //Check user entered valid PID
            String checkPID = PIDbox.getText().trim();
            if (checkPID.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Patient ID cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            else if (!checkPID.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Patient ID must be a valid number.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int ent_PID = Integer.parseInt(PIDbox.getText().trim());
            
            int ent_FID = Integer.parseInt(FIDbox.getText().trim());
            
            //Check user entered valid name
            String checkName = nameBox.getText();
            if(checkName.isEmpty()){
                JOptionPane.showMessageDialog(this, "Patient Name cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            else if(checkName.matches("\\d+")){
                JOptionPane.showMessageDialog(this, "Patient ID cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String ent_Name = nameBox.getText().trim();
            String ent_Relation = relationBox.getText().trim();
            int ent_Alive = aliveBox.isSelected() ? 1 : 0;
            int ent_LWP = LWPbox.isSelected() ? 1 : 0;
            String ent_MajorDisorder = MDisorderBox.getText().trim();
            String ent_SToD = SDisorderBox.getText().trim();
            int ent_HRF = HRFbox.isSelected() ? 1 : 0;
            int ent_deleted = Integer.parseInt(deletedBox.getText().trim());

            switch(modeFlag){
               case 1:
                   FHops.addFHRecord(ent_PID, ent_Name, ent_Relation, ent_Alive, ent_LWP, ent_MajorDisorder, ent_SToD, ent_HRF, ent_deleted);
                   LoggerUtility.logTemplate("User successfully added a log!", PName);
                   break;
               case 2:
                   FHops.editFHRecord(ent_FID, ent_Name, ent_Relation, ent_Alive, ent_LWP, ent_MajorDisorder, ent_SToD, ent_HRF);
                   LoggerUtility.logTemplate("User successfully edited a log!", PName);
                   break;
               case 3:  
                   FHops.delFHRecord(ent_FID);
                   LoggerUtility.logTemplate("User successfully deleted a log!", PName);
                   break;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error performing stored procedure!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        LoggerUtility.logTemplate("User successfully saved their changes!", PName);

        User_Modes.View_Only_Mode(this);
        User_Modes.View_Only_Message(this);
        
        FHops.displayFH(patientID, fhTable);
        fhTable.setEnabled(true);
    }//GEN-LAST:event_saveRecordActionPerformed

    private void deleteRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRecordActionPerformed
        // TODO add your handling code here:
        if(modeFlag == 1 || modeFlag == 2){
            JOptionPane.showMessageDialog(null, "You are already in another mode. You must click Save or Cancel to choose another mode.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            int selectedRow = fhTable.getSelectedRow();
            fhTable.setValueAt(1, selectedRow, 9);            
            LoggerUtility.logUserAction("delete", PName);
            User_Modes.Delete_Message(this);
            modeFlag = 3;
        }
    }//GEN-LAST:event_deleteRecordActionPerformed

    private void addRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordActionPerformed
        // TODO add your handling code here:        
        if(modeFlag == 2 || modeFlag == 3){
            JOptionPane.showMessageDialog(null, "You are already in another mode. You must click Save or Cancel to choose another mode.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            LoggerUtility.logUserAction("add", PName);
            User_Modes.Edit_Mode(this);
            User_Modes.Add_Message(this);
            
            modeFlag = 1;
        }
    }//GEN-LAST:event_addRecordActionPerformed

    private void startFHInterviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startFHInterviewActionPerformed
        // TODO add your handling code here:
        Family_History_Automated_Interview.start(this);
        FHops.displayFH(patientID, fhTable);
    }//GEN-LAST:event_startFHInterviewActionPerformed

    private void cancelActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionActionPerformed
         // TODO add your handling code here:
        LoggerUtility.logTemplate("User Cancelled an Action.", PName);
        JOptionPane.showConfirmDialog(null, "Action Cancelled!", "Cancelled", JOptionPane.INFORMATION_MESSAGE);
        modeFlag = 0;
        User_Modes.View_Only_Message(this);
        User_Modes.View_Only_Mode(this);
        fhTable.setEnabled(true);
    }//GEN-LAST:event_cancelActionActionPerformed

    private void fhTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fhTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = fhTable.getSelectedRow();
        
        if(selectedRow == -1){
            System.out.println("Index out of bounds!!!");
        }
        
        FIDbox.setText(fhTable.getValueAt(selectedRow, 0).toString());
        PIDbox.setText(fhTable.getValueAt(selectedRow, 1).toString());
        nameBox.setText(fhTable.getValueAt(selectedRow, 2).toString());
        relationBox.setText(fhTable.getValueAt(selectedRow, 3).toString());
        aliveBox.setSelected(fhTable.getValueAt(selectedRow, 4).toString().equals("1"));
        LWPbox.setSelected(fhTable.getValueAt(selectedRow, 5).toString().equals("1"));
        MDisorderBox.setText(fhTable.getValueAt(selectedRow, 6).toString());
        SDisorderBox.setText(fhTable.getValueAt(selectedRow, 7).toString());
        HRFbox.setSelected(fhTable.getValueAt(selectedRow, 8).toString().equals("1"));
        deletedBox.setText(fhTable.getValueAt(selectedRow, 9).toString());
    }//GEN-LAST:event_fhTableMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Family_History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FIDbox;
    private javax.swing.JMenuItem GMHNavBtn;
    private javax.swing.JCheckBox HRFbox;
    private javax.swing.JMenu JMenu;
    private javax.swing.JCheckBox LWPbox;
    private javax.swing.JTextField MDisorderBox;
    private javax.swing.JTextField PIDbox;
    private javax.swing.JTextField SDisorderBox;
    private javax.swing.JMenuItem SoBNavBtn;
    private javax.swing.JMenuItem activityToleranceNavBtn;
    private javax.swing.JMenuItem addRecord;
    private javax.swing.JCheckBox aliveBox;
    private javax.swing.JMenuItem cancelAction;
    private javax.swing.JMenuItem deleteRecord;
    private javax.swing.JTextField deletedBox;
    private javax.swing.JMenuItem editRecord;
    private javax.swing.JMenuItem familyHistoryNavBtn;
    private javax.swing.JTable fhTable;
    private javax.swing.JMenuItem immunizationsNavBtn;
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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameBox;
    private javax.swing.JMenuItem patientDemographicsNavBtn;
    private javax.swing.JMenuItem patientSelectNavBtn;
    private javax.swing.JTextField relationBox;
    private javax.swing.JMenuItem saveRecord;
    private javax.swing.JMenuItem startFHInterview;
    // End of variables declaration//GEN-END:variables
}
