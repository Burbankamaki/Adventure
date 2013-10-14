package adventure;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Burbank
 */
public class Drive {
    
    String driveStory = "while driving to work, you encounter the onramp to the freeway"
                        + "\n your usual routine is to take the freeway and fight morning traffic"
                        + "\n though you could always try the back roads for a change...";
    String driveStoryOptions = "\nwhat will you do?"
            + "\n1.Take the freeway to work, as usual"
            + "\n2.Try the more relaxing backroads for a change";
    String choice;
    
    public void displayStoryScene(){
        System.out.println(driveStory);
        this.displayStoryOptions();
    }
    public void displayStoryOptions(){
        System.out.println(driveStoryOptions);
        Scanner input = new Scanner(System.in);
        this.choice = input.next();
        if (choice.equals("1")){
            Freeway freeway = new Freeway();
            freeway.displayStoryScene();
        }
        if (choice.equals("2")){
            BackRoad backRoad = new BackRoad();
            backRoad.displayStoryScene();
        }
        if (choice.equals("i")){
            Player player = new Player();
            player.displayInventory();
            displayStoryOptions();
            //INVENTORY IS NOT CURRENTLY WORKING OUTSIDE OF HOME CLASS, THE NEW INSTANCE OF THE
            //CLASS DOES NOT CARRY OVER THE CHANGES MADE TO IT'S INSTANCE VARIABLES FROM THE NEW INSTANCE INSIDE HOME
        }
        else{ 
            System.out.println(choice+" is not a valid option.");
            displayStoryOptions();
        }
    }
}
