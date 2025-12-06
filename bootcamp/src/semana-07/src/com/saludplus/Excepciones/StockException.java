package com.saludplus.excepciones;

/**
 * Excepción que representa un error relacionado con el stock:
 * Por ejemplo, intentar vender más unidades de las disponibles.
 * Es una excepción CHECKED (extiende Exception).
 */
public class StockException extends Exception {

    public StockException(String message) {
        super(message);
    }

    public StockException(String message, Throwable cause) {
        super(message, cause);
    }
}
