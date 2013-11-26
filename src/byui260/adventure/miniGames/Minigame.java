/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.miniGames;

/**
 *
 * @author Burbank
 */
public abstract class Minigame {
    
    
    private static String gameAlert;
    
    public Minigame(String alert){
        Minigame.gameAlert=alert;
    
    }
    
    
    
    
    public static void minigameAlert(String gameAlert){
    
        System.out.println("\n\n***********************************************"+
                            "\n                "+gameAlert+"                \n"+
                               "***********************************************\n\n");
    }
    

    
    public abstract void polymorphExample();
}
