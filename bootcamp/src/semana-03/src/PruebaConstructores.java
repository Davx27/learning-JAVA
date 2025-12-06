public class PruebaConstructores {
    public static void main(String[] args) {

        System.out.println("=== PRUEBA DE CONSTRUCTORES DE RECTANGULO ===");

        // Constructor sin parámetros
        Rectangulo r1 = new Rectangulo();
        System.out.println("r1: " + r1);

        // Constructor con dos parámetros
        Rectangulo r2 = new Rectangulo(5.0, 3.2);
        System.out.println("r2: " + r2);

        // Constructor completo
        Rectangulo r3 = new Rectangulo(10.0, 4.0, "azul");
        System.out.println("r3: " + r3);

        // Validación: debe fallar
        try {
            Rectangulo r4 = new Rectangulo(-2, 5);
        } catch (Exception e) {
            System.out.println("Error creando r4: " + e.getMessage());
        }

        try {
            Rectangulo r5 = new Rectangulo(2, 3, "");
        } catch (Exception e) {
            System.out.println("Error creando r5: " + e.getMessage());
        }
    }
}
