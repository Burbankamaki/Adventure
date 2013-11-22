/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

/**
 *
 * @author Burbank
 */
public class MainMenuControl {
    private static Scenario[] listOfScenarios = new Scenario[7];
    
    
    public static void startNewGame(Player player){
        
        
       
        
        Scenario home = new Scenario();
        home.setInstructions("You are at home and need to get to work quickly. \n");// = "You are at home and need to get to work quickly. \n";
        home.setOption1Description("attempt to drive to work");
        home.setOption2Description("attempt to walk to work");
        home.setOption1ScenarioIndex(1);
        home.setOption2ScenarioIndex(2);
        home.setCurrentIndex(0);
        listOfScenarios[0] = home;
       
        
        
        Scenario drive = new Scenario();
        drive.setInstructions("while driving to work, you encounter the onramp to the freeway\n your usual routine is to take the freeway and fight morning traffic\n though you could always try the back roads for a change...");
        drive.setOption1Description("Take the freeway to work, as usual");
        drive.setOption2Description("Try the more relaxing backroads for a change");
        drive.setOption1ScenarioIndex(3);
        drive.setOption2ScenarioIndex(4);
        drive.setCurrentIndex(1);
        listOfScenarios[1] = drive;
        
        Scenario walk = new Scenario();
        walk.setInstructions("you decide to walk to work. you could walk through the nature preserve, or though the city");
        walk.setOption1Description("walk through the nature preserve");
        walk.setOption2Description("walk through the city");
        walk.setOption1ScenarioIndex(6);
        walk.setOption2ScenarioIndex(5);
        walk.setCurrentIndex(2);
        listOfScenarios[2] = walk;
        
        Scenario freeway = new Scenario();
        freeway.setInstructions("\non the freeway you encounter an angry driver! he's driving aggresively right in from of you!\nwhat will you do?");
        freeway.setOption1Description("Is this a challenge? Duel the angry driver in a battle of driving skill!");
        freeway.setOption2Description("Let off the gas in hopes that your reduced speed will put some safe distance between you and the angry driver");
        freeway.setOption1ScenarioIndex(-3);
        freeway.setOption2ScenarioIndex(-2);
        freeway.setCurrentIndex(3);
        listOfScenarios[3] = freeway;
        
        Scenario backroad = new Scenario();
        backroad.setInstructions("you decide to take the backroads. a deer blocks your path!\nwhat will you do?");
        backroad.setOption1Description("RAMMING SPEED! this deer will make good jerky once it is hunted down from the safety of my vehicle!");
        backroad.setOption2Description("awww! it's got baby deer too! stop the car and paitently wait until the deer move on.");
        backroad.setOption1ScenarioIndex(-3);
        backroad.setOption2ScenarioIndex(-2);
        backroad.setCurrentIndex(4);
        listOfScenarios[4] = backroad;
        
        Scenario bagelShop = new Scenario();
        bagelShop.setInstructions("you cross by the local bagel shop, you could go in for a bite, but a man stops his car and asks you for directions");
        bagelShop.setOption1Description("get in and show the man the way ");
        bagelShop.setOption2Description("decline to help, you're hungry!");
        bagelShop.setOption1ScenarioIndex(-3);
        bagelShop.setOption2ScenarioIndex(7);//this index value needs to change   !!!!!!!!!!
        bagelShop.setCurrentIndex(5);
        listOfScenarios[5] = bagelShop;
        
        Scenario naturePreserve = new Scenario();
        naturePreserve.setInstructions("you take a stroll thruogh the preserve to be met by an angry badger who blocks your path");
        naturePreserve.setOption1Description("feed badger your lunch");
        naturePreserve.setOption2Description("fight the badger out of your way");
        naturePreserve.setOption1ScenarioIndex(-2);
        naturePreserve.setOption2ScenarioIndex(8);//this index value needs to change
        naturePreserve.setCurrentIndex(6);
        listOfScenarios[6] = naturePreserve;
        
        
        
                        ScenarioView scenario = new ScenarioView();
                        int winIndex;
                        winIndex = ScenarioView.getInput(listOfScenarios[0]);
                        if (winIndex==-2){ double totalWins=player.getTotalWins();
                                            totalWins++;
                                           player.setTotalWins(totalWins);
                                           
                        }
                        if (winIndex==-3){
                                             double totalLosses=player.getTotalLosses();
                                             totalLosses++;
                                             player.setTotalLosses(totalLosses);
                                             
                        }
        
        
    }
    
    public static void displayHelpMenu(){
        HelpMenuView helpMenuView = new HelpMenuView();
                       helpMenuView.getInput();
    }
    
    public static void displayWinPercentage(){
        Player.displayWinLossInfo();
                        
    }
        
    
}
