/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

import byui260.adventure.views.MainMenuView;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author lisapage
 */
public class Adventure implements Serializable {
    
    
    private static Scenario[] listOfScenarios = new Scenario[7];
   private String name;
   private String instructions = "The object of the game is to arrive at work successfully. You will encounter obstacles along the way that must\nbe overcome to complete the game. To select an action, type the number assigned to the desired option and hit\nenter. Proceed forward until the game ends in disaster, or you arrive at work and win the game.\n at any time, enter 'i' to display your inventory.\n";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adventure myGame = new Adventure();
        
        MainMenuView mainMenuView = new MainMenuView();
        
        
        myGame.getPlayerName();
        myGame.displayHelp();
        
        myGame.createScenarios(listOfScenarios);
        
        do{
        
            
            
        mainMenuView.getInput();
        
            
            
            
            
        
        
        
        
        } while(1==1);
                
        
        
        
    }
    
    
    
    
    
    
    
    private void getPlayerName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name.");
        this.name = input.next();
        
    }
    private void displayHelp(){
        System.out.println("\nWecome " + this.name + "\n");
        System.out.println(this.instructions);
    }
    
    
    
    
private void createScenarios(Scenario[] listOfScenarios) {
        Scenario home = new Scenario();
        home.setInstructions("You are at home and need to get to work quickly. \n");// = "You are at home and need to get to work quickly. \n";
        home.setOption1Description("attempt to drive to work");
        home.setOption2Description("attempt to walk to work");
        home.setOption1ScenarioIndex(1);
        home.setOption2ScenarioIndex(2);
        home.setCurrentIndex(0);
        Adventure.listOfScenarios[0] = home;
       
        
        
        Scenario drive = new Scenario();
        drive.setInstructions("while driving to work, you encounter the onramp to the freeway\n your usual routine is to take the freeway and fight morning traffic\n though you could always try the back roads for a change...");
        drive.setOption1Description("Take the freeway to work, as usual");
        drive.setOption2Description("Try the more relaxing backroads for a change");
        drive.setOption1ScenarioIndex(3);
        drive.setOption2ScenarioIndex(4);
        drive.setCurrentIndex(1);
        Adventure.listOfScenarios[1] = drive;
        
        Scenario walk = new Scenario();
        walk.setInstructions("you decide to walk to work. you could walk through the nature preserve, or though the city");
        walk.setOption1Description("walk through the nature preserve");
        walk.setOption2Description("walk through the city");
        walk.setOption1ScenarioIndex(6);
        walk.setOption2ScenarioIndex(5);
        walk.setCurrentIndex(2);
        Adventure.listOfScenarios[2] = walk;
        
        Scenario freeway = new Scenario();
        freeway.setInstructions("\non the freeway you encounter an angry driver! he's driving aggresively right in from of you!\nwhat will you do?");
        freeway.setOption1Description("Is this a challenge? Duel the angry driver in a battle of driving skill!");
        freeway.setOption2Description("Let off the gas in hopes that your reduced speed will put some safe distance between you and the angry driver");
        freeway.setOption1ScenarioIndex(-3);
        freeway.setOption2ScenarioIndex(-2);
        freeway.setCurrentIndex(3);
        Adventure.listOfScenarios[3] = freeway;
        
        Scenario backroad = new Scenario();
        backroad.setInstructions("you decide to take the backroads. a deer blocks your path!\nwhat will you do?");
        backroad.setOption1Description("RAMMING SPEED! this deer will make good jerky once it is hunted down from the safety of my vehicle!");
        backroad.setOption2Description("awww! it's got baby deer too! stop the car and paitently wait until the deer move on.");
        backroad.setOption1ScenarioIndex(-3);
        backroad.setOption2ScenarioIndex(-2);
        backroad.setCurrentIndex(4);
        Adventure.listOfScenarios[4] = backroad;
        
        Scenario bagelShop = new Scenario();
        bagelShop.setInstructions("you cross by the local bagel shop, you could go in for a bite, but a man stops his car and asks you for directions");
        bagelShop.setOption1Description("get in and show the man the way ");
        bagelShop.setOption2Description("decline to help, you're hungry!");
        bagelShop.setOption1ScenarioIndex(-3);
        bagelShop.setOption2ScenarioIndex(7);//this index value needs to change   !!!!!!!!!!
        bagelShop.setCurrentIndex(5);
        Adventure.listOfScenarios[5] = bagelShop;
        
        Scenario naturePreserve = new Scenario();
        naturePreserve.setInstructions("you take a stroll thruogh the preserve to be met by an angry badger who blocks your path");
        naturePreserve.setOption1Description("feed badger your lunch");
        naturePreserve.setOption2Description("fight the badger out of your way");
        naturePreserve.setOption1ScenarioIndex(-2);
        naturePreserve.setOption2ScenarioIndex(8);//this index value needs to change
        naturePreserve.setCurrentIndex(6);
        Adventure.listOfScenarios[6] = naturePreserve;
        
        
        
        
    }

    public static Scenario[] getListOfScenarios() {
        return listOfScenarios;
    }

    public static void setListOfScenarios(Scenario[] listOfScenarios) {
        Adventure.listOfScenarios = listOfScenarios;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    


       
}
