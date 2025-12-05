package src;

/**
 * Representa un producto cosmético dentro del sistema.
 * Extiende Producto y agrega atributos específicos de uso y tipo de piel.
 */
public class Cosmetico extends Producto {

    private String tipoPiel;
    private boolean hipoalergenico;

    // ---------------------- CONSTRUCTORES ----------------------

    /**
     * Constructor principal de Cosmético.
     */
    public Cosmetico(String nombre, double precio, int stock, String tipoPiel, boolean hipoalergenico) {
        super(nombre, precio, stock);
        this.tipoPiel = tipoPiel;
        this.hipoalergenico = hipoalergenico;
    }

    /**
     * Constructor sobrecargado — sin tipo de piel.
     */
    public Cosmetico(String nombre, double precio, int stock) {
        this(nombre, precio, stock, "Todo tipo", false);
    }

    /**
     * Constructor sobrecargado — solo nombre.
     */
    public Cosmetico(String nombre) {
        this(nombre, 0.0, 0, "Todo tipo", false);
    }

    // ---------------------- GETTERS / SETTERS ----------------------

    public String getTipoPiel() {
        return tipoPiel;
    }

    public boolean isHipoalergenico() {
        return hipoalergenico;
    }

    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel = tipoPiel;
    }

    public void setHipoalergenico(boolean hipoalergenico) {
        this.hipoalergenico = hipoalergenico;
    }

    // ---------------------- MÉTODOS DE NEGOCIO ----------------------

    /**
     * IVA para cosméticos: 19%
     */
    @Override
    public double calcularImpuesto() {
        return getPrecio() * 0.19;
    }

    /**
     * Descripción del cosmético
     */
    @Override
    public String descripcion() {
        return "Cosmético: " + getNombre() +
                "\n  Tipo de piel: " + tipoPiel +
                "\n  Hipoalergénico: " + (hipoalergenico ? "Sí" : "No");
    }

    // ---------------------- SOBRECARGA ----------------------

    /**
     * Aplicar descuento por porcentaje.
     */
    public double aplicarDescuento(double porcentaje) {
        return getPrecio() - (getPrecio() * (porcentaje / 100));
    }

    /**
     * Aplicar descuento por monto fijo.
     */
    public double aplicarDescuento(int valorFijo) {
        double nuevo = getPrecio() - valorFijo;
        return nuevo < 0 ? 0 : nuevo;
    }

    // ---------------------- EQUALS / HASHCODE ----------------------

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cosmetico)) return false;

        Cosmetico other = (Cosmetico) obj;

        return getNombre().equalsIgnoreCase(other.getNombre()) &&
                tipoPiel.equalsIgnoreCase(other.tipoPiel);
    }

    @Override
    public int hashCode() {
        return (getNombre() + tipoPiel).toLowerCase().hashCode();
    }

    // ---------------------- COMPARABLE ----------------------

    /**
     * Ordenamiento: por precio
     */
    @Override
    public int compareTo(Producto otro) {
        return Double.compare(getPrecio(), otro.getPrecio());
    }
}
