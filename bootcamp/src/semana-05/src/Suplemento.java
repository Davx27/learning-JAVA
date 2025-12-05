package src;

/**
 * Representa un suplemento alimenticio dentro del sistema.
 * Extiende Producto y agrega atributos específicos como dosis y tipo.
 */
public class Suplemento extends Producto {

    private String dosis;     // Ejemplo: "500mg", "1 cápsula"
    private String tipo;      // Ejemplo: "Proteína", "Vitaminas", "Creatina"

    // ---------------------- CONSTRUCTORES ----------------------

    /**
     * Constructor principal de Suplemento.
     */
    public Suplemento(String nombre, double precio, int stock, String dosis, String tipo) {
        super(nombre, precio, stock);
        this.dosis = dosis;
        this.tipo = tipo;
    }

    /**
     * Constructor sobrecargado — sin tipo.
     */
    public Suplemento(String nombre, double precio, int stock) {
        this(nombre, precio, stock, "N/A", "General");
    }

    /**
     * Constructor sobrecargado — solo nombre.
     */
    public Suplemento(String nombre) {
        this(nombre, 0.0, 0, "N/A", "General");
    }

    // ---------------------- GETTERS / SETTERS ----------------------

    public String getDosis() {
        return dosis;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // ---------------------- MÉTODOS DE NEGOCIO ----------------------

    /**
     * IVA para suplementos: 10%
     */
    @Override
    public double calcularImpuesto() {
        return getPrecio() * 0.10;
    }

    /**
     * Descripción extendida del suplemento.
     */
    @Override
    public String descripcion() {
        return "Suplemento: " + getNombre() +
                "\n  Tipo: " + tipo +
                "\n  Dosis: " + dosis;
    }

    // ---------------------- SOBRECARGA ----------------------

    /**
     * Aplicar descuento porcentual.
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
        if (!(obj instanceof Suplemento)) return false;

        Suplemento other = (Suplemento) obj;

        return getNombre().equalsIgnoreCase(other.getNombre()) &&
                tipo.equalsIgnoreCase(other.tipo);
    }

    @Override
    public int hashCode() {
        return (getNombre() + tipo).toLowerCase().hashCode();
    }

    // ---------------------- COMPARABLE ----------------------

    /**
     * Orden natural: por precio.
     */
    @Override
    public int compareTo(Producto otro) {
        return Double.compare(getPrecio(), otro.getPrecio());
    }
}
