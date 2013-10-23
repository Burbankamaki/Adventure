package adventure;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lisapage
 */ import java.util.Scanner;
 
public class GetGasPrice {
    

    double gallons = 25;
    double price;
    public double getGasPrice (){
       
     while (3.75 * gallons > 40){  
        System.out.println("How many gallons of gas do you want to buy?");
        Scanner input = new Scanner(System.in);
        gallons = input.nextInt();
         
        if (Double.isNaN(gallons)){
            System.out.println("Please enter a valid number.");
            continue;
        }       
                
        if (gallons < 0){
           System.out.println("Please enter 0 or more");
           continue;
        }        
        
        price = 3.75 * gallons;
        
        
     }
     return price;
   }
}