/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

/**
 *
 * @author Motoko Kusanagi
 */
public class HelpMenuControl {
    
 
    
    public static void displayInstructions(){
        System.out.println("at the end of every scenario you encounter during the game, there will be a set of options to choose from.\n"+
                           "select your option of choice by typing ONLY the letter or number associated with the option and pressing the enter key.\n"+
                           "sometimes you will be asked to enter a number of your choosing. please be sure your number is a positive whole number.\n"+
                           "have fun and ejoy the game!");

    
    }
    public static void displayErrorEncounter(){
        System.out.println("If you happen to encounter an error, make sure...\n"+
                            "~that you only use lower case if typing a letter\n"+
                            "there are no other characters in your selection, including spaces\n\n"+
                            "if you are still having trouble, please contact the developers.");

        
    }
    public static void displayChangeUserName(){
        System.out.println("once we understand how to correctly call and edit variables in other classes\nwe will be able to implement this choice.");

    }
    public static void displayMiniGameInstructions(){
        System.out.println("Lisa Page will write instructions for her mini game here.");

    }
    
}
