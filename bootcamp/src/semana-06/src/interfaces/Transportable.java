// src/interfaces/Transportable.java
package interfaces;

/**
 * Interfaz para objetos que pueden ser transportados.
 * Define métodos para calcular peso/volumen de envío y tipo de transporte recomendado.
 */
public interface Transportable {

    /**
     * Calcula el peso estimado (o coste asociado) para el envío del ítem.
     * @return peso estimado en kilogramos (o unidad acordada)
     */
    double calcularPesoEnvio();

    /**
     * Devuelve una cadena con el tipo de transporte recomendado
     * (por ejemplo: "Terrestre", "Aéreo", "Refrigerado", etc).
     * @return tipo de transporte recomendado
     */
    String tipoTransporte();
}
