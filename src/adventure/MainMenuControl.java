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
    
    public void startNewGame(){
        Home home = new Home();
        home.displayHomeScene();
    }
    
    public void displayHelpMenu(){
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput();
    }
    
    public void displayWinPercentage(){
        System.out.println("not yet implemented!");
    }
        
    
}
