/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Motoko Kusanagi
 */
public class GetShopHours implements Serializable {
    
    public GetShopHours(){
    
    }
    
    
      private static String shopHours[][] = {
        {"Sunday", "12pm-5pm"},
        {"Monday", "9am-5pm"},
        {"Tuesday", "7am-5pm"},
        {"Wednesday", "7am-5pm"},
        {"Thursday", "12pm-5pm"},
        {"Friday", "9am-5pm"},
        {"Saturday", "10am-5pm"},
    };
     private static String day;
    
    
    public static  void showHours(){
        System.out.println("what day is it today? we will see if the bagel shop is open!");
    
         
        day = getCommand();
        for (String[] i: shopHours){
           if (i[0].equalsIgnoreCase(day)){
            System.out.println("the shop is open on "+day+" from "+i[1]+
                    "\n the current time is 12pm. the shop is open!");
            break;
            }
      
        }
        }
    
    
 
    
   // retrieves the command entered by the end user
     private static String getCommand() {
      
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
    private static boolean validCommand(String command) {
        
        for (String[] item : GetShopHours.shopHours) {
            if (item[0].equalsIgnoreCase(command)) {
                return true;
            }
        }
        return false;
    }

    public static String[][] getShopHours() {
        return shopHours;
    }

    public static void setShopHours(String[][] shopHours) {
        GetShopHours.shopHours = shopHours;
    }
    
    
    
    
    
    
    }
    
    

