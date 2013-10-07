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
public class Animal {
    String animalStory = "You have chosen to walk through the nature preserve. It"
                        + "\n is a beautiful day. As you walk down the trail you hear"
                        + "\n some rustling in the bushes just ahead. Suddenly,"
                        + "\na badger darts onto the trail in front of you. He is snarling"
                        + "\nand blocking your path. You remember that you packed a ham"
                        + "\nsandwich in your lunch.";
    String animalStoryOptions = "\nDid you remember to bring your lunch?"
            + "\n1.Yes! Feed the hungry badger."
            + "\n2.No. Try jumping over him instead.";
    String choice;
    
    public void displayStoryScene(){
        System.out.println(animalStory);
       // this.displayStoryOptions();
    }
    public void displayStoryOptions(){
        System.out.println(animalStoryOptions);
        Scanner input = new Scanner(System.in);
        this.choice = input.next();
        if (choice.equals("1")){
            AnimalEncounter animalEncounter = new AnimalEncounter();
         animalEncounter.displayStoryScene();
        }
        if (choice.equals("2")){
            Hospital hospital = new Hospital();
         hospital.displayStoryScene();
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
