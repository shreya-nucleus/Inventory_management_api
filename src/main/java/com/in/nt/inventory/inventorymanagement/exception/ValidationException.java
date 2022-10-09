package com.in.nt.inventory.inventorymanagement.exception;

/**
 * @author Validation Exception class.
 *
 */
public class ValidationException extends RuntimeException {
    /**
     * @param message : return exception message.
     */
    public ValidationException(final String message) {

        super(message);
    }
}
