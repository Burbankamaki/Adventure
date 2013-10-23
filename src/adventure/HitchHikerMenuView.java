/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

import java.util.Scanner;

/**
 *
 * @author lisapage
 */
public class HitchHikerMenuView {
   
     String choice;
    String command;
           
    private final static String[][] menuItems = {
        {"1", "Yes! You jump in the car to get to work faster and help a guy"
        +"\nin need."},
        {"2", "No. You give the man directions and opt to walk to work."}, 
       
    };
   
public class HitchHikerMenuControl{
      HitchHikerMenuView.HitchHikerMenuControl hitchHikerMenuControl = new HitchHikerMenuView.HitchHikerMenuControl();
      
      
       public void getInput() {       
        

        do {
            this.display();
            command = this.getCommand();
            // get commaned entered

            switch (command) {
                case "1":
                    this.hitchHikerMenuControl.displayInstructions();
                    break;
                case "2":
                    this.hitchHikerMenuControl.displayErrorEncounter();
                    break;
             
            }
        } while (!command.equals("1" )| !command.equals("2"));    

    } 
       
          public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the number associated with one of the following commands:");

        for (int i = 0; i < HitchHikerMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
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
           private boolean validCommand(String command) {
        String[][] items = HitchHikerMenuView.menuItems;

        for (String[] item : HitchHikerMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    

}
}
}
