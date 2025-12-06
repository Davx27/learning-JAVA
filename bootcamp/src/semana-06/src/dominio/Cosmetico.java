package dominio;

public class Cosmetico extends ProductoFarmaceutico {

    private String tipoPiel;

    public Cosmetico(String nombre, double precioBase, String laboratorio, String tipoPiel) {
        super(nombre, precioBase, laboratorio);
        this.tipoPiel = tipoPiel;
    }

    @Override
    public double calcularPrecioEspecial() {
        return precioBase * 0.08; // 8% por categoría premium
    }

    @Override
    public double calcularPesoEnvio() {
        return 0.15;
    }

    @Override
    public String tipoTransporte() {
        return "Transporte terrestre";
    }
}
