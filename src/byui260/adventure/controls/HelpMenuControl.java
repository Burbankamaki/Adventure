/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.controls;

import cit260.adventure.enums.HelpMenuTypes;

/**
 *
 * @author Motoko Kusanagi
 */
public class HelpMenuControl {
    
 
    
    public static void displayInstructions(){
        System.out.println(HelpMenuTypes.Instructions.getMessage());

    
    }
    public static void displayErrorEncounter(){
        System.out.println(HelpMenuTypes.ErrorEncounter.getMessage());

        
    }
    public static void displayChangeUserName(){
        System.out.println(HelpMenuTypes.ChangeName.getMessage());
    }
    public static void displayMiniGameInstructions(){
        System.out.println(HelpMenuTypes.MinigameInstructions.getMessage());

    }
    
}
