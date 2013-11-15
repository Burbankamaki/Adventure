/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

/**
 *
 * @author lisapage
 */import java.util.Scanner;

public class BagelMenuView {
    
    int i;
    String selection;
    BagelMenuControl customer = new BagelMenuControl();
   
    
      
    
    public final static String[][] menuItems = {
        {"1", "Blueberry Bagel","2.95"},
        {"2", "Strawberry Bagel", "2.95"}, 
        {"3", "Everything Bagel", "2.95"},
        {"4", "Poppyseed Bagel", "2.95"},
        {"5", "Onion Bagel", "2.95"},
        {"6", "Cheesey Pizza Bagel", "4.95"},
        {"7", "Ham and Swiss Bagel", "4.95"},
        {"8", "Roast Beef and Cheddar Bagel", "4.95"},
    };
            
     public BagelMenuView() {
         
    } 
    
    public void displayMenu(){
        BagelMenuView bagelMenuView = new BagelMenuView();
         System.out.println("Welcome to The Hole Bagel Shop!\n"
                 +"Please choose up to four items off the menu by entering the \n" 
                 +"number associated with the item you wish to purchase. Enter \"q\"\n"
                 +"at any time to finish ordering");
         for (i=0;i<5;i++){
         System.out.println(menuItems[i][0] + menuItems[i][1] + menuItems[i][2]);
     
         }
    }    
    public void getInput(){//change to if else if 
        
        
             int i=0;
             
             
             //gets validated selection value
            do { 
        
             i+=1;
             this.displayMenu();
             selection = this.getSelection();
             
             if (selection.equals("1")) {
                 
                 
                 customer.recordPurchase( menuItems[0][1], menuItems[0][2]);
             }
                
             else if  (selection.equals("2")){
                 customer.recordPurchase( menuItems[1][1], menuItems[1][2]);    
             }       
             else if (selection.equals("3")) {
                     
                  customer.recordPurchase( menuItems[2][1], menuItems[2][2]);   
             }     
                     
             else if (selection.equals("4")){
                     
                   customer.recordPurchase( menuItems[3][1], menuItems[3][2]);
             }      
             else if (selection.equals("5")) {
                     
                   customer.recordPurchase( menuItems[4][1], menuItems[4][2]); 
             }      
             else if (selection.equals("6")){
                   customer.recordPurchase( menuItems[5][1], menuItems[5][2]);
             }      
             else if (selection.equals("7")){
             
                   customer.recordPurchase( menuItems[6][1], menuItems[6][2]);
             }      
             else {
                 
            
                   customer.recordPurchase( menuItems[7][1], menuItems[7][2]);
             }      
             
        }while(i<4);
                    
            customer.displayReceipt();
            
            
    }

                    
             
               
    public String getSelection () {
              
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
    
      private boolean validCommand(String selection) {
        String[][] items = BagelMenuView.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equals(selection)) {
                return true;
            }
        }
        return false;
      }
      
      public void displayMax (){
          double max = customer.findMax();
    System.out.println("The most expensive item on your list is $" + max);
    }
}  
    //write display function
     //write get Input function and get value
     //Array List of bagels purchased--to use several times needs to be an instance variable declared at the top
     //add the item selected to list  
     //Calculate the amount of purchase
     //Display receipt
     //calculate Max compare
     
    
     
     
            