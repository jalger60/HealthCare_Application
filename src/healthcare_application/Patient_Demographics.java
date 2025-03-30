
package healthcare_application;


import javax.swing.*;
import healthcare_application.DBUtils.Patient_Demographics_DBOperations;



public class Patient_Demographics extends javax.swing.JFrame {

    private int PDpatientID;
    Patient_Demographics_DBOperations operations = new Patient_Demographics_DBOperations();
   
    
    public Patient_Demographics() {
        initComponents();
        
        
    }
    
    public Patient_Demographics(int patientID) {
        setPatientID(patientID);
        initComponents();
        
        
        
    }
    
    public int getPatientID() {
        return PDpatientID;
    }
    
    public void setPatientID(int PDpatientID) {
        this.PDpatientID = PDpatientID;
    }
    
    // Getters and setters for JComboBox fields with null or empty check
    public String getCbox_CitizenshipValue() {
        return (String) cbox_Citizenship.getSelectedItem();
    }

    public void setCbox_Citizenship(String value) {
        cbox_Citizenship.setSelectedItem(isNullOrEmpty(value) ? null : value);
    }

    public String getCbox_CountryValue() {
        return (String) cbox_Country.getSelectedItem();
    }

    public void setCbox_Country(String value) {
        cbox_Country.setSelectedItem(isNullOrEmpty(value) ? null : value);
    }

    public String getCbox_EthnicityValue() {
        return (String) cbox_Ethnicity.getSelectedItem();
    }

    public void setCbox_Ethnicity(String value) {
        cbox_Ethnicity.setSelectedItem(isNullOrEmpty(value) ? null : value);
    }

    public String getCbox_GenderValue() {
        return (String) cbox_Gender.getSelectedItem();
    }

    public void setCbox_Gender(String value) {
        cbox_Gender.setSelectedItem(isNullOrEmpty(value) ? null : value);
    }

    public String getCbox_Martial_StatusValue() {
        return (String) cbox_Martial_Status.getSelectedItem();
    }

    public void setCbox_Martial_Status(String value) {
        cbox_Martial_Status.setSelectedItem(isNullOrEmpty(value) ? null : value);
    }

    public String getCbox_StateValue() {
        return (String) cbox_State.getSelectedItem();
    }

    public void setCbox_State(String value) {
        cbox_State.setSelectedItem(isNullOrEmpty(value) ? null : value);
    }

    // Setter for datechooser_DOB with null check
    public void setDatechooser_DOB(com.toedter.calendar.JDateChooser datechooser_DOB) {
        this.datechooser_DOB = (datechooser_DOB != null) ? datechooser_DOB : null;
    }

    // Getter for datechooser_DOB
    public com.toedter.calendar.JDateChooser getDatechooser_DOB() {
        return this.datechooser_DOB;
    }

    // Getter and setter for pass_SSN (Password field)
    public String getPass_SSNValue() {
        return new String(pass_SSN.getPassword());  // Convert char[] to String
    }

    public void setPass_SSN(String value) {
        pass_SSN.setText(isNullOrEmpty(value) ? null : value);
    }

    // Getters and setters for JTextArea fields
    public String getTxtA_CommentsValue() {
        return txtA_Comments.getText();
    }

    public void setTxtA_Comments(String value) {
        txtA_Comments.setText(isNullOrEmpty(value) ? null : value);
    }

    public String getTxtA_CurrentHCPValue() {
        return txtA_CurrentHCP.getText();
    }

    public void setTxtA_CurrentHCP(String value) {
        txtA_CurrentHCP.setText(isNullOrEmpty(value) ? null : value);
    }

    // Getters and setters for JTextField fields
    public String getTxt_CityValue() {
        return txt_City.getText();
    }

    public void setTxt_City(String value) {
        txt_City.setText(isNullOrEmpty(value) ? null : value);
    }

    public String getTxt_Em_Phone_NumValue() {
        return txt_Em_Phone_Num.getText();
    }

    public void setTxt_Em_Phone_Num(String value) {
        txt_Em_Phone_Num.setText(isNullOrEmpty(value) ? null : value);
    }

