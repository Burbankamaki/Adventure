/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

import java.util.Scanner;

/**
 *
 * @author Motoko Kusanagi
 */
public class DriveView {
    
        String choice;
    String command;
           
    private final static String[][] menuItems = {
        {"1", "Take the freeway to work, as usual"},
        {"2", "Try the more relaxing backroads for a change"},       
    };
    
    // Create instance of the HelpMenuControl (action) class
  DriveControl driveControl = new DriveControl();
   
    
    // display the help menu and get the end users input selection
    public void getInput() {       
        

        do {
            this.display();
            command = this.getCommand();
            // get commaned entered

            switch (command) {
                case "1":
                    this.driveControl.optionOne();
                    break;
                case "2":
                    this.driveControl.optionTwo();
                    break;
            }
        } while (!command.equals("1") | !command.equals("2"));    

    }

        // displays the help menu
    public final void display() {
        System.out.println("while driving to work, you encounter the onramp to the freeway"
                        + "\n your usual routine is to take the freeway and fight morning traffic"
                        + "\n though you could always try the back roads for a change...");

        for (int i = 0; i < DriveView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }

    }

    
    
    // retrieves the command entered by the end user
    protected final String getCommand() {
      
            String choice;
            Scanner input = new Scanner(System.in);
        boolean valid = false;
        do {

            choice = input.next();
            valid = validCommand(choice);
            if (!validCommand(choice)) {
                System.out.println("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return choice;
    }
    
    
    // determines if the command is valid
    private boolean validCommand(String command) {
        String[][] items = DriveView.menuItems;

        for (String[] item : DriveView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
}
