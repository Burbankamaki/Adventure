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
    
    public ScenarioView(Scenario scenario) {
        this.scenario = scenario;
        
    }

    
    public int getInput() {
        int nextScenarioIndex;
        do {
            ScenarioControl scenarioControl = new ScenarioControl();
            
            
           
           
           
            System.out.println(this.scenario.instructions+"\n"+this.scenario.option1Description+"\n"+this.scenario.option2Description);

            String cmd = this.getCommand();

            if (cmd.equals("1")){
                 nextScenarioIndex = this.scenario.option1ScenarioIndex; 
            }
            
            else {
                 nextScenarioIndex = this.scenario.option2ScenarioIndex;
            }
            
             nextScenarioIndex = scenarioControl.minigameCheck(nextScenarioIndex);
            nextScenarioIndex = scenarioControl.endgameCheck(this.scenario.currentIndex,nextScenarioIndex);
            
            
            if (nextScenarioIndex==-2 | nextScenarioIndex==-3){
                   return nextScenarioIndex;
            }
 
            //fix and implement endgame   
            
            Scenario nextScenario = Adventure.listOfScenarios[nextScenarioIndex];
            ScenarioView nextScenarioView = new ScenarioView(nextScenario);
            
            nextScenarioIndex=nextScenarioView.getInput();
            
            if (nextScenarioIndex==-2 | nextScenarioIndex==-3){
                   return nextScenarioIndex;
            }
            return nextScenarioIndex;
        } while (1==1);
        
      
      
        
    }
    
    
    
    
        protected final String getCommand() {
      
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
    private boolean validCommand(String command) {    
            if (command.equals("1")|command.equals("2")) {
                return true;
            }
        
        return false;
    }
    
}
