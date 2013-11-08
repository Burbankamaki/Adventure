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
    
    
    public static Scenario[] listOfScenarios = new Scenario[7];
   String name;//Instance variables that we call in our functions.
   String instructions = "The object of the game is to arrive at work successfully. You will encounter obstacles along the way that must\nbe overcome to complete the game. To select an action, type the number assigned to the desired option and hit\nenter. Proceed forward until the game ends in disaster, or you arrive at work and win the game.\n at any time, enter 'i' to display your inventory.\n";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adventure myGame = new Adventure();
        Player player = new Player();
        MainMenuView mainMenuView = new MainMenuView();
        
        
        myGame.getName();
        myGame.displayHelp();
        
        myGame.createScenarios(listOfScenarios);
        
        do{
        
        int selection=mainMenuView.mainMenu();
        
            switch (selection){

                    case 1: ScenarioView scenario = new ScenarioView(listOfScenarios[0]);
                        int winIndex=scenario.getInput();
                        if (winIndex==-2){player.totalWins=player.totalWins+1;}
                        if (winIndex==-3){player.totalLosses++;}
                        break;
                case 2: HelpMenuView helpMenuView = new HelpMenuView();
                       helpMenuView.getInput();
                        break;
                case 3:player.displayWinLossInfo();
                        break;
            }
            
            
        
        
        
        
        } while(1==1);
                
        
        
        
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
    
    
    
    
private void createScenarios(Scenario[] listOfScenarios) {
        Scenario home = new Scenario();
        home.instructions = "You are at home and need to get to work quickly. \n";
        home.option1Description = "attempt to drive to work";
        home.option2Description = "attempt to walk to work";
        home.option1ScenarioIndex = 1;
        home.option2ScenarioIndex = 2;
        home.currentIndex=0;
        Adventure.listOfScenarios[0] = home;
       
        
        
        Scenario drive = new Scenario();
        drive.instructions = "while driving to work, you encounter the onramp to the freeway\n your usual routine is to take the freeway and fight morning traffic\n though you could always try the back roads for a change...";
        drive.option1Description = "Take the freeway to work, as usual";
        drive.option2Description = "Try the more relaxing backroads for a change";
        drive.option1ScenarioIndex = 3;
        drive.option2ScenarioIndex = 4;
        drive.currentIndex = 1;
        Adventure.listOfScenarios[1] = drive;
        
        Scenario walk = new Scenario();
        walk.instructions = "you decide to walk to work. you could walk through the nature preserve, or though the city";
        walk.option1Description = "walk through the nature preserve";
        walk.option2Description = "walk through the city";
        walk.option1ScenarioIndex = 6;
        walk.option2ScenarioIndex = 5;
        walk.currentIndex = 2;
        Adventure.listOfScenarios[2] = walk;
        
        Scenario freeway = new Scenario();
        freeway.instructions = "\non the freeway you encounter an angry driver! he's driving aggresively right in from of you!\nwhat will you do?";
        freeway.option1Description = "Is this a challenge? Duel the angry driver in a battle of driving skill!";
        freeway.option2Description = "Let off the gas in hopes that your reduced speed will put some safe distance between you and the angry driver";
        freeway.option1ScenarioIndex = -3;
        freeway.option2ScenarioIndex = -2;
        freeway.currentIndex = 3;
        Adventure.listOfScenarios[3] = freeway;
        
        Scenario backroad = new Scenario();
        backroad.instructions = "you decide to take the backroads. a deer blocks your path!\nwhat will you do?";
        backroad.option1Description = "RAMMING SPEED! this deer will make good jerky once it is hunted down from the safety of my vehicle!";
        backroad.option2Description = "awww! it's got baby deer too! stop the car and paitently wait until the deer move on.";
        backroad.option1ScenarioIndex = -3;
        backroad.option2ScenarioIndex = -2;
        backroad.currentIndex = 4;
        Adventure.listOfScenarios[4] = backroad;
        
        Scenario bagelShop = new Scenario();
        bagelShop.instructions = "you cross by the local bagel shop, you could go in for a bite, but a man stops his car and asks you for directions";
        bagelShop.option1Description = "get in and show the man the way ";
        bagelShop.option2Description = "decline to help, you're hungry!";
        bagelShop.option1ScenarioIndex = -3;
        bagelShop.option2ScenarioIndex = 7;//this index value needs to change   !!!!!!!!!!
        bagelShop.currentIndex = 5;
        Adventure.listOfScenarios[5] = bagelShop;
        
        Scenario naturePreserve = new Scenario();
        naturePreserve.instructions = "you take a stroll thruogh the preserve to be met by an angry badger who blocks your path";
        naturePreserve.option1Description = "feed badger your lunch";
        naturePreserve.option2Description = "fight the badger out of your way";
        naturePreserve.option1ScenarioIndex = -2;
        naturePreserve.option2ScenarioIndex = 8;//this index value needs to change
        naturePreserve.currentIndex = 6;
        Adventure.listOfScenarios[6] = naturePreserve;
        
        
        
        
    }
    
       
}
