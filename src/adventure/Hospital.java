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
public class Hospital {
    String hospitalStory ="\nCringing in pain you reach for your phone to call for help.";
                       
    String hospitalStoryOptions = "\nDid you remember to bring your phone from home?"
            + "\n1.Yes! Call for help!"
            + "\n2.No. Rats.";
    String choice;
    
    public void displayStoryScene(){
        System.out.println(hospitalStory);
        this.displayStoryOptions();
    }
    public void displayStoryOptions(){
        System.out.println(hospitalStoryOptions);
        Scanner input = new Scanner(System.in);
        this.choice = input.next();
        if (choice.equals("1")){
            Endgame endgame = new Endgame();
            endgame.displayWalkHospitalWork();
        }
        if (choice.equals("2")){
            Endgame endgame = new Endgame();
            endgame.displayWalkHospitalHospital();
        }

        else{ 
            System.out.println(choice+" is not a valid option.");
            displayStoryOptions();
        }
    }
    
}
