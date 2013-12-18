/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.views;

import byui260.adventure.entities.Employee;
import byui260.adventure.interfaces.DisplayInfo;
import byui260.adventure.interfaces.NewCalculate;
import cit260.adventure.enums.Income;

/**
 *
 * @author lisapage
 */
public abstract class NewPayView extends Employee implements NewCalculate, DisplayInfo{
    double hrsWorked;
    public static double netPay;
    
    @Override
    public double calc(){
        netPay = hrsWorked * this.getPayRate() * Income.TAXRATE.getRate();
        return netPay;
    
    }

    public NewPayView() {
   
    }
   public double getHrsWorked() {
        return hrsWorked;
    }

    public void setHrsWorked(double hrsWorked) {
        this.hrsWorked = hrsWorked;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }
    
    public String displayText(){
        String welcomeText =  "Let's find out how much money you have.\n"
                + "Enter how many hours you worked last week.";
        
        return welcomeText;
     }
}

