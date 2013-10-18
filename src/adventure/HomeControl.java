/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;


/**
 *
 * @author Motoko Kusanagi
 */
public class HomeControl {
 
    public void optionOne(){
        Drive drive = new Drive();
        drive.displayStoryScene();
    }
    
    public void optionTwo(){
        Walk walk = new Walk();
        walk.displayStoryScene();
    
    }
    
    
    
}
