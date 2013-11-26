/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.adventure.enums;

/**
 *
 * @author Motoko Kusanagi
 */
public enum EndgameTypes {

    carFreewayHospital ("the car swerves to your side, slows up beside you, and rams into you at full speed! \nyou end up in the hospital where your bass calls you and fires you."),
    carFreewayWork ("the car speeds ahead and causes a massive wreck right after your exit. good thing you're off the freeway! \n you arrive at work on time and in one piece!"),
    carAnimalHospital ("the deer was much bigger than you expected, and your car crashed into it. \nthe crash knocks you out and you awaken in the hospital where your boss calls you and fires you."),
    carAnimalWork ("the deer move on, and you continue your relaxing drive to work. you arrive on time and in one piece!"),
    walkAnimalWork ("you escape the badger"),
    walkAnimalHospital ("the badger beats you up"),
    walkHitchHikerHospital ("the hitchhiker kills you"),
    walkShopWork ("you eat, feel great, and continue to work on time"),
    youWin ("\nYOU WIN!"),
    youLose ("\nYOU LOSE!"),;
   
    
    
    
      String message;
    
    EndgameTypes(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return this.message;
    }
}
