/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

/**
 *
 * @author Motoko Kusanagi
 */
public class DriveControl {
    
    
        public void optionOne(){
        Freeway freeway = new Freeway();
        freeway.displayStoryScene();
    }
    
    public void optionTwo(){
        BackRoad backRoad = new BackRoad();
        backRoad.displayStoryScene();
    
    }
    
}
