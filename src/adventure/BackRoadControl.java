/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

/**
 *
 * @author Burbank
 */
public class BackRoadControl {
    
    
     
    public void optionOne(){
            Endgame lose = new Endgame();
            lose.displayCarAnimalHospital();
    }
    
    public void optionTwo(){
        Endgame win = new Endgame();
        win.displayCarAnimalWork();
    
    }
    
    
    
}
