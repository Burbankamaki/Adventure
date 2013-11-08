/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

import java.util.Scanner;

/**
 *
 * @author Burbank
 */
public class Freeway {
    
    String freewayStory = "\non the freeway you encounter an angry driver! he's driving aggresively right in from of you!";
    String freewayStoryOptions = "\nwhat will you do?"
            + "\n1.Is this a challenge? Duel the angry driver in a battle of driving skill!"
            + "\n2.Let off the gas in hopes that your reduced speed will put some safe distance between you and the angry driver";
    String choice;
    
    public void displayStoryScene(){
        System.out.println(freewayStory);
        this.displayStoryOptions();
    }
    public void displayStoryOptions(){
        System.out.println(freewayStoryOptions);
        Scanner input = new Scanner(System.in);
        this.choice = input.next();
         if (choice.equals("1")){
            Endgame lose = new Endgame();
            lose.displayCarFreewayHospital();
        }
        if (choice.equals("2")){
            Endgame win = new Endgame();
            win.displayCarFreewayWork();
        }
    
        else{ 
            System.out.println(choice+" is not a valid option.");
            displayStoryOptions();
        }
    }
}
