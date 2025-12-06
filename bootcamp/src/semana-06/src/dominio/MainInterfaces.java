package dominio;

import interfaces.Almacenable;
import interfaces.Transportable;
import interfaces.Vendible;

public class MainInterfaces {

    public static void main(String[] args) {

        // Creamos objetos de cada tipo
        ProductoFarmaceutico p1 = new Medicamento("Dolex", 8500, "Genfar", true);
        ProductoFarmaceutico p2 = new Cosmetico("Crema Nivea", 12000, "Nivea", "Piel Seca");
        ProductoFarmaceutico p3 = new InsumoMedico("Guantes de látex", 5000, "MediPlus", "Caja");

        // Mostramos información general
        System.out.println("=== DEMOSTRACIÓN DE INTERFACES Y ABSTRACCIÓN ===\n");

        mostrarInfoProducto(p1);
        mostrarInfoProducto(p2);
        mostrarInfoProducto(p3);
    }

    /**
     * Método polimórfico que recibe cualquier tipo de producto
     * y también verifica qué interfaces implementa.
     */
    public static void mostrarInfoProducto(ProductoFarmaceutico producto) {
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Laboratorio: " + producto.getLaboratorio());
        System.out.println("Precio base: " + producto.getPrecioBase());

        // Si implementa Vendible
        if (producto instanceof Vendible vendible) {
            System.out.println("→ Precio de venta: " + vendible.calcularPrecioVenta());
        }

        // Si implementa Almacenable
        if (producto instanceof Almacenable almacenable) {
            System.out.println("→ Almacenamiento: " + almacenable.almacenar());
        }

        // Si implementa Transportable
        if (producto instanceof Transportable transportable) {
            System.out.println("→ Transporte: " + transportable.transportar());
        }

        System.out.println("-----------------------------------------\n");
    }
}
