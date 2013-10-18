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
        DriveView driveView = new DriveView();
        driveView.getInput();
    }
    
    public void optionTwo(){
        Walk walk = new Walk();
        walk.displayStoryScene();
    
    }
    
    
    
}
