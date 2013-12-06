package byui260.adventure.miniGames;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import byui260.adventure.exceptions.GasPriceException;
import byui260.adventure.exceptions.MenuException;
import java.io.Serializable;
/**
 *
 * @author lisapage
 */ import java.util.Scanner;
 
public class GetGasPrice extends Minigame implements Serializable {
    
    public GetGasPrice(){
        super(FightScene.fightMinigameAlert);
    }
    

    private static double gallons = 25;
    private static double price;
    public final static String fightMinigameAlert="MINIGAME TIME!!  GAS STATION!!";
    
    
    
        @Override
 public void polymorphExample(){
                    System.out.println("this is an example of polymorphism, this code can be differnet than the other examples in the other subclasses");
                            int example=(3*5)/10; //different code!  
                            int answer=example*3;
                            System.out.println(answer);
                    }
    
    
    public static double getGasPrice (){
        minigameAlert(fightMinigameAlert);
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
        
        try {
        if (3.75 * gallons > 40){
            throw new GasPriceException("you don't have enough money for that much gas! try buying fewer gallons\n");
        }
        }catch (GasPriceException ex) {
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