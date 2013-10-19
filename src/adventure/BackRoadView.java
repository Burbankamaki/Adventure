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
public class BackRoadView {
    
     
       
     String choice;
    String command;
           
    private final static String[][] menuItems = {
        {"1", "RAMMING SPEED! this deer will make good jerky once it is hunted down from the safety of my vehicle!"},
        {"2", "awww! it's got baby deer too! stop the car and paitently wait until the deer move on."},       
    };
    
    // Create instance of the HelpMenuControl (action) class
  BackRoadControl backRoadControl = new BackRoadControl();
   
    
    // display the help menu and get the end users input selection
    public void getInput() {       
        

        do {
            this.display();
            command = this.getCommand();
            // get commaned entered

            switch (command) {
                case "1":
                    this.backRoadControl.optionOne();
                    break;
                case "2":
                    this.backRoadControl.optionTwo();
                    break;
            }
        } while (!command.equals("1") | !command.equals("2"));    

    }

        // displays the help menu
    public final void display() {
        System.out.println("you decide to take the backroads. a deer blocks your path!\nwhat will you do?");

        for (int i = 0; i < BackRoadView.menuItems.length; i++) {
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
        String[][] items = BackRoadView.menuItems;

        for (String[] item : BackRoadView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
}
