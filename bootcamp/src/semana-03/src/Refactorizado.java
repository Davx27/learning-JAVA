public class Refactorizado {

    private String nombre;
    private int edad;
    private double salario;
    private boolean activo;

    public Refactorizado() {
        this("Sin nombre", 18, 0.0, true);
    }

    public Refactorizado(String nombre, int edad, double salario, boolean activo) {
        setNombre(nombre);
        setEdad(edad);
        setSalario(salario);
        setActivo(activo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 120) {
            throw new IllegalArgumentException("La edad debe estar entre 0 y 120.");
        }
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }
        this.salario = salario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void imprimirInfo() {
        System.out.println(nombre + " - " + edad + " años - $" + salario + " - activo: " + activo);
    }
}
