package com.saludplus.excepciones;

/**
 * Excepción que representa datos inválidos para un medicamento.
 * Es una excepción CHECKED (extiende Exception).
 */
public class InvalidMedicineException extends Exception {

    public InvalidMedicineException(String message) {
        super(message);
    }

    public InvalidMedicineException(String message, Throwable cause) {
        super(message, cause);
    }
}
