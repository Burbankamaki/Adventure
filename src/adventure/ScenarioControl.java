/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

import java.io.Serializable;

/**
 *
 * @author Motoko Kusanagi
 */
public class ScenarioControl implements Serializable {
    
    public ScenarioControl(){
    
    }
    
        private static double price;
    
    
    public static int minigameCheck(int index){
        
        switch (index){
                
                case 1: GetGasPrice getGasPrice = new GetGasPrice();
                        price =getGasPrice.getGasPrice();
                    System.out.println("you paid $"+price+" for gas and continue on your way to work.");
                    return 1;
                    
                    
                case 7: GetShopHours getShopHours = new GetShopHours();
                            getShopHours.showHours();
                        BagelMenuView bagelMenuView = new BagelMenuView();
                         bagelMenuView.getInput();
                    return -2;
                        
                        
                case 8: //create new weight class
                        //run find weight
                        FightScene fightScene = new FightScene();
                                int fightOutcome=fightScene.badgerFightScene();
                                return fightOutcome;
                    
                default: return index;
    
        }
      
    }
    
    
    public static int endgameCheck(int index, int winLoss){
                Endgame endgame = new Endgame();
                int indicator =Endgame.endgameCheck(index, winLoss);
                return winLoss;
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        ScenarioControl.price = price;
    }
    
    
    
    
}
