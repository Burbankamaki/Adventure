/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.views;

import java.util.Scanner;

/**
 *
 * @author lisapage
 */
public abstract class Menu {
  
   
   
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
            if (!validCommand(command)) {
                System.out.println("Invalid command. Please enter a valid command.");
                continue;
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
    
   public abstract void getInput(); 
}
