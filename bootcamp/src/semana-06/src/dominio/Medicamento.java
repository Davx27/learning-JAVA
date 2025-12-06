package dominio;

public class Medicamento extends ProductoFarmaceutico {

    private boolean requiereFormula;

    public Medicamento(String nombre, double precioBase, String laboratorio, boolean requiereFormula) {
        super(nombre, precioBase, laboratorio);
        this.requiereFormula = requiereFormula;
    }

    @Override
    public double calcularPrecioEspecial() {
        return precioBase * 0.12; // 12% extra por control
    }

    @Override
    public boolean requiereRefrigeracion() {
        return true;
    }

    @Override
    public double calcularPesoEnvio() {
        return 0.3;
    }

    @Override
    public String tipoTransporte() {
        return "Transporte refrigerado";
    }
}
