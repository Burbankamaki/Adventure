/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.adventure.enums;

/**
 *
 * @author Motoko Kusanagi
 */
public enum HelpMenuTypes {
    
    Instructions ("at the end of every scenario you encounter during the game, there will be a set of options to choose from.\n"+
                           "select your option of choice by typing ONLY the letter or number associated with the option and pressing the enter key.\n"+
                           "sometimes you will be asked to enter a number of your choosing. please be sure your number is a positive whole number.\n"+
                           "have fun and ejoy the game!"),
    ErrorEncounter("If you happen to encounter an error, make sure...\n"+
                            "~that you only use lower case if typing a letter\n"+
                            "there are no other characters in your selection, including spaces\n\n"+
                            "if you are still having trouble, please contact the developers."),
    ChangeName("once we understand how to correctly call and edit variables in other classes\nwe will be able to implement this choice."),
    MinigameInstructions("Lisa Page will write instructions for her mini game here.");
    
    String command;
      String message;
    
    HelpMenuTypes(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return this.message;
    }
}