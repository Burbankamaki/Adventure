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
public class ScenarioControl extends Minigame implements Serializable {
    
    public ScenarioControl(){
                    super(ScenarioControl.scenarioMinigameAlert);
    }
    
        private static double price;
         private final static String scenarioMinigameAlert="MINIGAME TIME!!";
         
  @Override
  public void  polymorphExample(){
                    System.out.println("this is an example of polymorphism, this code can be differnet than the other examples in the other subclasses");
                    int placeholderNumber = 2+3+4/2; //different code! 
                    System.out.println(placeholderNumber);
                }
    
    public static int minigameCheck(int index){
        
        switch (index){
                
                case 1: minigameAlert(scenarioMinigameAlert);
                        
                        
                        price =GetGasPrice.getGasPrice();
                    System.out.println("you paid $"+price+" for gas and continue on your way to work.");
                    return 1;
                    
                    
                case 7:     minigameAlert(scenarioMinigameAlert);
                            GetShopHours getShopHours = new GetShopHours();
                            getShopHours.getInput();
                        BagelMenuView bagelMenuView = new BagelMenuView();
                         bagelMenuView.getInput();
                    return -2;
                        
                        
                case 8:                       
                                int fightOutcome=FightScene.badgerFightScene();
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
