/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.controls;
import java.io.Serializable;


/**
 *
 * @author lisapage
 */
public class BagelMenuControl implements Serializable {
    

     private String command;
     private String menuItems;
     private BagelMenuControl bagelMenuView;
     private String[][] purchases = new String[4][4];
     private int currentPosition = -1;
     private int nextPosition = 0;
     private double max;
     private double i;
     
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

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String menuItems) {
        this.menuItems = menuItems;
    }

    public BagelMenuControl getBagelMenuView() {
        return bagelMenuView;
    }

    public void setBagelMenuView(BagelMenuControl bagelMenuView) {
        this.bagelMenuView = bagelMenuView;
    }

    public String[][] getPurchases() {
        return purchases;
    }

    public void setPurchases(String[][] purchases) {
        this.purchases = purchases;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getNextPosition() {
        return nextPosition;
    }

    public void setNextPosition(int nextPosition) {
        this.nextPosition = nextPosition;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
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






}    
    

    
    
    
        

     
