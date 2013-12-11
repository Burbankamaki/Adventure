/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.adventure.enums;

/**
 *
 * @author lisapage
 */
public enum Income {
   TAXRATE (.15);
   
    Double trate;
    
    Income(Double trate) {
        this.trate = trate;
    }
    
    public Double getRate() {
        return this.trate;
    }
   
   
   
   
   
   
}
