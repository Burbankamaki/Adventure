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
        FreewayView freewayView = new FreewayView();
        freewayView.getInput();
    }
    
    public void optionTwo(){
        BackRoadView backRoadView = new BackRoadView();
        backRoadView.getInput();
    
    }
    
}
