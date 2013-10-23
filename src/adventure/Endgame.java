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
    String walkAnimalWork = "fill";
    String walkAnimalHospital = "fill";
    String walkHitchHikerWork = "fill";
    String walkHitchHikerHospital = "fill";
    String walkHospitalHospital = "fill";
    String walkHospitalWork = "fill";
    String youWin = "\nYOU WIN!";
    String youLose = "\nYOU LOSE!";
    boolean indicator = false;
    double totalWins = 0;
    double totalLosses = 0;
    
    public Endgame()
    {
        
    }
    
    public void displayCarFreewayHospital(){
        System.out.println(carFreewayHospital);
        System.out.println(youLose);
        indicator = false;
        this.displayWinLossInfo(totalWins, totalLosses, indicator);
    }
    public void displayCarFreewayWork(){
        System.out.println(carFreewayWork);
        System.out.println(youWin);
        indicator = true;
        this.displayWinLossInfo(totalWins, totalLosses, indicator);
    }
    public void displayCarAnimalHospital(){
        System.out.println(carAnimalHospital);
        System.out.println(youLose);
        indicator = false;
        this.displayWinLossInfo(totalWins, totalLosses, indicator);
    }
    public void displayCarAnimalWork(){
        System.out.println(carAnimalWork);
        System.out.println(youWin);
        indicator = true;
        this.displayWinLossInfo(totalWins, totalLosses, indicator);
    }
    public void displayWalkAnimalWork(){
        System.out.println(walkAnimalWork);
        System.out.println(youWin);
        indicator = true;
        this.displayWinLossInfo(totalWins, totalLosses, indicator);
    }
    public void displayWalkAnimalHostial(){
        System.out.println(walkAnimalHospital);
        System.out.println(youLose);
        indicator = false;
        this.displayWinLossInfo(totalWins, totalLosses, indicator);
    }
    public void displayWalkHitchHikerWork(){
        System.out.println(walkHitchHikerWork);
        System.out.println(youWin);
        indicator = true;
        this.displayWinLossInfo(totalWins, totalLosses, indicator);
    }
    public void displayWalkHitchHikerHospital(){
        System.out.println(walkHitchHikerHospital);
        System.out.println(youLose);
        indicator = false;
        this.displayWinLossInfo(totalWins, totalLosses, indicator);
    }
    public void displayWalkHospitalWork(){
        System.out.println(walkHospitalWork);
        System.out.println(youWin);
        indicator = true;
        this.displayWinLossInfo(totalWins, totalLosses, indicator);
    }
    public void displayWalkHospitalHospital(){
        System.out.println(walkHospitalHospital);
        System.out.println(youLose);
        indicator = false;
        this.displayWinLossInfo(totalWins, totalLosses, indicator);
    }
    
    public double displayWinLossInfo(double totalWins,double totalLosses, boolean indicator){
        if (totalWins < 0){
               System.out.println("error, totalWins must be greater than or equal to zero. ");
               return -1;}
        if (totalLosses < 0){
                System.out.println("error, totalLosses must be greater than or equal to zero.");
                return -1;
        }
        if (indicator == true){
            totalWins++;
        }
        else {
            totalLosses++;
        }
        System.out.println("you have won\t"+totalWins+"\ttimes. \nyou hae lost\t"+totalLosses+"\ttimes.");
        int winPercentage = 0;
        double trueWinPercentage = winPercentage;
        trueWinPercentage = totalWins / ( totalWins + totalLosses ) * 100;
        
        System.out.println("your total win percentage is\n\t\t"+trueWinPercentage+"%! \ngood job!");
                
        return trueWinPercentage;
    }
}