    public String getTxt_EmailValue() {
        return txt_Email.getText();
    }

    public void setTxt_Email(String value) {
        txt_Email.setText(isNullOrEmpty(value) ? null : value);
    }

    public String getTxt_FirstNameValue() {
        return txt_FirstName.getText();
    }

    public void setTxt_FirstName(String value) {
        txt_FirstName.setText(isNullOrEmpty(value) ? null : value);
    }

    public String getTxt_HomeAddressValue() {
        return txt_HomeAddress.getText();
    }

    public void setTxt_HomeAddress(String value) {
        txt_HomeAddress.setText(isNullOrEmpty(value) ? null : value);
    }

    public String getTxt_LastNameValue() {
        return txt_LastName.getText();
    }

    public void setTxt_LastName(String value) {
        txt_LastName.setText(isNullOrEmpty(value) ? null : value);
    }

    public String getTxt_MobilePhoneValue() {
        return txt_MobilePhone.getText();
    }

    public void setTxt_MobilePhone(String value) {
        txt_MobilePhone.setText(isNullOrEmpty(value) ? null : value);
    }

    public String getTxt_NOKRValue() {
        return txt_NOKR.getText();
    }

    public void setTxt_NOKR(String value) {
        txt_NOKR.setText(isNullOrEmpty(value) ? null : value);
    }

    public String getTxt_Next_of_kinValue() {
        return txt_Next_of_kin.getText();
    }

    public void setTxt_Next_of_kin(String value) {
        txt_Next_of_kin.setText(isNullOrEmpty(value) ? null : value);
    }

    public String getTxt_PreLastNameValue() {
        return txt_PreLastName.getText();
    }

    public void setTxt_PreLastName(String value) {
        txt_PreLastName.setText(isNullOrEmpty(value) ? null : value);
    }

    public String getTxt_ZipCodeValue() {
        return txt_ZipCode.getText();
    }

    public void setTxt_ZipCode(String value) {
        txt_ZipCode.setText(isNullOrEmpty(value) ? null : value);
    }

