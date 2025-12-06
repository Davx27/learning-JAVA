package dominio;

public class InsumoMedico extends ProductoFarmaceutico {

    private boolean esteril;

    public InsumoMedico(String nombre, double precioBase, String laboratorio, boolean esteril) {
        super(nombre, precioBase, laboratorio);
        this.esteril = esteril;
    }

    @Override
    public double calcularPrecioEspecial() {
        return esteril ? 2000 : 500;
    }

    @Override
    public double calcularPesoEnvio() {
        return 1.0; // cajas pesadas
    }

    @Override
    public String tipoTransporte() {
        return "Transporte especializado";
    }
}
