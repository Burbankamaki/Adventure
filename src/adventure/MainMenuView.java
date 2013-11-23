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
public class MainMenuView extends Menu implements Serializable {
    
     
   
           
   
    Player player = new Player();
    
    public MainMenuView(){
      super(MainMenuView.mainMenuItems);
    }
   
    
    
     private final static String[][] mainMenuItems = {
        {"1", "Begin a new game"},
        {"2", "Go to the Help Menu"}, 
        {"3", "View your win percentage"},      
    };
    
    
    // display the help menu and get the end users input selection
    @Override
    public  void getInput() {       
        
            String command;
        do {
            display();
            command = getCommand();
            int intcommand = Integer.parseInt(command);
            // get commaned entered

            switch (intcommand){

                    case 1: 
                        MainMenuControl.startNewGame(player);
                            break;
                        
                        

                case 2: 
                        MainMenuControl.displayHelpMenu();
                    break;
                case 3:        
                        MainMenuControl.displayWinPercentage();
                    break;
            }
        } while (!command.equals("1"));  
        

    }

        // displays the help menu
    private static void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.mainMenuItems.length; i++) {
            System.out.println("\t   " + mainMenuItems[i][0] + "\t" + mainMenuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    
    

    
    
 

    
    
    

 
    
}
