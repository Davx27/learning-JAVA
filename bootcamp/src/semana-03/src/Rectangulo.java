public class Rectangulo {

    private double ancho;
    private double alto;
    private String color;

    // Constructor sin parámetros
    public Rectangulo() {
        this(1.0, 1.0, "blanco"); // Uso de this()
    }

    // Constructor con algunos parámetros
    public Rectangulo(double ancho, double alto) {
        this(ancho, alto, "blanco"); // this() entre constructores
    }

    // Constructor completo
    public Rectangulo(double ancho, double alto, String color) {
        if (ancho <= 0 || alto <= 0) {
            throw new IllegalArgumentException("Las dimensiones deben ser mayores a 0.");
        }

        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException("El color no puede estar vacío.");
        }

        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Rectangulo {" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", color='" + color + '\'' +
                '}';
    }
}
