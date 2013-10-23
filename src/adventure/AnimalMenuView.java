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
public class AnimalMenuView {
 
     String choice;
    String command;
           
    private final static String[][] menuItems = {
        {"1", "Yes! Feed the hungry badger."},
        {"2", "No. Try fighting him instead."}, 
        {"3", "Wait. A.D.D. moment. Play the Guessing Game!"}
                   
    };
    
  
public class AnimalMenuControl{
      AnimalMenuControl animalMenuControl = new AnimalMenuControl();
      
      
       public void getInput() {       
        

        do {
            this.display();
            command = this.getCommand();
            // get commaned entered

            switch (command) {
                case "1":
                    this.animalMenuControl.displayInstructions();
                    break;
                case "2":
                    this.animalMenuControl.displayErrorEncounter();
                    break;
             
            }
        } while (!command.equals("q"));    

    }
       
          public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the number associated with one of the following commands:");

        for (int i = 0; i < AnimalMenuView.menuItems.length; i++) {
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
        String[][] items = AnimalMenuView.menuItems;

        for (String[] item : AnimalMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    

}
}
}
