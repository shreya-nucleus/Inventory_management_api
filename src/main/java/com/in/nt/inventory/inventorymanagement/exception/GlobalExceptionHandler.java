package com.in.nt.inventory.inventorymanagement.exception;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Exception handler class.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * error code.
     */
    @ExceptionHandler(value = ValidationException.class)
    protected final ResponseEntity<Map<String, String>> handleConflict(final ValidationException exception) {
        Map<String, String> response = new HashMap<>();
        response.put("message", exception.getMessage());
        return ResponseEntity.status(400).body(response);
    }
}