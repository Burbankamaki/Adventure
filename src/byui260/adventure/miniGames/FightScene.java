/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.miniGames;

import java.io.Serializable;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Motoko Kusanagi
 */
public class FightScene extends Minigame implements Serializable {
    
    public FightScene(){
            super(FightScene.fightMinigameAlert);
    }
    
    private static boolean valid = false;
    private static int healthPoint;
    public final static String fightMinigameAlert="MINIGAME TIME!!  BADGER FIGHT!!";
    
    @Override
 public void polymorphExample(){
                    System.out.println("this is an example of polymorphism, this code can be differnet than the other examples in the other subclasses");
                            int example=1+1; //different code!  
                            int answer=example*3;
                            System.out.println(answer);
                    }

    
    public static int badgerFightScene(){
        minigameAlert(fightMinigameAlert);
        
        System.out.println("ok! lets fight the badger!\n first off, how many health points do you have?\n");
        
        
       while (!valid == true){ Scanner input = new Scanner(System.in);
        String healthPoints = input.next();
        String check = "[0-9]+";
       // if (!healthPoints.matches(check)){
           // System.out.println("please type only the number of your choice, nothing else. be sure it is greater than zero.");
           // continue;
           // }
         healthPoint = Integer.parseInt(healthPoints);
         if (healthPoint<=0){
            System.out.println("please type a number greater than zero. starting with zero health points would mean you are already dead");
            continue;
            }
         valid = true;
       }
        
            
        double damage = healthPoint/4;
        for (double i=healthPoint ;i>1;i=i-damage){
            System.out.println("you currently have "+i+" health points\nbut the badger has hit you for "+damage+" damage! Ouch!"+
                                "\n The badger takes a moment to contemplate his next move! Here's your chance!\nwhat will you do?"+
                                "\n1.give up your lunch! It's not worth this!"+
                                "\n2.try to run away! No way you're going hungry today."+
                                "\n3. exact your revenge and continue to fight the badger!");
            Scanner input2 = new Scanner(System.in);
            String choice = input2.next();
            
            if (choice.equals("1")){
                System.out.println("the inventory system hasn't been inplemented yet! you give your pretent lunch to the badger");
                //this line will remove lunch from inventory
                return -2;
                }
            else if (choice.equals("2")){
                Random random = new Random();
                int randomNumber = random.nextInt(3);
                if (randomNumber == 0) {
                    System.out.println("you escape! and you get to keep your lunch too!");
                    return -2;
                    }
                if (randomNumber == 1 || randomNumber== 2){
                    System.out.println("you were not able to escape! the badger takes your fumbling escape as an opportunity to attack!");
                    continue;
                    }
                }
            else if (choice.equals("3")){
                System.out.println("you take a swing at the badger.... and miss!");
                continue;
            }
            else {
                System.out.println("pleae choose either 1, 2, or 3, and type only that number");
                continue;
                }
        }
        
        
    
        return -3;
    
    
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        FightScene.valid = valid;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        FightScene.healthPoint = healthPoint;
    }
 
    
    
}
