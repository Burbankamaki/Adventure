/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.views;

import byui260.adventure.exceptions.MenuException;
import byui260.adventure.interfaces.DisplayInfo;
import byui260.adventure.interfaces.EnterInfo;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lisapage
 */
public abstract class Menu implements DisplayInfo, EnterInfo{
  
   
   
    private final String[][] menuItems;
  
    
    
    
    
    
    public Menu(String[][] newMenuItems){
        this.menuItems = newMenuItems;
    
    }
    
  protected final String getCommand() {
      
            String command;
            Scanner input = new Scanner(System.in);
        boolean valid = false;
        do {

            command = input.next();
            valid = validCommand(command);
            try {
            if (!validCommand(command)) {
                
                    throw new MenuException("Invalid command. Please enter a valid command.");
                } 
                }catch (MenuException ex) {
                    System.out.println("invalid command");
              //  continue;
            }
                
        } while (!valid);
        
        return command;
    }
      
     // determines if the command is valid
    private boolean validCommand(String command) {
        String[][] items = this.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equalsIgnoreCase(command)) {
                return true;
            }
        }
       
        return false;
    }
    
}
