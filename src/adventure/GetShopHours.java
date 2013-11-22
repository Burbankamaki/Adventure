/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

import java.io.Serializable;


/**
 *
 * @author Motoko Kusanagi
 */
public class GetShopHours extends Menu implements Serializable {
    
    public GetShopHours(){
     super(GetShopHours.shopHours);
    }
    
    
      private final static String shopHours[][] = {
        {"Sunday", "12pm-5pm"},
        {"Monday", "9am-5pm"},
        {"Tuesday", "7am-5pm"},
        {"Wednesday", "7am-5pm"},
        {"Thursday", "12pm-5pm"},
        {"Friday", "9am-5pm"},
        {"Saturday", "10am-5pm"},
    };
     private static String day;
    
    @Override
    public void getInput(){
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
    
    
 
    

    
    
 

    public static String[][] getShopHours() {
        return shopHours;
    }

    public static String getDay() {
        return day;
    }

    public static void setDay(String day) {
        GetShopHours.day = day;
    }


    
    
    
    
    
    
    }
    
    

