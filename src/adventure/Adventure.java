/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

import java.util.Scanner;

/**
 *
 * @author lisapage
 */
public class Adventure {
    
   String name;//Instance variables that we call in our functions.
   String instructions = "The object of the game is to arrive at work successfully. You will encounter obstacles along the way that must\nbe overcome to complete the game. To select an action, type the number assigned to the desired option and hit\nenter. Proceed forward until the game ends in disaster, or you arrive at work and win the game.\n at any time, enter 'i' to display your inventory.\n";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adventure myGame = new Adventure();
        myGame.getName();
        myGame.displayHelp();
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.mainMenu();
        
    }
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name.");
        this.name = input.next();
        
    }
    public void displayHelp(){
        System.out.println("\nWecome " + this.name + "\n");
        System.out.println(this.instructions);
    }
    
    
    
    
}
