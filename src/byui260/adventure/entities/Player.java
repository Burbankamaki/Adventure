/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lisapage
 */
public class Player implements Serializable {
    
    public Player(){
    
    }
    
    
    private static double totalWins=0;
    private static double totalLosses=0;
    
 
    
    
    protected final String getCommand() {
      
            String choice;
            Scanner input = new Scanner(System.in);
        boolean valid = false;
        do {
            choice = input.next();
            if (choice.equals("yes")) {
                break;
            }
            if (choice.equals("no")) {
                break;
            }
            else {
                  System.out.println("Invalid command. Please enter a valid command.");
                  continue;
            }
                
        } while (!valid);
        
        return choice;
    }
    
    
    
        public static void displayWinLossInfo(){
        
        
        System.out.println("you have won\t"+totalWins+"\ttimes. \nyou hae lost\t"+totalLosses+"\ttimes.");
        int winPercentage = 0;
        double trueWinPercentage = winPercentage;
        trueWinPercentage = totalWins / ( totalWins + totalLosses ) * 100;
        
        System.out.println("your total win percentage is\n\t\t"+trueWinPercentage+"%! \ngood job!");
                
        
    }



    public double getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(double totalWins) {
        this.totalWins = totalWins;
    }

    public double getTotalLosses() {
        return totalLosses;
    }

    public void setTotalLosses(double totalLosses) {
        this.totalLosses = totalLosses;
    }

    
        
        
        
    
    
}