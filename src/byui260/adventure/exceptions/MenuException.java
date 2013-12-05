/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.exceptions;

/**
 *
 * @author Motoko Kusanagi
 */
public class MenuException extends Exception {
    
    
    
    
    
    public MenuException() {
    }

    public MenuException(String message) {
        super(message);
    }

    public MenuException(String message, Throwable cause) {
        super(message, cause);
    }

    public MenuException(Throwable cause) {
        super(cause);
    } 
    
}
