package adventure;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
/**
 *
 * @author lisapage
 */ import java.util.Scanner;
 
public class GetGasPrice implements Serializable {
    
    public GetGasPrice(){
    
    }
    

    private static double gallons = 25;
    private static double price;
    
    public static double getGasPrice (){
       System.out.println("you take off in your car for work, but notice the gas is low\n you pull into your neighborhood gas station and notice you have 40 dollars cash.\ngas is currently $3.75 a gallon\nHow many gallons of gas do you want to buy?");
     do{  
        
        Scanner input = new Scanner(System.in);
        String gallonsString = input.next();
        String check = "[0-9]+";
        if (!gallonsString.matches(check)){
            System.out.println("please type only the number of your choice, nothing else.");
            continue;
            }
         gallons = Integer.parseInt(gallonsString);
        
        if (Double.isNaN(gallons)){
            System.out.println("Please enter a valid number. Be sure to enter 0 or more, and that your choice is a whole number.");
            continue;

        }       
                
        if (gallons < 0){
           System.out.println("Please enter 0 or more");
           continue;
        }   
        if (3.75 * gallons > 40){
            System.out.println("you don't have enough money for that much gas! try buying fewer gallons\n");
        }
        
        
        
        
     } while (3.75 * gallons > 40);
     price = 3.75 * gallons;
     return price;
   }

    public double getGallons() {
        return gallons;
    }

    public void setGallons(double gallons) {
        this.gallons = gallons;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    
}