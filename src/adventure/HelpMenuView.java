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
public class HelpMenuView {
    
    String choice;
    String command;
           
    private final static String[][] menuItems = {
        {"a", "instructions to play the game"},
        {"b", "what to do if you encounter an error"}, 
        {"c", "change your user name"},
        {"d", "instructions for the mini-game"},
        {"q", "quit and return to main menu"},       
    };
    
    // Create instance of the HelpMenuControl (action) class
  HelpMenuControl helpMenuControl = new HelpMenuControl();
   
    
    // display the help menu and get the end users input selection
    public void getInput() {       
        

        do {
            this.display();
            command = this.getCommand();
            // get commaned entered

            switch (command) {
                case "a":
                    this.helpMenuControl.displayInstructions();
                    break;
                case "b":
                    this.helpMenuControl.displayErrorEncounter();
                    break;
                case "c":
                    this.helpMenuControl.displayChangeUserName();
                    break;                  
                case "d":
                    this.helpMenuControl.displayMiniGameInstructions();
                    break;
                case "q":
                    System.out.println("goodbye");
                    break;
            }
        } while (!command.equals("q"));    

    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
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
        String[][] items = HelpMenuView.menuItems;

        for (String[] item : HelpMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
    
}
