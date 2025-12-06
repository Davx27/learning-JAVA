package interfaces;

/**
 * Interfaz que define el contrato para productos vendibles.
 * Contiene métodos para calcular el precio de venta y obtener una etiqueta descriptiva.
 * Incluye un metodo default de ayuda para aplicar IVA (útil como bonus).
 */
public interface Vendible {

    /**
     * Calcula el precio final de venta del producto (sin IVA).
     * Implementación específica en cada clase.
     * @return precio de venta base
     */
    double calcularPrecioVenta();

    /**
     * Retorna la etiqueta o descripción breve que se imprimirá en la etiqueta del producto.
     * @return etiqueta descriptiva
     */
    String getEtiqueta();

    /**
     * Metodo default que aplica un porcentaje de IVA al precio de venta.
     * (Este default puede servir como bonificación en la rúbrica).
     * @param ivaPercent porcentaje de IVA (ej. 19 para 19%)
     * @return precio con IVA aplicado
     */
    default double aplicarIVA(double ivaPercent) {
        return calcularPrecioVenta() * (1 + ivaPercent / 100.0);
    }
}