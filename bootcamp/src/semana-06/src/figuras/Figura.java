package figuras;

public abstract class Figura {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Métodos abstractos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    // Método concreto
    public void mostrarInfo() {
        System.out.println("Figura: " + nombre);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("---------------------------------");
    }
}
