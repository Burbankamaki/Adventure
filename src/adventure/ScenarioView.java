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
public class ScenarioView {
    Scenario scenario;
    
    public ScenarioView() {
        
        
    }

    
    public static int getInput(Scenario scenario) {
        
        int nextScenarioIndex;
        do {
           //ScenarioControl scenarioControl = new ScenarioControl();
            
            
           String instructions = scenario.getInstructions();
           String option1Description = scenario.getOption1Description();
           String option2Description = scenario.getOption2Description();
                   
            System.out.println(instructions+"\n1. "+option1Description+"\n2. "+option2Description);
            
            String cmd = getCommand();

            if (cmd.equals("1")){
                 nextScenarioIndex = scenario.getOption1ScenarioIndex(); 
            }
            
            else {
                 nextScenarioIndex = scenario.getOption2ScenarioIndex();
            }
            
             nextScenarioIndex = ScenarioControl.minigameCheck(nextScenarioIndex);
             int currentIndex = scenario.getCurrentIndex();
            nextScenarioIndex = ScenarioControl.endgameCheck(currentIndex,nextScenarioIndex);
            
            
            if (nextScenarioIndex==-2 | nextScenarioIndex==-3){
                   return nextScenarioIndex;
            }
            //fix and implement endgame
            Scenario[] scenarioArray = Adventure.getListOfScenarios();
            Scenario nextScenario = scenarioArray[nextScenarioIndex];
            ScenarioView nextScenarioView = new ScenarioView();
            
            nextScenarioIndex=nextScenarioView.getInput(nextScenario);
            
            if (nextScenarioIndex==-2 | nextScenarioIndex==-3){
                   return nextScenarioIndex;
            }
            return nextScenarioIndex;
        } while (1==1);
        
      
      
        
    }
    
    
    
    
        private static final String getCommand() {
      
            String choice;
            Scanner input = new Scanner(System.in);
        boolean valid = false;
        do {

            choice = input.next();
            valid = validCommand(choice);
            if (!validCommand(choice)) {
                System.out.println("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return choice;
    }
    
    
    // determines if the command is valid
    private static boolean validCommand(String command) {    
            if (command.equals("1")|command.equals("2")) {
                return true;
            }
        
        return false;
    }
    
}
