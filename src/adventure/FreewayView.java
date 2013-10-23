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
public class FreewayView {
    
     
       
     String choice;
    String command;
           
    private final static String[][] menuItems = {
        {"1", "Is this a challenge? Duel the angry driver in a battle of driving skill!"},
        {"2", "Let off the gas in hopes that your reduced speed will put some safe distance between you and the angry driver"},       
    };
    
    // Create instance of the HelpMenuControl (action) class
  FreewayControl freewayControl = new FreewayControl();
   
    
    // display the help menu and get the end users input selection
    public void getInput() {       
        

        do {
            this.display();
            command = this.getCommand();
            // get commaned entered

            switch (command) {
                case "1":
                    this.freewayControl.optionOne();
                    break;
                case "2":
                    this.freewayControl.optionTwo();
                    break;
            }
        } while (!command.equals("1") | !command.equals("2"));    

    }

        // displays the help menu
    public final void display() {
        System.out.println("\non the freeway you encounter an angry driver! he's driving aggresively right in from of you!\nwhat will you do?");

        for (int i = 0; i < FreewayView.menuItems.length; i++) {
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
        String[][] items = FreewayView.menuItems;

        for (String[] item : FreewayView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
}
