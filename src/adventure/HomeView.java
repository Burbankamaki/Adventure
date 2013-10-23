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
public class HomeView {
    
       
     String choice;
    String command;
           
    private final static String[][] menuItems = {
        {"1", "attempt to drive to work"},
        {"2", "attempt to walk to work"},       
    };
    
    // Create instance of the HelpMenuControl (action) class
  HomeControl homeControl = new HomeControl();
   
    
    // display the help menu and get the end users input selection
    public void getInput() {       
        

        do {
            this.display();
            command = this.getCommand();
            // get commaned entered

            switch (command) {
                case "1":
                    this.homeControl.optionOne();
                    break;
                case "2":
                    this.homeControl.optionTwo();
                    break;
            }
        } while (!command.equals("1") | !command.equals("2"));    

    }

        // displays the help menu
    public final void display() {
        System.out.println("You are at home and need to get to work quickly. \n");

        for (int i = 0; i < HomeView.menuItems.length; i++) {
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
        String[][] items = HomeView.menuItems;

        for (String[] item : HomeView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    
    
    
    
}
