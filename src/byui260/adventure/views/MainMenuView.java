/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.views;

import byui260.adventure.controls.MainMenuControl;
import byui260.adventure.entities.Player;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Burbank
 */
public class MainMenuView extends Menu implements Serializable {
    
     
   
           
    private final static String[][] mainMenuItems = {
        {"1", "Begin a new game"},
        {"2", "Go to the Help Menu"}, 
        {"3", "View your win percentage"},      
    };
    Player player = new Player();
    
    public MainMenuView(){
      super(MainMenuView.mainMenuItems);
    }
   
    // display the help menu and get the end users input selection
    @Override
    public void getInput() {       
        
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
    @Override
    public void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.mainMenuItems.length; i++) {
            System.out.println("\t   " + mainMenuItems[i][0] + "\t" + mainMenuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    
    

    
    
 

    
    
    

 
    
}
