package interfaces;

/**
 * Interfaz que define comportamiento para objetos que pueden almacenarse.
 */
public interface Almacenable {

    /**
     * Devuelve el mensaje de almacenamiento del producto.
     */
    String almacenar();

    /**
     * Indica si requiere refrigeración.
     */
    boolean requiereRefrigeracion();
}
