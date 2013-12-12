/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.views;
import byui260.adventure.interfaces.DisplayInfo;
import byui260.adventure.entities.Employee;
import byui260.adventure.interfaces.Calculate;
import cit260.adventure.enums.Income;
import byui260.adventure.views.PayView;
/**
 *
 * @author lisapage
 */
public abstract class BonusView extends Employee implements Calculate {
    
    double bonus;
    double finalPay;
    //PayView netPay;
    PayView payCheck = new PayView();
    
   
  
     public double PayView(){
        return payCheck.netPay;//super(PayView.netPay);
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

    public PayView getNetPay() {
        return payCheck.netPay;
    }

    public void setNetPay(PayView aPayView) {
        this.payCheck.netPay = aPayView.netPay;
    }

    public PayView getPayCheck() {
        return payCheck;
    }

    public void setPayCheck(PayView payCheck) {
        this.payCheck = payCheck;
    }
    @Override
    public double calc(PayView netPay){
        
        finalPay = (netPay.getNetPay() + bonus) * Income.TAXRATE.getRate();//how do I reference net pay? getters and setters?
        return finalPay;
    }
    @Override
    public void display(){
    
    
    }
    
    
}
//netPay = hrsWorked * this.getPayRate() * Income.TAXRATE.getRate(); for an example from payView 

/*  Double trate;
    
    Income(Double trate) {
        this.trate = trate;
    }
    
    public Double getRate() {
        return this.trate;
    }*/