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
            + "\n2.No. Try fighting him instead.";
    String choice;
    int healthPoints = 1;
    
    public void displayStoryScene(){
        System.out.println(animalStory);
        //this.displayStoryOptions();
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
            
            this.displayFightScene();
            
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
    
    public void displayFightScene(){
            
        System.out.println("ok! lets fight the badger!\n first off, how many health points do you have?\n");
        Scanner input = new Scanner(System.in);
        this.healthPoints = input.nextInt();
        if (healthPoints <= 0){
            System.out.println("your hit points cant be zero or less.\nif they were you'd already be dead!");
            return;
        }
        
        double damage = healthPoints;
        damage = damage+1;
        double remainingPoints = healthPoints-damage;
        System.out.println("so you think you have "+healthPoints+" points of health, huh?\nWell, actually\t\t\tNOT ANYMORE! \nThe badger just hit you for "+damage+" damage! \n your remaining hit points are now "+remainingPoints+"\nYou are mortally wounded!");
        
    }
    
}
