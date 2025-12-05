package src;

/**
 * Representa un medicamento dentro del sistema de gestión farmacéutica.
 * Extiende la clase Producto e incorpora atributos adicionales específicos.
 */
public class Medicamento extends Producto {

    private String formula;
    private boolean requiereReceta;

    // ---------------------- CONSTRUCTORES ----------------------

    /**
     * Constructor principal
     */
    public Medicamento(String nombre, double precio, int stock, String formula, boolean requiereReceta) {
        super(nombre, precio, stock);
        this.formula = formula;
        this.requiereReceta = requiereReceta;
    }

    /**
     * Constructor sobrecargado — sin fórmula
     */
    public Medicamento(String nombre, double precio, int stock) {
        this(nombre, precio, stock, "N/A", false);
    }

    /**
     * Constructor sobrecargado — solo nombre
     */
    public Medicamento(String nombre) {
        this(nombre, 0.0, 0, "N/A", false);
    }

    // ---------------------- GETTERS / SETTERS ----------------------

    public String getFormula() {
        return formula;
    }

    public boolean isRequiereReceta() {
        return requiereReceta;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public void setRequiereReceta(boolean requiereReceta) {
        this.requiereReceta = requiereReceta;
    }

    // ---------------------- MÉTODOS DE NEGOCIO ----------------------

    /**
     * Sobrescritura del método calcularImpuesto()
     * Medicamentos pagan solo 5% de IVA
     */
    @Override
    public double calcularImpuesto() {
        return getPrecio() * 0.05;
    }

    /**
     * Sobrescritura para la descripción
     */
    @Override
    public String descripcion() {
        return "Medicamento: " + getNombre() +
                "\n  Fórmula: " + formula +
                "\n  Requiere receta: " + (requiereReceta ? "Sí" : "No");
    }

    // ---------------------- SOBRECARGA ----------------------

    /**
     * Método sobrecargado: aplicar descuento por porcentaje
     */
    public double aplicarDescuento(double porcentaje) {
        return getPrecio() - (getPrecio() * (porcentaje / 100));
    }

    /**
     * Método sobrecargado: aplicar descuento por monto fijo
     */
    public double aplicarDescuento(int valorFijo) {
        double nuevoPrecio = getPrecio() - valorFijo;
        return (nuevoPrecio < 0) ? 0 : nuevoPrecio;
    }

    // ---------------------- EQUALS / HASHCODE ----------------------

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Medicamento)) return false;

        Medicamento other = (Medicamento) obj;
        return getNombre().equalsIgnoreCase(other.getNombre()) &&
                formula.equalsIgnoreCase(other.formula);
    }

    @Override
    public int hashCode() {
        return (getNombre() + formula).toLowerCase().hashCode();
    }

    // ---------------------- COMPARABLE ----------------------

    /**
     * Compara medicamentos por precio
     */
    @Override
    public int compareTo(Producto otro) {
        return Double.compare(this.getPrecio(), otro.getPrecio());
    }
}
