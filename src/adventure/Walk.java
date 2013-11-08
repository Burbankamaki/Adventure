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
public class Walk {
    String walkStory = "While walking to work you realize that you have a few extra minutes."
                        + "\n You could cut through the nature preserve to enjoy the scenery,"
                        + "\n or you cound take sidewalk where your favorite bagel shop has"
                        + "\n half-price bagels today.";
    String walkStoryOptions = "\nwhat will you do?"
            + "\n1.Walk through the nature preserve."
            + "\n2.Head to the bagel shop.";
    String choice;
    
    public void displayStoryScene(){
        System.out.println(walkStory);
        this.displayStoryOptions();
    }
    public void displayStoryOptions(){
        System.out.println(walkStoryOptions);
        Scanner input = new Scanner(System.in);
        this.choice = input.next();
        if (choice.equals("1")){
           Animal animal = new Animal();
            animal.displayStoryScene();
        }
        if (choice.equals("2")){
           HitchHiker hitchHiker = new HitchHiker();
           hitchHiker.displayStoryScene();
        }
        else{ 
            System.out.println(choice+" is not a valid option.");
            displayStoryOptions();
        }
    }
    
}
