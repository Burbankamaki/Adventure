/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;



/**
 *
 * @author lisapage
 */
public class BagelMenuControl {
    

     String command;
     String menuItems;
     BagelMenuControl bagelMenuView;
     public String[][] purchases = new String[4][4];
     int currentPosition = -1;
     int nextPosition = 0;
     public double max;
     
     double i;
     
      public BagelMenuControl() {
         
    }
     
      
     public void recordPurchase(String itemDescription, String itemPrice) {
         currentPosition ++; 
         nextPosition = this.currentPosition;
   
        
         purchases[nextPosition][0] = itemDescription;
         purchases[nextPosition][1] = itemPrice;
         
        
     }
public double findMax(){
        double max = -Double.MAX_VALUE;
        for (int i=0;i<4;i++){
            double price = Double.parseDouble(this.purchases[i][1]);
            if (max<price){
                max=price;
                
                
            }
            
        
     
        
        }
        return max;
}
         
public void displayReceipt(){
          double finalmax=this.findMax();
          double total=this.totalDue(purchases);
        System.out.println("The Hole Bagel Shop\n"
            + this.purchases[0][1]+"\n"
            + this.purchases[1][1]+"\n"
            + this.purchases[2][1]+"\n"
            + this.purchases[3][1]+"\n"
            + "____________\n"
            + "Total $"+ total+"\n"
            + "               \n"
            +"The most expensive item on your list is $" + finalmax);


    
}         
    
public double totalDue(String [][]purchases){//for each
        double total=0;
    for (String[]i:purchases) {
        double price=Double.parseDouble(i[1]);
        
         total=total+price;
      
    }
    return total;
    }
 


public void displayTotal(){}
}    
    

    
    
    
        

     
