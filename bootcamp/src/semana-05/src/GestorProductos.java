package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Gestor de productos farmacéuticos.
 * Maneja medicamentos, cosméticos y suplementos usando polimorfismo.
 */
public class GestorProductos {

    private List<Producto> productos;

    public GestorProductos() {
        this.productos = new ArrayList<>();
    }

    /** Agrega un producto a la lista (polimórfico). */
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    /** Busca un producto por nombre usando equals() correctamente. */
    public Producto buscarPorNombre(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    /** Ordena los productos usando compareTo() de Producto. */
    public void ordenar() {
        Collections.sort(productos);
    }

    /** Calcula el valor total del inventario. */
    public double calcularValorTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    /** Lista los productos usando toString() polimórfico. */
    public void listarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    /** Obtiene productos por tipo usando reflexión (sin instanceof). */
    public List<Producto> filtrarPorTipo(String tipo) {
        List<Producto> filtrados = new ArrayList<>();

        for (Producto p : productos) {
            if (p.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                filtrados.add(p);
            }
        }

        return filtrados;
    }
}
