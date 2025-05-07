package General_Functionality;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.*;
import javax.swing.JFrame;


public class LoggerUtility {
    private static boolean isInitialized = false;
    private static BufferedWriter writer;
    private static int patientID;
    
    public static void initialize(int PID){
        if(!isInitialized || patientID != PID){
            try{
                if(writer != null){
                    writer.close();
                }
                patientID = PID;
                int logNum = getNextLogNumber(PID);
                String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                String time = new SimpleDateFormat("HH-mm-ss").format(new Date());
                String filename = "LOG#" + logNum + "__Date_" + date + "__TIME_ " + time + "__PATIENT_ID_" + patientID +".txt";
                
                File logDir = new File("logs");
                if(!logDir.exists()){
                    logDir.mkdir();
                }
                
                File logFile = new File(logDir, filename);
                writer = new BufferedWriter(new FileWriter(logFile, true));
                
                isInitialized = true;
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
    
    private static int getNextLogNumber(int patientID){
        int maxLog = 0;
        File dir = new File(".");
        Pattern pattern = Pattern.compile("LOG#(\\d+).*PATIENT_ID_" + patientID + "\\.txt");
        
        for(File file : dir.listFiles()){
            Matcher matcher = pattern.matcher(file.getName());
            if(matcher.matches()){
                int logNum = Integer.parseInt(matcher.group(1));
                if(logNum > maxLog){
                    maxLog = logNum;
                }
            }
        }
        return maxLog + 1;
    }
    
    public static void logTemplate(String action, String name){
        try{
            if(writer != null){
                String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                writer.write("TIME RECORDED: " + time + ", PATIENT'S ID: " + patientID + ", PATIENT'S NAME: " + name + ", ACTION: " + action);
                writer.newLine();
                writer.flush();
            }
        } 
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void logFormChange(JFrame newForm, String PName){
        if (newForm == null){
            return;
        }
        
        String formTitle = newForm.getTitle();
        String action = "";
        
        switch(formTitle){
            case "Patient Selection":
                action = "Went to Patient Selection";
                break;
            case "Patient Demographics":
                action = "Went to Patient Demographics";
                break;
            case "General Medical History":
                action = "Went to General Medical History";
                break;
            case "Family History":
                action = "Went to Family History";
                break;
            case "Immunizations":
                action = "Went to Immunizations";
                break;
            case "Activity Tolerance Interview":
                action = "Went to Activity Tolerance Interview";
                break;
            case "Shortness of Breath Interview":
                action = "Went to Shortness of Breath Interview";
                break;
        }
        
        logTemplate(action, PName);
    }
    
    public static void logUserAction(String action, String PName){
        String actionMessage = "";
        switch(action.toLowerCase()){
            case "add":
                actionMessage = "User added record";
                break;
            case "edit":
                actionMessage = "User added record";
                break;
            case "save": 
                actionMessage = "User saved record";
                break;
            case "delete":
                actionMessage = "User deleted record";
                break;
        }
        
        logTemplate(actionMessage, PName);
    }
    
    public static void closeLog(){
        try{
            if (writer != null){
                writer.close();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
