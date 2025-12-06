package com.saludplus.excepciones;

/**
 * Excepción que se lanza cuando no se encuentra un medicamento por su ID.
 * Es una excepción CHECKED (extiende Exception).
 */
public class MedicineNotFoundException extends Exception {

    public MedicineNotFoundException(String message) {
        super(message);
    }

    public MedicineNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
