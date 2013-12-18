/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.views;
import byui260.adventure.interfaces.DisplayInfo;
import byui260.adventure.entities.Employee;
import byui260.adventure.interfaces.NewCalculate;
import cit260.adventure.enums.Income;
import byui260.adventure.views.NewPayView;
/**
 *
 * @author lisapage
 */
public abstract class NewBonusView extends Employee implements NewCalculate, DisplayInfo {
    
    double bonus;
    double finalPay;
    double payCheck;
    
    
   public NewBonusView(){
   
   }
  
     public double NewPayView(){
        return NewPayView.netPay;//super(PayView.netPay);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFinalPay() {
        return finalPay;
    }

    public void setFinalPay(double finalPay) {
        this.finalPay = finalPay;
    }

  

    public void setNetPay(NewPayView aPayView) {
        NewPayView.netPay = aPayView.netPay;
    }

    public double  getPayCheck() {
        return NewPayView.netPay;
    }

    public  void setPayCheck() {
        NewPayView.netPay = payCheck;
    }
    @Override
    public double calc(){
        
        finalPay = (NewPayView.netPay + bonus) * Income.TAXRATE.getRate();//how do I reference net pay? getters and setters?
        return finalPay;
    }
    @Override
    public void display(){
    
    
    }}
    
    


