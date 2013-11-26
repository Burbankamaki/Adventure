/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.entities;

import java.io.Serializable;

/**
 *
 * @author Motoko Kusanagi
 */
public class Scenario implements Serializable {
    
    public Scenario(){
    }
    
    
    
    private String instructions;
    private String option1Description;
    private String option2Description;
    private int option1ScenarioIndex;
    private int option2ScenarioIndex;
    private int currentIndex;

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getOption1Description() {
        return option1Description;
    }

    public void setOption1Description(String option1Description) {
        this.option1Description = option1Description;
    }

    public String getOption2Description() {
        return option2Description;
    }

    public void setOption2Description(String option2Description) {
        this.option2Description = option2Description;
    }

    public int getOption1ScenarioIndex() {
        return option1ScenarioIndex;
    }

    public void setOption1ScenarioIndex(int option1ScenarioIndex) {
        this.option1ScenarioIndex = option1ScenarioIndex;
    }

    public int getOption2ScenarioIndex() {
        return option2ScenarioIndex;
    }

    public void setOption2ScenarioIndex(int option2ScenarioIndex) {
        this.option2ScenarioIndex = option2ScenarioIndex;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }
    
    
    
    
    
    
    
}
