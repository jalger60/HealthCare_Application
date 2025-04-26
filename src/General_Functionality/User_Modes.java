package General_Functionality;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class User_Modes {
    
    //Form will open in View Only Mode by default when called in GUI initialization method.
    //Set all text fields to non-editable and change their colors to gray.
    //Change all text inside the textboxes to darker gray as well to reflect mode. 
    public static void View_Only_Mode(Container newCont){
        for(Component comp : newCont.getComponents()){
            if(comp instanceof JTextComponent){
                JTextComponent txtBox = (JTextComponent)comp;
                txtBox.setEditable(false);
                txtBox.setBackground(Color.gray);
                txtBox.setForeground(Color.darkGray);
            }
            
            else if(comp instanceof JComboBox){
                JComboBox<?> comboBox = (JComboBox<?>) comp;
                comboBox.setEnabled(false);
                comboBox.setBackground(Color.gray);
                comboBox.setForeground(Color.darkGray);
            }
            
            else if(comp instanceof JTable){
                JTable tbl = (JTable) comp;
                tbl.setEnabled(false);
                tbl.setBackground(Color.gray);
                tbl.setForeground(Color.darkGray);
            }
            
            else if(comp instanceof JButton){
                JButton btn = (JButton) comp;
                btn.setEnabled(false);
                btn.setBackground(Color.gray);
                btn.setForeground(Color.darkGray);
            }
           
            else if(comp instanceof Container){
                View_Only_Mode((Container) comp);
            }
        }
    }
    
    //Display user instructions for View Only Mode via popup message
    public static void View_Only_Message(Component parent){
        SwingUtilities.invokeLater(() -> 
            JOptionPane.showMessageDialog(
                parent,
                "!ATTENTION!\nView Only Mode is enabled!\nTo disable View Only Mode, please select an Action from the Actions Menu!", 
                "View Only Mode Enabled",
                JOptionPane.INFORMATION_MESSAGE
            )
        );
    }
    
    //Forms will change to this upon user clicking the add or edit buttons. 
    //Enable all form compoenents disabled by View_Only_Mode
    public static void Edit_Mode(Container newCont){
        for(Component comp : newCont.getComponents()){
            if(comp instanceof JTextComponent){
                JTextComponent txtBox = (JTextComponent)comp;
                txtBox.setEditable(true);
                txtBox.setBackground(Color.white);
                txtBox.setForeground(Color.black);
            }
            
            else if(comp instanceof JComboBox){
                JComboBox<?> comboBox = (JComboBox<?>) comp;
                comboBox.setEnabled(true);
                comboBox.setBackground(Color.white);
                comboBox.setForeground(Color.black);
            }
            
            else if(comp instanceof JTable){
                JTable tbl = (JTable) comp;
                tbl.setEnabled(true);
                tbl.setBackground(Color.white);
                tbl.setForeground(Color.black);
            }
            
            else if(comp instanceof JButton){
                JButton btn = (JButton) comp;
                btn.setEnabled(true);
                btn.setBackground(Color.white);
                btn.setForeground(Color.black);
            }
            
            else if(comp instanceof Container){
                Edit_Mode((Container) comp);
            }
        }
    }
    
    //Informs user that they are now in edit mode. 
    public static void Edit_Message(Component parent){
        SwingUtilities.invokeLater(() -> 
            JOptionPane.showMessageDialog(
                parent,
                "!ATTENTION!\nYou are now in EDIT mode!\nYou may now ADD, DELETE, and EDIT database entries!\nPlease remember to click SAVE in the actions menu when you are done!",
                "Edit Mode Enabled",
                JOptionPane.INFORMATION_MESSAGE
            )
        );
    }
    //Add text in textboxes to the database as a new entry. 
    public static void Add_Record(){
        
    }
    
    //Allows user to edit the text inside the textboxes and submit them as changes to an existing record in the database. 
    public static void Edit_Record(){
        
    }
    //delete the currently selected record from the database.
    public static void Del_Record(){
        
    }
    
    //Save what is in the textboxes to the database to database.
    public static void Save_Record(){
        
    }
}
