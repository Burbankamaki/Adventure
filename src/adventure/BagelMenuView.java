/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

/**
 *
 * @author lisapage
 */import java.util.Scanner;
   import java.io.Serializable;

public class BagelMenuView extends Menu{
    
    public BagelMenuView() {
         super(BagelMenuView.bagelMenuItems);
    } 
    
    private int i;
    private String selection;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public BagelMenuControl getCustomer() {
        return customer;
    }

    public void setCustomer(BagelMenuControl customer) {
        this.customer = customer;
    }
    BagelMenuControl customer = new BagelMenuControl();
   
    
      
    
   private final static String[][] bagelMenuItems = {
        {"1", "Blueberry Bagel","2.95"},
        {"2", "Strawberry Bagel", "2.95"}, 
        {"3", "Everything Bagel", "2.95"},
        {"4", "Poppyseed Bagel", "2.95"},
        {"5", "Onion Bagel", "2.95"},
        {"6", "Cheesey Pizza Bagel", "4.95"},
        {"7", "Ham and Swiss Bagel", "4.95"},
        {"8", "Roast Beef and Cheddar Bagel", "4.95"},
    };

    public void setSelection(String selection) {
        this.selection = selection;
    }

    public static String[][] getMenuItems() {
        return bagelMenuItems;
    }
            
     
    
    private void displayMenu(){
        BagelMenuView bagelMenuView = new BagelMenuView();
         System.out.println("Welcome to The Hole Bagel Shop!\n"
                 +"Please choose up to four items off the menu by entering the \n" 
                 +"number associated with the item you wish to purchase. Enter \"q\"\n"
                 +"at any time to finish ordering");
         for (i=0;i<5;i++){
         System.out.println(bagelMenuItems[i][0] + bagelMenuItems[i][1] + bagelMenuItems[i][2]);
     
         }
    }
    @Override
    public void getInput(){//change to if else if 
        
        
             int i=0;
             
             
             //gets validated selection value
            do { 
        
             i+=1;
             this.displayMenu();
             selection = this.getCommand();
             
             if (selection.equals("1")) {
                 
                 
                 customer.recordPurchase( bagelMenuItems[0][1], bagelMenuItems[0][2]);
             }
                
             else if  (selection.equals("2")){
                 customer.recordPurchase(bagelMenuItems[1][1], bagelMenuItems[1][2]);    
             }       
             else if (selection.equals("3")) {
                     
                  customer.recordPurchase( bagelMenuItems[2][1], bagelMenuItems[2][2]);   
             }     
                     
             else if (selection.equals("4")){
                     
                   customer.recordPurchase( bagelMenuItems[3][1], bagelMenuItems[3][2]);
             }      
             else if (selection.equals("5")) {
                     
                   customer.recordPurchase( bagelMenuItems[4][1], bagelMenuItems[4][2]); 
             }      
             else if (selection.equals("6")){
                   customer.recordPurchase( bagelMenuItems[5][1], bagelMenuItems[5][2]);
             }      
             else if (selection.equals("7")){
             
                   customer.recordPurchase( bagelMenuItems[6][1], bagelMenuItems[6][2]);
             }      
             else {
                 
            
                   customer.recordPurchase( bagelMenuItems[7][1], bagelMenuItems[7][2]);
             }      
             
        }while(i<4);
                    
            customer.displayReceipt();
            
            
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
     
    
     
     
            