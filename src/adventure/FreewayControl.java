/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

/**
 *
 * @author Burbank
 */
public class FreewayControl {
    
     
    public void optionOne(){
        Endgame lose = new Endgame();
        lose.displayCarFreewayHospital();
    }
    
    public void optionTwo(){
        Endgame win = new Endgame();
        win.displayCarFreewayWork();
    
    }
    
    
    
}
