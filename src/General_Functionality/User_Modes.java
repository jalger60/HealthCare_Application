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
    
    //Forms will change to this upon user clicking edit buttons. 
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
            "!ATTENTION!\nYou are now in EDIT mode!\nYou may now ADD, DELETE, and EDIT database entries!\nRemember to save your changes by clicking the save button!",
            "Edit Mode Enabled",
            JOptionPane.INFORMATION_MESSAGE
            )
        );
    }
    
    //inform the user that they are in add mode
    public static void Add_Message(Component parent){
        SwingUtilities.invokeLater(() -> 
            JOptionPane.showMessageDialog(
            parent,
            "A new empty record has been added to the database.\nYou are now in EDIT mode.\nPlease fill in the required information for this record using the textboxes.\nRemember to save your changes by clicking the save button!",
            "Record Added",
            JOptionPane.INFORMATION_MESSAGE
            )
        );
    }
    
    //inform the user that they are in delete mode
    public static void Delete_Message(Component parent){
        SwingUtilities.invokeLater(() -> 
                JOptionPane.showMessageDialog(
                parent,
                "This record has been marked for deletion.\n Notice that the deleted field has been set to 1.\nTo restore this record, set this field to 0.\nRemember to save your changes by clicking the save button!",
                "Record Deleted",
                JOptionPane.INFORMATION_MESSAGE
            )
        );
    }

    public static void Successful_Save_Message(Component parent){
        SwingUtilities.invokeLater(() -> 
                JOptionPane.showMessageDialog(
                parent,
                "This record has been saved! Returning to read only mode!",
                "Record Saved",
                JOptionPane.INFORMATION_MESSAGE
            )
        );
    }
    
    public static void Failed_Save_Message(Component parent){
        SwingUtilities.invokeLater(() -> 
                JOptionPane.showMessageDialog(
                parent,
                "Unable to save record! Please contact a system admin for further assistance!",
                "Error",
                JOptionPane.INFORMATION_MESSAGE
            )
        );
    }
    
    
}
    

