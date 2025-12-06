public class PruebaProducto {
    public static void main(String[] args) {

        System.out.println("=== PRUEBA DE PRODUCTO ===");

        Producto p1 = new Producto("A01", "Vitaminas", 12000, 10);
        System.out.println(p1);

        // Prueba de validaciones
        try {
            Producto p2 = new Producto("B02", "Jarabe", -5000, 5);
        } catch (Exception e) {
            System.out.println("Error al crear p2: " + e.getMessage());
        }

        try {
            Producto p3 = new Producto();
            p3.setNombre("");
        } catch (Exception e) {
            System.out.println("Error al modificar p3: " + e.getMessage());
        }

        // Validación correcta
        Producto p4 = new Producto();
        p4.setCodigo("Z99");
        p4.setNombre("Antigripal");
        p4.setPrecio(8900);
        p4.setStock(20);

        System.out.println(p4);
    }
}
