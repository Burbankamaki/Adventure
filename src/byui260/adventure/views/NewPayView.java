/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.views;

import byui260.adventure.entities.Employee;
import byui260.adventure.interfaces.Calculate;
import cit260.adventure.enums.Income;

/**
 *
 * @author lisapage
 */
public class NewPayView extends Employee implements Calculate{
    double hrsWorked;
    double netPay;
    
    @Override
    public double calc(){
        netPay = hrsWorked * this.getPayRate() * Income.TAXRATE.getRate();
        return netPay;
    
    }

    public NewPayView(double hrsWorked, double netPay) {
    this.hrsWorked = hrsWorked;
    this.netPay = netPay;
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
}