    // Helper method to check if a value is null or empty
    private boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    
   public void loadPatientData() {
    // Example: Fetch patient data from the database (replace with your actual implementation)
    
    
        // Populate the form fields with the patient's data
        txt_LastName.setText(getTxt_LastNameValue());
        txt_PreLastName.setText(getTxt_PreLastNameValue());
        txt_FirstName.setText(getTxt_FirstNameValue());
        txt_HomeAddress.setText(getTxt_HomeAddressValue());
        txt_City.setText(getTxt_CityValue());
        cbox_State.setSelectedItem(getCbox_StateValue());
        txt_ZipCode.setText(getTxt_ZipCodeValue());
        cbox_Country.setSelectedItem(getCbox_CountryValue());
        cbox_Citizenship.setSelectedItem(getCbox_CitizenshipValue());
        txt_MobilePhone.setText(getTxt_MobilePhoneValue());
        txt_Em_Phone_Num.setText(getTxt_Em_Phone_NumValue());
        txt_Email.setText(getTxt_EmailValue());
        pass_SSN.setText(getPass_SSNValue());

        
        java.util.Date dob = datechooser_DOB.getDate();
        if (dob != null) {
            setDatechooser_DOB(datechooser_DOB);  // If date is selected, set the DOB
        } else {
            setDatechooser_DOB(null);  // Set as null if no date is selected
        }
        
        cbox_Gender.setSelectedItem(getCbox_GenderValue());
        cbox_Ethnicity.setSelectedItem(getCbox_EthnicityValue());
        cbox_Martial_Status.setSelectedItem(getCbox_Martial_StatusValue());
        txtA_CurrentHCP.setText(getTxtA_CurrentHCPValue());
        txtA_Comments.setText(getTxtA_CommentsValue());
        txt_NOKR.setText(getTxt_NOKRValue());
        txt_Next_of_kin.setText(getTxt_Next_of_kinValue());
    
}
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_PDTitle = new javax.swing.JLabel();
        panel_PDemographics = new javax.swing.JPanel();
        lbl_FirstName = new javax.swing.JLabel();
        txt_FirstName = new javax.swing.JTextField();
        lbl_LastName = new javax.swing.JLabel();
        txt_LastName = new javax.swing.JTextField();
        lbl_PtPreLastName = new javax.swing.JLabel();
        txt_PreLastName = new javax.swing.JTextField();
        lbl_Home_Address = new javax.swing.JLabel();
        txt_HomeAddress = new javax.swing.JTextField();
        lbl_City = new javax.swing.JLabel();
        txt_City = new javax.swing.JTextField();
        lbl_State = new javax.swing.JLabel();
        cbox_State = new javax.swing.JComboBox<>();
        lbl_ZipCode = new javax.swing.JLabel();
        txt_ZipCode = new javax.swing.JTextField();
        lbl_Country = new javax.swing.JLabel();
        cbox_Country = new javax.swing.JComboBox<>();
        lbl_Citizenship = new javax.swing.JLabel();
        cbox_Citizenship = new javax.swing.JComboBox<>();
        lbl_MobilePhone = new javax.swing.JLabel();
        lbl_EmPhoneNum = new javax.swing.JLabel();
        lbl_Email = new javax.swing.JLabel();
        txt_MobilePhone = new javax.swing.JTextField();
        txt_Em_Phone_Num = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        lbl_SSN = new javax.swing.JLabel();
        lbl_DOB = new javax.swing.JLabel();
        pass_SSN = new javax.swing.JPasswordField();
        datechooser_DOB = new com.toedter.calendar.JDateChooser();
        lbl_Gender = new javax.swing.JLabel();
        cbox_Gender = new javax.swing.JComboBox<>();
        cbox_Ethnicity = new javax.swing.JComboBox<>();
        lbl_Ethnic = new javax.swing.JLabel();
        lbl_MartialStatus = new javax.swing.JLabel();
        cbox_Martial_Status = new javax.swing.JComboBox<>();
        lbl_CurrentHCP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_CurrentHCP = new javax.swing.JTextArea();
        lbl_Comments = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtA_Comments = new javax.swing.JTextArea();
        lbl_NextofKin = new javax.swing.JLabel();
        lbl_NOKRP = new javax.swing.JLabel();
        txt_Next_of_kin = new javax.swing.JTextField();
        txt_NOKR = new javax.swing.JTextField();
        menu_PatientDemographics = new javax.swing.JMenuBar();
        menu_Forms = new javax.swing.JMenu();
        menu_Actions = new javax.swing.JMenu();
        menu_Add = new javax.swing.JMenuItem();
        menu_Edit = new javax.swing.JMenuItem();
        menu_Save = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_PDTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_PDTitle.setText("Patient Demographics ");

        lbl_FirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_FirstName.setText("First Name");

        txt_FirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbl_LastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_LastName.setText("Last Name");

        txt_LastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbl_PtPreLastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_PtPreLastName.setText("Previous Last Name");

        txt_PreLastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbl_Home_Address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Home_Address.setText("Home Address");

        txt_HomeAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbl_City.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_City.setText("City");

        txt_City.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbl_State.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_State.setText("State");

