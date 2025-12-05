public class Contratista extends Empleado {

    // Atributos específicos
    private double tarifaSemanal;
    private int semanasContrato;

    // Constructor usando super()
    public Contratista(String nombre, String cargo, String turno, double salarioBase,
                       double tarifaSemanal, int semanasContrato) {
        super(nombre, cargo, turno, salarioBase);
        this.tarifaSemanal = tarifaSemanal;
        this.semanasContrato = semanasContrato;
    }

    // Getters y setters
    public double getTarifaSemanal() {
        return tarifaSemanal;
    }

    public void setTarifaSemanal(double tarifaSemanal) {
        this.tarifaSemanal = tarifaSemanal;
    }

    public int getSemanasContrato() {
        return semanasContrato;
    }

    public void setSemanasContrato(int semanasContrato) {
        this.semanasContrato = semanasContrato;
    }

    // Sobrescritura del cálculo de salario
    @Override
    public double calcularSalario() {
        return tarifaSemanal * semanasContrato;
    }

    // Método propio
    public void mostrarContrato() {
        System.out.println(getNombre() + " es contratista por " + semanasContrato +
                " semanas con una tarifa de $" + tarifaSemanal + " por semana.");
    }
}
