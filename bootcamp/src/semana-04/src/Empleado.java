public class Empleado {

    // Atributos comunes
    private String nombre;
    private String cargo;
    private String turno;
    private double salarioBase;

    // Constructor
    public Empleado(String nombre, String cargo, String turno, double salarioBase) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.turno = turno;
        this.salarioBase = salarioBase;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método que será sobrescrito en subclases
    public double calcularSalario() {
        return salarioBase;
    }

    // Método común para todos los empleados
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Turno: " + turno);
        System.out.println("Salario Base: $" + salarioBase);
        System.out.println("-------------------------");
    }
}