        cbox_State.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbox_State.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));

        lbl_ZipCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_ZipCode.setText("Zip Code");

        lbl_Country.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Country.setText("Country");

        cbox_Country.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbox_Country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo (Congo-Brazzaville)", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czechia (Czech Republic)", "Democratic Republic of the Congo (Congo-Kinshasa)", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea (North)", "Korea (South)", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar (Burma)", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Timor-Leste", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));

        lbl_Citizenship.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Citizenship.setText("Citizenship");

        cbox_Citizenship.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbox_Citizenship.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghan", "Albanian", "Algerian", "Andorran", "Angolan", "Antiguan or Barbudan", "Argentine", "Armenian", "Australian", "Austrian", "Azerbaijani", "Bahamian", "Bahraini", "Bangladeshi", "Barbadian", "Belarusian", "Belgian", "Belizean", "Beninese", "Bhutanese", "Bolivian", "Bosnian or Herzegovinian", "Botswanan", "Brazilian", "Bruneian", "Bulgarian", "Burkinabé", "Burundian", "Cape Verdean", "Cambodian", "Cameroonian", "Canadian", "Central African", "Chadian", "Chilean", "Chinese", "Colombian", "Comoran", "Congolese", "Costa Rican", "Croatian", "Cuban", "Cypriot", "Czech", "Congolese", "Danish", "Djiboutian", "Dominican", "Dominican", "Ecuadorian", "Egyptian", "Salvadoran", "Equatorial Guinean", "Eritrean", "Estonian", "Swazi", "Ethiopian", "Fijian", "Finnish", "French", "Gabonese", "Gambian", "Georgian", "German", "Ghanaian", "Greek", "Grenadian", "Guatemalan", "Guinean", "Guinean-Bissauan", "Guyanese", "Haitian", "Honduran", "Hungarian", "Icelander", "Indian", "Indonesian", "Iranian", "Iraqi", "Irish", "Israeli", "Italian", "Jamaican", "Japanese", "Jordanian", "Kazakhstani", "Kenyan", "I-Kiribati", "North Korean", "South Korean", "Kuwaiti", "Kyrgyz", "Laotian", "Latvian", "Lebanese", "Mosotho", "Liberian", "Libyan", "Liechtensteinian", "Lithuanian", "Luxembourger", "Malagasy", "Malawian", "Malaysian", "Maldivian", "Malian", "Maltese", "Marshallese", "Mauritanian", "Mauritian", "Mexican", "Micronesian", "Moldovan", "Monegasque", "Mongolian", "Montenegrin", "Moroccan", "Mozambican", "Burmese", "Namibian", "Nauruan", "Nepali", "Dutch", "New Zealander", "Nicaraguan", "Nigerien", "Nigerian", "Macedonian", "Norwegian", "Omani", "Pakistani", "Palauan", "Panamanian", "Papua New Guinean", "Paraguayan", "Peruvian", "Filipino or Filipina", "Polish", "Portuguese", "Qatari", "Romanian", "Russian", "Rwandan", "Kittitian or Nevisian", "Saint Lucian", "Vincentian", "Samoan", "Sammarinese", "São Toméan", "Saudi", "Senegalese", "Serbian", "Seychellois", "Sierra Leonean", "Singaporean", "Slovak", "Slovenian", "Solomon Islander", "Somali", "South African", "South Sudanese", "Spanish", "Sri Lankan", "Sudanese", "Surinamese", "Swedish", "Swiss", "Syrian", "Taiwanese", "Tajik", "Tanzanian", "Thai", "Timorese", "Togolese", "Tongan", "Trinidadian or Tobagonian", "Tunisian", "Turkish", "Turkmen", "Tuvaluan", "Ugandan", "Ukrainian", "Emirati", "British", "American", "Uruguayan", "Uzbek", "Ni-Vanuatu", "Vatican", "Venezuelan", "Vietnamese", "Yemeni", "Zambian", "Zimbabwean" }));

        lbl_MobilePhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_MobilePhone.setText("Mobile Phone");

        lbl_EmPhoneNum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_EmPhoneNum.setText("Emergency Contact Number");

        lbl_Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Email.setText("Email Address");

        txt_MobilePhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_Em_Phone_Num.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbl_SSN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_SSN.setText("SSN");

        lbl_DOB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_DOB.setText("Date of Birth");

        pass_SSN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        datechooser_DOB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbl_Gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Gender.setText("Gender");

        cbox_Gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbox_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Non-Binary" }));

        cbox_Ethnicity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbox_Ethnicity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "African American", "Alaska Native", "American Indian", "Arab American", "Asian American", "Black", "Caucasian", "Chicano", "Hispanic", "Latino", "Mixed Race", "Native American", "Native Hawaiian", "Pacific Islander" }));

        lbl_Ethnic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Ethnic.setText("Ethnicity");

        lbl_MartialStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_MartialStatus.setText("Martial Status");

        cbox_Martial_Status.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbox_Martial_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Divorced", "Legally Separated", "Married", "Never Married", "Single", "Widowed" }));

        lbl_CurrentHCP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_CurrentHCP.setText("Current Primary Health Care Provider");
        lbl_CurrentHCP.setToolTipText("");

        txtA_CurrentHCP.setColumns(20);
        txtA_CurrentHCP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtA_CurrentHCP.setRows(5);
        jScrollPane1.setViewportView(txtA_CurrentHCP);

        lbl_Comments.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Comments.setText("Comments");
        lbl_Comments.setToolTipText("");

        txtA_Comments.setColumns(20);
        txtA_Comments.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtA_Comments.setRows(5);
        jScrollPane2.setViewportView(txtA_Comments);

        lbl_NextofKin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_NextofKin.setText("Next of Kin");
        lbl_NextofKin.setToolTipText("");

        lbl_NOKRP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_NOKRP.setText("Relationship to Patient (Next of Kin)");

        txt_Next_of_kin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_NOKR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout panel_PDemographicsLayout = new javax.swing.GroupLayout(panel_PDemographics);
        panel_PDemographics.setLayout(panel_PDemographicsLayout);
        panel_PDemographicsLayout.setHorizontalGroup(
            panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PDemographicsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_PDemographicsLayout.createSequentialGroup()
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PDemographicsLayout.createSequentialGroup()
                                .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_PtPreLastName)
                                    .addComponent(lbl_LastName)
                                    .addComponent(lbl_FirstName)
                                    .addComponent(lbl_Home_Address))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_PreLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                        .addComponent(txt_LastName)
                                        .addComponent(txt_FirstName))
                                    .addComponent(txt_HomeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_PDemographicsLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_State)
                                    .addComponent(lbl_City)
                                    .addComponent(lbl_ZipCode)
                                    .addComponent(lbl_Country))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_City, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbox_State, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbox_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_PDemographicsLayout.createSequentialGroup()
                                .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_PDemographicsLayout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addComponent(lbl_CurrentHCP))
                                    .addGroup(panel_PDemographicsLayout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_MartialStatus)
                                            .addComponent(lbl_Gender))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbox_Martial_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbox_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel_PDemographicsLayout.createSequentialGroup()
                                .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_PDemographicsLayout.createSequentialGroup()
                                        .addGap(167, 167, 167)
                                        .addComponent(lbl_Comments))
                                    .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_PDemographicsLayout.createSequentialGroup()
                                            .addGap(84, 84, 84)
                                            .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl_NextofKin)))
                                        .addGroup(panel_PDemographicsLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txt_Next_of_kin, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                                .addComponent(lbl_NOKRP)
                                                .addComponent(txt_NOKR)))))
                                .addContainerGap(101, Short.MAX_VALUE))))
                    .addGroup(panel_PDemographicsLayout.createSequentialGroup()
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Citizenship, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_MobilePhone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_EmPhoneNum, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Email, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_SSN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_DOB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Ethnic, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_MobilePhone)
                                .addComponent(txt_Em_Phone_Num)
                                .addComponent(txt_Email)
                                .addComponent(pass_SSN, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(datechooser_DOB, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                            .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbox_Citizenship, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbox_Ethnicity, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        panel_PDemographicsLayout.setVerticalGroup(
            panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PDemographicsLayout.createSequentialGroup()
                .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_PDemographicsLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_FirstName)
                            .addComponent(txt_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Gender)
                            .addComponent(cbox_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_MartialStatus)
                            .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_LastName)
                                .addComponent(cbox_Martial_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_CurrentHCP)
                            .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_PtPreLastName)
                                .addComponent(txt_PreLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_PDemographicsLayout.createSequentialGroup()
                                .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_Home_Address)
                                    .addComponent(txt_HomeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_City))
                                .addGap(18, 18, 18)
                                .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_State)
                                    .addComponent(cbox_State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ZipCode)
                            .addComponent(txt_ZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PDemographicsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_Comments)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_PDemographicsLayout.createSequentialGroup()
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Country)
                            .addComponent(cbox_Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Citizenship)
                            .addComponent(cbox_Citizenship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbox_Ethnicity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Ethnic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_MobilePhone)
                            .addComponent(txt_MobilePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Em_Phone_Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_EmPhoneNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Email)
                            .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_SSN)
                            .addComponent(pass_SSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_PDemographicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_DOB)
                            .addComponent(datechooser_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_PDemographicsLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_NextofKin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Next_of_kin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_NOKRP)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_NOKR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        menu_PatientDemographics.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menu_Forms.setText("Forms");
        menu_PatientDemographics.add(menu_Forms);

        menu_Actions.setText("Actions");

        menu_Add.setText("Add Record");
        menu_Actions.add(menu_Add);

        menu_Edit.setText("Edit Record");
        menu_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_EditActionPerformed(evt);
            }
        });
        menu_Actions.add(menu_Edit);

        menu_Save.setText("Save Record");
        menu_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_SaveActionPerformed(evt);
            }
        });
        menu_Actions.add(menu_Save);

        menu_PatientDemographics.add(menu_Actions);

        setJMenuBar(menu_PatientDemographics);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_PDTitle)
                .addGap(312, 312, 312))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_PDemographics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_PDTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_PDemographics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_SaveActionPerformed
        
       
        
        
        
    }//GEN-LAST:event_menu_SaveActionPerformed

    private void menu_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_EditActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_EditActionPerformed

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
            java.util.logging.Logger.getLogger(Patient_Demographics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_Demographics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_Demographics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_Demographics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_Demographics().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbox_Citizenship;
    private javax.swing.JComboBox<String> cbox_Country;
    private javax.swing.JComboBox<String> cbox_Ethnicity;
    private javax.swing.JComboBox<String> cbox_Gender;
    private javax.swing.JComboBox<String> cbox_Martial_Status;
    private javax.swing.JComboBox<String> cbox_State;
    private com.toedter.calendar.JDateChooser datechooser_DOB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Citizenship;
    private javax.swing.JLabel lbl_City;
    private javax.swing.JLabel lbl_Comments;
    private javax.swing.JLabel lbl_Country;
    private javax.swing.JLabel lbl_CurrentHCP;
    private javax.swing.JLabel lbl_DOB;
    private javax.swing.JLabel lbl_EmPhoneNum;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_Ethnic;
    private javax.swing.JLabel lbl_FirstName;
    private javax.swing.JLabel lbl_Gender;
    private javax.swing.JLabel lbl_Home_Address;
    private javax.swing.JLabel lbl_LastName;
    private javax.swing.JLabel lbl_MartialStatus;
    private javax.swing.JLabel lbl_MobilePhone;
    private javax.swing.JLabel lbl_NOKRP;
    private javax.swing.JLabel lbl_NextofKin;
    private javax.swing.JLabel lbl_PDTitle;
    private javax.swing.JLabel lbl_PtPreLastName;
    private javax.swing.JLabel lbl_SSN;
    private javax.swing.JLabel lbl_State;
    private javax.swing.JLabel lbl_ZipCode;
    private javax.swing.JMenu menu_Actions;
    private javax.swing.JMenuItem menu_Add;
    private javax.swing.JMenuItem menu_Edit;
    private javax.swing.JMenu menu_Forms;
    private javax.swing.JMenuBar menu_PatientDemographics;
    private javax.swing.JMenuItem menu_Save;
    private javax.swing.JPanel panel_PDemographics;
    private javax.swing.JPasswordField pass_SSN;
    private javax.swing.JTextArea txtA_Comments;
    private javax.swing.JTextArea txtA_CurrentHCP;
    private javax.swing.JTextField txt_City;
    private javax.swing.JTextField txt_Em_Phone_Num;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_FirstName;
    private javax.swing.JTextField txt_HomeAddress;
    private javax.swing.JTextField txt_LastName;
    private javax.swing.JTextField txt_MobilePhone;
    private javax.swing.JTextField txt_NOKR;
    private javax.swing.JTextField txt_Next_of_kin;
    private javax.swing.JTextField txt_PreLastName;
    private javax.swing.JTextField txt_ZipCode;
    // End of variables declaration//GEN-END:variables
}
