public class EmpleadoTiempoParcial extends Empleado {

    // Atributos específicos
    private int horasTrabajadas;
    private double valorHora;

    // Constructor usando super()
    public EmpleadoTiempoParcial(String nombre, String cargo, String turno, double salarioBase,
                                 int horasTrabajadas, double valorHora) {
        super(nombre, cargo, turno, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    // Getters y setters
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    // Sobrescritura del cálculo de salario
    @Override
    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }

    // Método propio
    public void mostrarHoras() {
        System.out.println(getNombre() + " ha trabajado " + horasTrabajadas + " horas a $" + valorHora + " por hora.");
    }
}
