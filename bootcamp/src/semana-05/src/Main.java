package src;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        System.out.println("========= SEMANA 05 — POLIMORFISMO =========\n");

        // -------------------------------------------------------------
        // 1. CREAR PRODUCTOS DE DIFERENTES TIPOS (POLIMORFISMO)
        // -------------------------------------------------------------
        Producto p1 = new Medicamento("Ibuprofeno", 8500, 20, "Ibuprofeno 400mg", false);
        Producto p2 = new Cosmetico("Crema Hidratante", 25000, 10, "Seca", true);
        Producto p3 = new Suplemento("Proteína Whey", 120000, 5, "30g", "Proteína");
        Producto p4 = new Medicamento("Ibuprofeno", 8500, 20, "Ibuprofeno 400mg", false);

        // Arreglo polimórfico
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);

        // -------------------------------------------------------------
        // 2. MOSTRAR INFORMACIÓN — OVERRIDING
        // -------------------------------------------------------------
        System.out.println("----- INFO DE CADA PRODUCTO (OVERRIDING) -----");
        for (Producto p : productos) {
            p.mostrarInfo();  // Polimorfismo + métodos sobrescritos
        }

        // -------------------------------------------------------------
        // 3. SOBRECARGA — overloaded methods
        // -------------------------------------------------------------
        System.out.println("\n----- SOBRECARGA DE MÉTODOS -----");
        System.out.println("Precio original Proteína: " + p3.getPrecio());
        Suplemento sup = (Suplemento) p3;

        System.out.println("Descuento 10%: " + sup.aplicarDescuento(10.0));
        System.out.println("Descuento $5.000: " + sup.aplicarDescuento(5000));

        // -------------------------------------------------------------
        // 4. EQUALS y HASHCODE
        // -------------------------------------------------------------
        System.out.println("\n----- EQUALS y HASHCODE -----");
        System.out.println("p1.equals(p4): " + p1.equals(p4));
        System.out.println("hashCode p1: " + p1.hashCode());
        System.out.println("hashCode p4: " + p4.hashCode());

        // -------------------------------------------------------------
        // 5. COMPARABLE — compareTo()
        // -------------------------------------------------------------
        System.out.println("\n----- ORDENAR PRODUCTOS POR PRECIO -----");
        Collections.sort(productos, (a, b) -> Double.compare(a.getPrecio(), b.getPrecio()));

        for (Producto p : productos) {
            System.out.println(p.getNombre() + " — $" + p.getPrecio());
        }

        // -------------------------------------------------------------
        // 6. USO DEL GESTOR POLIMÓRFICO
        // -------------------------------------------------------------
        System.out.println("\n----- GESTOR DE PRODUCTOS (POLIMÓRFICO) -----");
        GestorProductos gestor = new GestorProductos();

        gestor.agregarProducto(p1);
        gestor.agregarProducto(p2);
        gestor.agregarProducto(p3);

        gestor.listarProductos();

        System.out.println("\nBuscar 'Proteína Whey':");
        Producto encontrado = gestor.buscarPorNombre("Proteína Whey");

        if (encontrado != null) {
            encontrado.mostrarInfo();
        }

        System.out.println("----- FIN DE EJECUCIÓN -----");
    }
}
