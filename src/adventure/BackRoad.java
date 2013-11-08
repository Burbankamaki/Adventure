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
public class BackRoad {
    
    String backRoadStory = "you decide to take the backroads. a deer blocks your path!";
    String backRoadStoryOptions = "\nwhat will you do?"
            + "\n1.RAMMING SPEED! this deer will make good jerky once it is hunted down from the safety of my vehicle!"
            + "\n2.awww! it's got baby deer too! stop the car and paitently wait until the deer move on.";
    String choice;
            
    
    public void displayStoryScene(){
        System.out.println(backRoadStory);
        this.displayStoryOptions();
    }
    public void displayStoryOptions(){
        System.out.println(backRoadStoryOptions);
        Scanner input = new Scanner(System.in);
        this.choice = input.next();
        if (choice.equals("1")){
            Endgame lose = new Endgame();
            lose.displayCarAnimalHospital();
        }
        if (choice.equals("2")){
            Endgame win = new Endgame();
            win.displayCarAnimalWork();
        }

        else{ 
            System.out.println(choice+" is not a valid option.");
            displayStoryOptions();
        }
    }
    
}
