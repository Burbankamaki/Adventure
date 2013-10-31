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
public class GetShopHours {
    
    
      String shopHours[][] = {
        {"Sunday", "12pm-5pm"},
        {"Monday", "9am-5pm"},
        {"Tuesday", "7am-5pm"},
        {"Wednesday", "7am-5pm"},
        {"Thursday", "12pm-5pm"},
        {"Friday", "9am-5pm"},
        {"Saturday", "10am-5pm"},
    };
    
    
    public void showHours(){
        System.out.println("what day is it today? we will see if the bagel shop is open!");
    
        String day = getCommand();
        for (String[] i: shopHours){
           if (i[0].equalsIgnoreCase(day)){
            System.out.println("the shop is open on "+day+" from "+i[1]+
                    "\n the current time is 12pm. the shop is open!");
            break;
            }
      
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
        String[][] items = this.shopHours;

        for (String[] item : this.shopHours) {
            if (item[0].equalsIgnoreCase(command)) {
                return true;
            }
        }
        return false;
    }
    
    }
    
    

