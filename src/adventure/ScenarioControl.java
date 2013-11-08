/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

/**
 *
 * @author Motoko Kusanagi
 */
public class ScenarioControl {
    
    
    public int minigameCheck(int index){
        
        switch (index){
                
                case 1: GetGasPrice getGasPrice = new GetGasPrice();
                        double price =getGasPrice.getGasPrice();
                    System.out.println("you paid $"+price+"for gas.");
                    return 1;
                    
                    
                case 7: GetShopHours getShopHours = new GetShopHours();
                            getShopHours.showHours();
                        //create new perchase class
                        //run purchase
                    return -2;
                        
                        
                case 8: //create new weight class
                        //run find weight
                        FightScene fightScene = new FightScene();
                                int fightOutcome=fightScene.badgerFightScene();
                                return fightOutcome;
                    
                default: return index;
    
        }
      
    }
    
    
    public int endgameCheck(int index, int winLoss){
                Endgame endgame = new Endgame();
                int indicator =endgame.endgameCheck(index, winLoss);
                return winLoss;
    }
    
}
