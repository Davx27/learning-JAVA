public class EmpleadoTiempoCompleto extends Empleado {

    // Atributo específico
    private double bono;

    // Constructor usando super()
    public EmpleadoTiempoCompleto(String nombre, String cargo, String turno, double salarioBase, double bono) {
        super(nombre, cargo, turno, salarioBase);
        this.bono = bono;
    }

    // Getter y setter
    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    // Sobrescritura del cálculo de salario
    @Override
    public double calcularSalario() {
        return getSalarioBase() + bono;
    }

    // Método propio
    public void mostrarContrato() {
        System.out.println(getNombre() + " es empleado de tiempo completo y tiene un bono de $" + bono);
    }
}
