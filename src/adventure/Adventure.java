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
        home.instructions = "Welcome to my home";
        home.option1Description = "Take a ride";
        home.option2Description = "Take a walk";
        home.option1ScenarioIndex = 1;
        home.option2ScenarioIndex = 2;
        home.currentIndex=0;
        Adventure.listOfScenarios[0] = home;
       
        
        
        Scenario drive = new Scenario();
        drive.instructions = "Going for a drive";//Get Gas Price Game needs to fit somehow
        drive.option1Description = "Take a freeeay";
        drive.option2Description = "Take a backroad";
        drive.option1ScenarioIndex = 3;
        drive.option2ScenarioIndex = 4;
        drive.currentIndex = 1;
        Adventure.listOfScenarios[1] = drive;
        
        Scenario walk = new Scenario();
        walk.instructions = "walk";
        walk.option1Description = "nature preserve";
        walk.option2Description = "bagel shop";
        walk.option1ScenarioIndex = 6;
        walk.option2ScenarioIndex = 5;
        walk.currentIndex = 2;
        Adventure.listOfScenarios[2] = walk;
        
        Scenario freeway = new Scenario();
        freeway.instructions = "freeway inst";
        freeway.option1Description = "leads to lose";
        freeway.option2Description = "leads to win";
        freeway.option1ScenarioIndex = -3;
        freeway.option2ScenarioIndex = -2;
        freeway.currentIndex = 3;
        Adventure.listOfScenarios[3] = freeway;
        
        Scenario backroad = new Scenario();
        backroad.instructions = "backroad";
        backroad.option1Description = "leads to loss";
        backroad.option2Description = "leads to win";
        backroad.option1ScenarioIndex = -3;
        backroad.option2ScenarioIndex = -2;
        backroad.currentIndex = 4;
        Adventure.listOfScenarios[4] = backroad;
        
        Scenario bagelShop = new Scenario();
        bagelShop.instructions = "bagelShop";
        bagelShop.option1Description = "leads to loss by hitchhiker";
        bagelShop.option2Description = "leads to bagelMenu minigame, then to win";
        bagelShop.option1ScenarioIndex = -3;
        bagelShop.option2ScenarioIndex = 7;//this index value needs to change   !!!!!!!!!!
        bagelShop.currentIndex = 5;
        Adventure.listOfScenarios[5] = bagelShop;
        
        Scenario naturePreserve = new Scenario();
        naturePreserve.instructions = "nature preserve";
        naturePreserve.option1Description = "feed badger and win";
        naturePreserve.option2Description = "fight badger. 1 guess badger's weight, 2. healthpoints game, 3. end with loss or win";
        naturePreserve.option1ScenarioIndex = -2;
        naturePreserve.option2ScenarioIndex = 8;//this index value needs to change
        naturePreserve.currentIndex = 6;
        Adventure.listOfScenarios[6] = naturePreserve;
        
        
        
        
    }
    
       
}
