/**
 * 
 */
package com.antwebapp.cmapp.exception;

/**
 * @author Lawanu Borthakur
 *
 */
public class UserBlockedException extends Exception {
	
	/**
     * Creates User object without error description.
     */
    public UserBlockedException() {
    }
    /**
     * Creates User object with error description.
     */
    public UserBlockedException(String errDesc) {
        super(errDesc);
    }    
}
