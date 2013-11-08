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
public class Home {
    String homeStory = "You are at home and need to get to work quickly. \nThere are several items to help you along your way. \n";
    Boolean wallet = true;
    Boolean keys = true;
    Boolean phone = true;
    Boolean lunch = true;
    String choice;
    Player player = new Player();
    
    
    public void displayHomeScene(){
        System.out.println(this.homeStory);
        if (wallet == true){
            System.out.println("Your wallet is on your dresser.");
        }
        if (keys == true){
            System.out.println("Your keys are on the kitchen table.");
        } 
        if (lunch == true){
            System.out.println("Your lunch is in the refrigerator.");
        }
        if (phone == true){
            System.out.println("Your phone is in your office on the desk.");
        }
        displayHomeOptions();
    }   
    public void displayHomeOptions(){
        System.out.println("\nwhat will you do?\n"
                + "\n1.attempt to drive to work."
                + "\n2.attempt to walk to work.");
        
        Scanner input = new Scanner(System.in);
        this.choice = input.next();
        if (choice.equals("1") && this.keys == true){
            System.out.println("How do you plan on taking your car to work if you don't have your keys?");
            displayHomeOptions();
        }
        if (choice.equals("1") && this.keys == false){
            Drive drive = new Drive();
            drive.displayStoryScene();
        }
        if (choice.equals("2")){
            System.out.println("You head out the door for a relaxing walk to work. \nYou get the feeling that the change of pace and the crisp morning air will be good for you!");
            Walk walk = new Walk();
            walk.displayStoryScene();
        }

        else{ System.out.println(choice+" is not a valid option.");
            displayHomeOptions();
        }
    }
}        
        