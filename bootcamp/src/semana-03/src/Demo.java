import java.time.LocalDate;

public class DemoProducto {

    public static void main(String[] args) {

        Producto p1 = new Producto();
        p1.mostrarInfo();

        Producto p2 = new Producto("A123", "Ibuprofeno 400mg", "MK");
        p2.mostrarInfo();

        Producto p3 = new Producto(
                "B777",
                "Amoxicilina 500mg",
                "Genfar",
                9500,
                32,
                LocalDate.now().plusDays(90),
                true
        );
        p3.mostrarInfo();

        // Métodos de negocio
        p3.reducirStock(5);
        p3.aplicarDescuento(10);
        p3.mostrarInfo();

        // Validación fallida (demostración)
        try {
            new Producto("X9", "Algo", "Lab", -5000,
                    -1, LocalDate.now(), false);
        } catch (Exception e) {
            System.out.println("Error esperado: " + e.getMessage());
        }
    }
}
