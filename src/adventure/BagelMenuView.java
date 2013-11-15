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
    public double max;
    
      
    
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
        
        
        
             this.displayMenu();
             selection = this.getSelection();
             //gets validated selection value
             Scanner input = new Scanner(System.in);
             
        while (!selection.equals("q"));
        
             this.displayMenu();
             
             if (selection.equals("1"))
                 
                 
                 BagelMenuView.recordPurchase(String[][] menuItems[0][1], menuItems[0][2]);
                
             else if (selection.equals("2"))
                     
                     
             else if (selection.equals("3"))
                     
                     
                   
                     
             else if (selection.equals("4"))
                     
                   
             else if (selection.equals("5")) 
                     
                     
             else if (selection.equals("6"))
                
             else if (selection.equals("7"))
             
             
             else if  (selection.equals("8"))
             
             else
                     System.out.println("Please select a valid number from the menu.");
        } 
                    
             
               
    protected final String getSelection() {
              
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

        for (String[] item : BagelMenuView.menuItems) {
            if (item[0].equals(selection)) {
                return true;
            }
        }
        return false;
      }
      
      public void displayMax(){
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
     
    
     
     
            