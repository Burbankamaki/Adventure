/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Burbank
 */
public class MainMenuView implements Serializable {
    
     
   
           
    private final static String[][] menuItems = {
        {"1", "Begin a new game"},
        {"2", "Go to the Help Menu"}, 
        {"3", "View your win percentage"},      
    };
    
    public MainMenuView(){
    
    }
    // Create instance of the HelpMenuControl (action) class
  MainMenuControl mainMenuControl = new MainMenuControl();
   
    
    // display the help menu and get the end users input selection
    public static int mainMenu() {       
        
            String command;
        do {
            display();
            command = getCommand();
            // get commaned entered

            switch (command) {
                case "1":
                    int selection=MainMenuControl.startNewGame();
                    return selection;
                case "2":
                    selection=MainMenuControl.displayHelpMenu();
                    return selection;
                case "3":
                    selection=MainMenuControl.displayWinPercentage();
                    return selection;                  
            }
        } while (!command.equals("1"));  
        return -1;

    }

        // displays the help menu
    private static void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    
    
    // retrieves the command entered by the end user
    private static String getCommand() {
      
            
            Scanner input = new Scanner(System.in);
            String choice;
        boolean valid;
         valid = false;
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
    private static boolean validCommand(String command) {
        String[][] items = MainMenuView.menuItems;

        for (String[] item : MainMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

    
    
    

    public MainMenuControl getMainMenuControl() {
        return mainMenuControl;
    }

    public void setMainMenuControl(MainMenuControl mainMenuControl) {
        this.mainMenuControl = mainMenuControl;
    }
    
}
