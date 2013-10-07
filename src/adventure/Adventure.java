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
        
        Home home = new Home();
        home.displayHomeScene();
        
        //after this line begins the changes made to meet the format for the homework
        Drive drive = new Drive();
        Endgame endgame = new Endgame();
        Freeway freeway = new Freeway();
        Player player = new Player();
        BackRoad backroad = new BackRoad();
        Animal animal = new Animal();
        AnimalEncounter animalencounter = new AnimalEncounter();
        HitchHiker hitchhiker = new HitchHiker();
        Walk walk = new Walk();
        Hospital hospital = new Hospital();
        
        drive.displayStoryScene();
        endgame.displayCarAnimalHospital();
        endgame.displayCarAnimalWork();
        endgame.displayCarFreewayHospital();
        endgame.displayCarFreewayWork();
        freeway.displayStoryScene();
        player.displayInventory();
        backroad.displayStoryScene();
        animal.displayStoryScene();
        animalencounter.displayStoryScene();
        hitchhiker.displayStoryScene();
        walk.displayStoryScene();
        hospital.displayStoryScene();
        
        
        
        //uncomment the next line after homework
        //home.displayHomeOptions();
        
        
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
