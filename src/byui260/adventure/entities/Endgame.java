/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.entities;

import java.io.Serializable;

/**
 *
 * @author Burbank
 */
public class Endgame implements Serializable {
    
    
    private static String carFreewayHospital = "the car swerves to your side, slows up beside you, and rams into you at full speed! \nyou end up in the hospital where your bass calls you and fires you.";
    private static String carFreewayWork = "the car speeds ahead and causes a massive wreck right after your exit. good thing you're off the freeway! \n you arrive at work on time and in one piece!";
    private static String carAnimalHospital = "the deer was much bigger than you expected, and your car crashed into it. \nthe crash knocks you out and you awaken in the hospital where your boss calls you and fires you.";
    private static String carAnimalWork = "the deer move on, and you continue your relaxing drive to work. you arrive on time and in one piece!";
    private static String walkAnimalWork = "you escape the badger";
    private static String walkAnimalHospital = "the badger beats you up";
    private static String walkHitchHikerHospital = "the hitchhiker kills you";
    private static String walkShopWork = "you eat, feel great, and continue to work on time";
    private static String youWin = "\nYOU WIN!";
    private static String youLose = "\nYOU LOSE!";
    
    public Endgame()
    {
                 
    }
    
            public static int endgameCheck(int index, int winLoss){
                
                
                switch(index){
                    
                    case 3: if (winLoss==-2){
                                System.out.println(carFreewayWork);
                                System.out.println(youWin);
                                return -2;
                            }
                        
                            if (winLoss==-3) {
                                System.out.println(carFreewayHospital);
                                System.out.println(youLose);
                                return -3;
                            }
                    
                        
                        
                    case 4: if (winLoss==-2){
                                System.out.println(carAnimalWork);
                                System.out.println(youWin);
                                return -2;
                            }
                        
                            if (winLoss==-3) {
                                System.out.println(carAnimalHospital);
                                System.out.println(youLose);
                                return -3;
                            }
                        
                        
                    case 5:if (winLoss==-2){
                                System.out.println(walkShopWork);
                               System.out.println(youWin);
                               return -2;
                            }
                        
                           if (winLoss==-3) {
                               System.out.println(walkHitchHikerHospital);
                               System.out.println(youLose);
                               return -3;
                            }
                        
                        
                    case 6:if (winLoss==-2){
                                System.out.println(walkAnimalWork);
                                System.out.println(youWin);
                                return -2;
                        
                            }
                        
                           if (winLoss==-3) {
                               System.out.println(walkAnimalHospital);
                               System.out.println(youLose);
                               return -3;
                            }
                        
                        
                        
                    
                   
                
                
                }
        
        return winLoss;
        }
    
 
}
