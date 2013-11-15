/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

import java.util.Scanner;

/**
 *
 * @author Burbank
 */
public class MainMenuView {
    
     private static String choice;
   private static String command;
           
    private final static String[][] menuItems = {
        {"1", "Begin a new game"},
        {"2", "Go to the Help Menu"}, 
        {"3", "View your win percentage"},      
    };
    
    // Create instance of the HelpMenuControl (action) class
  MainMenuControl mainMenuControl = new MainMenuControl();
   
    
    // display the help menu and get the end users input selection
    public int mainMenu() {       
        

        do {
            this.display();
            command = this.getCommand();
            // get commaned entered

            switch (command) {
                case "1":
                    int selection=this.mainMenuControl.startNewGame();
                    return selection;
                case "2":
                    selection=this.mainMenuControl.displayHelpMenu();
                    return selection;
                case "3":
                    selection=this.mainMenuControl.displayWinPercentage();
                    return selection;                  
            }
        } while (!command.equals("1"));  
        return -1;

    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
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
        String[][] items = MainMenuView.menuItems;

        for (String[] item : MainMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    
}
