public class MainSemana02 {
    public static void main(String[] args) {

        // Prueba simple del objeto Producto
        Producto p = new Producto();
        p.nombre = "Dolex";
        p.laboratorio = "Lafrancol";
        p.precio = 8500;
        p.stock = 30;
        p.fechaVencimiento = "2026-10-20";

        System.out.println("Producto de prueba:");
        System.out.println("Nombre: " + p.nombre);
        System.out.println("Laboratorio: " + p.laboratorio);
        System.out.println("Precio: " + p.precio);
    }
}
