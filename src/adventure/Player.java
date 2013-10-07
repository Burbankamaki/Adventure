/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

/**
 *
 * @author lisapage
 */
public class Player {
    
    Boolean playerWallet = false;
    Boolean playerKeys = false;
    Boolean playerPhone = false;
    Boolean playerLunch = false;
    
    public void displayInventory (){
        System.out.println ("In your inventory, there is...\n");
        if (playerWallet == true){
            System.out.println("your wallet");
        }
        if (playerKeys == true){
            System.out.println("your car keys");
        }
        if (playerPhone == true){
            System.out.println("your cell phone");
        }
        if (playerLunch == true){
            System.out.println("your lunch");
        }
       
    }
    
}
