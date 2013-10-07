/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

/**
 *
 * @author Burbank
 */
public class Endgame {
    
    String carFreewayHospital = "the car swerves to your side, slows up beside you, and rams into you at full speed! \nyou end up in the hospital where your bass calls you and fires you.";
    String carFreewayWork = "the car speeds ahead and causes a massive wreck right after your exit. good thing you're off the freeway! \n you arrive at work on time and in one piece!";
    String carAnimalHospital = "the deer was much bigger than you expected, and your car crashed into it. \nthe crash knocks you out and you awaken in the hospital where your boss calls you and fires you.";
    String carAnimalWork = "the deer move on, and you continue your relaxing drive to work. you arrive on time and in one piece!";
    String youWin = "\nYOU WIN!";
    String youLose = "\nYOU LOSE!";
    
    public void displayCarFreewayHospital(){
        System.out.println(carFreewayHospital);
        System.out.println(youLose);
        
    }
    public void displayCarFreewayWork(){
        System.out.println(carFreewayWork);
        System.out.println(youWin);
        
    }
    public void displayCarAnimalHospital(){
        System.out.println(carAnimalHospital);
        System.out.println(youLose);
        
    }
    public void displayCarAnimalWork(){
        System.out.println(carAnimalWork);
        System.out.println(youWin);
        
    }
}
