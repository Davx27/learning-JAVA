package dominio;

import interfaces.Vendible;
import interfaces.Almacenable;
import interfaces.Transportable;

/**
 * Clase abstracta base para cualquier producto dentro de la empresa farmacéutica.
 * Implementa 3 interfaces: Vendible, Almacenable y Transportable.
 */
public abstract class ProductoFarmaceutico implements Vendible, Almacenable, Transportable {

    protected String nombre;
    protected double precioBase;
    protected String laboratorio;

    public ProductoFarmaceutico(String nombre, double precioBase, String laboratorio) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.laboratorio = laboratorio;
    }

    /**
     * Método abstracto que define un cálculo especial según el tipo de producto.
     * Cada subclase lo implementa a su manera.
     */
    public abstract double calcularPrecioEspecial();

    @Override
    public double calcularPrecioVenta() {
        return precioBase + calcularPrecioEspecial();
    }

    @Override
    public String getEtiqueta() {
        return nombre + " - " + laboratorio;
    }

    @Override
    public void almacenar() {
        System.out.println("Almacenando producto: " + nombre);
    }

    @Override
    public boolean requiereRefrigeracion() {
        return false; // por defecto no, subclases pueden sobrescribir
    }

    @Override
    public double calcularPesoEnvio() {
        return 0.2; // peso por defecto, subclases cambian si quieren
    }

    @Override
    public String tipoTransporte() {
        return "Transporte estándar";
    }

    @Override
    public String toString() {
        return nombre + " (" + laboratorio + ") - Precio base: " + precioBase;
    }
}
