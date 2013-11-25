/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.views;

import byui260.adventure.controls.HelpMenuControl;



public class HelpMenuView extends Menu{
    
    String choice;
    String command;
           
    private final static String[][] helpMenuItems = {
        {"a", "instructions to play the game"},
        {"b", "what to do if you encounter an error"}, 
        {"c", "change your user name"},
        {"d", "instructions for the mini-game"},
        {"q", "quit and return to main menu"},       
    };
     
    public HelpMenuView(){
        super(HelpMenuView.helpMenuItems);
    }
    // Create instance of the HelpMenuControl (action) class
      HelpMenuControl helpMenuControl = new HelpMenuControl();
  
    @Override// display the help menu and get the end users input selection
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

        for (int i = 0; i < HelpMenuView.helpMenuItems.length; i++) {
            System.out.println("\t   " + helpMenuItems[i][0] + "\t" + helpMenuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    
    
    
    }
    
    
  
    
    
    
    

    
  
