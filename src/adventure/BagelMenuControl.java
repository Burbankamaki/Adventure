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
    
     double total;
     String command;
     String menuItems;
     BagelMenuControl bagelMenuView;
     public String[][] purchases = new String[4][4];
     int currentPosition = 0;
     int nextPosition = 0;
     public double max;
     String itemDescription;
     String itemPrice;
     double i;
     
      public BagelMenuControl() {
         
    }
     
      BagelMenuControl customer = new BagelMenuControl();
      
     public void recordPurchase(String purchases[][]) {
         do { 
         nextPosition = this.currentPosition + 1;
   
        
         purchases[nextPosition][0] = itemDescription;
         purchases[nextPosition][1] = itemPrice;
         currentPosition = nextPosition;
         }while (currentPosition<5);
     }
public double findMax(){
        for (i=0;i<5;i++){
             max = 0;
            double price = Double.parseDouble(this.purchases[i][2]);
            if (nextPosition == 0){
                
                
            }
            
        
     
        
        }
        return max;
}
         
public void displayReceipt(){
        System.out.println("The Hole Bagel Shop\n"
            + this.purchases[0][1]+"\n"
            + this.purchases[1][1]+"\n"
            + this.purchases[2][1]+"\n"
            + this.purchases[3][1]+"\n"
            + "____________\n"
            + "Total $"+ total+"\n"
            + "               ");

    
}         
    
public double totalDue(this.purchases [0][1],this.purchases[1][1], this.purchases[2][1]){//for each

    for (int i = 0; i < 5; i++) {
        
    
        (String purchases [][]
        this.purchases.[3][1]){
          total = this.purchases[0][1],this.purchases[1][1],
                  this.purchases2][1],this.purchases[3][1];
    
       
    

    }              
    }
 return total;
}

public void displayTotal(){
    
    this.displayMax();
          
            
    
}
}    
    

    
    
    
        

     
