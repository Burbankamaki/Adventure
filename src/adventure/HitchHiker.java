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
public class HitchHiker {
    String hitchHikerStory = "Great idea! As you saunter down to the bagel shop"
                        +"\nyou notice that you are not the only person hungry for"
                        +"\na bagel. The line of customers extends around the corner."
                        +"\nA car pulls up next to you and the driver asks if you know"
                        +"\nhow to get to the offices of Adventure Sports Media. You tell"
                        +"him yes, that is where you work. He offers to give you a ride.";
                       
    String StoryOptions = "\nWill you catch a ride with the stranger or walk?"
            + "\n1.Yes! You jump in the car to get to work faster and help a guy in "
            + "\nneed."
            + "\n2.No. You give the man directions and opt to walk to work.";
    String choice;
    
    public void displayStoryScene(){
        System.out.println(hitchHikerStory);
        this.displayStoryOptions();
    }
    public void displayStoryOptions(){
        System.out.println(StoryOptions);
        Scanner input = new Scanner(System.in);
        this.choice = input.next();
        if (choice.equals("1")){
            Endgame endgame = new Endgame();
            endgame.displayWalkHitchHikerHospital();
        }
        if (choice.equals("2")){
            Endgame endgame = new Endgame();
            endgame.displayWalkHitchHikerWork();
        }
  
        else{ 
            System.out.println(choice+" is not a valid option.");
            displayStoryOptions();
        }
    }
    
    
}
