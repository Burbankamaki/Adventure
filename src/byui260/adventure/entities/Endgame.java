/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.entities;

import cit260.adventure.enums.EndgameTypes;
import java.io.Serializable;

/**
 *
 * @author Burbank
 */
public class Endgame implements Serializable {
    

    public Endgame()
    {
                 
    }
   
            public static int endgameCheck(int index, int winLoss){
                
                
                switch(index){
                    
                    case 3: if (winLoss==-2){
                                System.out.println(EndgameTypes.carFreewayWork.getMessage());
                                System.out.println(EndgameTypes.youWin);
                                return -2;
                            }
                        
                            if (winLoss==-3) {
                                System.out.println(EndgameTypes.carFreewayHospital.getMessage());
                                System.out.println(EndgameTypes.youLose.getMessage());
                                return -3;
                            }
                    
                        
                        
                    case 4: if (winLoss==-2){
                                System.out.println(EndgameTypes.carAnimalWork.getMessage());
                                System.out.println(EndgameTypes.youWin.getMessage());
                                return -2;
                            }
                        
                            if (winLoss==-3) {
                                System.out.println(EndgameTypes.carAnimalHospital.getMessage());
                                System.out.println(EndgameTypes.youLose.getMessage());
                                return -3;
                            }
                        
                        
                    case 5:if (winLoss==-2){
                                System.out.println(EndgameTypes.walkShopWork.getMessage());
                               System.out.println(EndgameTypes.youWin.getMessage());
                               return -2;
                            }
                        
                           if (winLoss==-3) {
                               System.out.println(EndgameTypes.walkHitchHikerHospital.getMessage());
                               System.out.println(EndgameTypes.youLose.getMessage());
                               return -3;
                            }
                        
                        
                    case 6:if (winLoss==-2){
                                System.out.println(EndgameTypes.walkAnimalWork.getMessage());
                                System.out.println(EndgameTypes.youWin.getMessage());
                                return -2;
                        
                            }
                        
                           if (winLoss==-3) {
                               System.out.println(EndgameTypes.walkAnimalHospital.getMessage());
                               System.out.println(EndgameTypes.youLose.getMessage());
                               return -3;
                            }
                        
                        
                        
                    
                   
                
                
                }
        
        return winLoss;
        }
    
 
}
