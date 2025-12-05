package src;

/**
 * Clase base abstracta para todos los productos del sistema.
 * Implementa Comparable y define métodos comunes y polimórficos.
 */
public abstract class Producto implements Comparable<Producto> {

    // ---------------------- ATRIBUTOS ----------------------
    private String nombre;
    private double precio;
    private int stock;

    // ---------------------- CONSTRUCTORES ----------------------

    /**
     * Constructor principal
     */
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Constructor sobrecargado — sin stock
     */
    public Producto(String nombre, double precio) {
        this(nombre, precio, 0);
    }

    /**
     * Constructor sobrecargado — solo nombre
     */
    public Producto(String nombre) {
        this(nombre, 0.0, 0);
    }

    // ---------------------- GETTERS / SETTERS ----------------------

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // ---------------------- MÉTODOS DE NEGOCIO ----------------------

    /**
     * Método abstracto que cada subclase debe sobrescribir.
     * Calcula el impuesto dependiendo del tipo de producto.
     */
    public abstract double calcularImpuesto();

    /**
     * Método abstracto para describir el producto
     */
    public abstract String descripcion();

    /**
     * Método final común para mostrar información completa
     */
    public final void mostrarInfo() {
        System.out.println("=== " + nombre.toUpperCase() + " ===");
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Impuesto: $" + calcularImpuesto());
        System.out.println(descripcion());
        System.out.println("--------------------------------------");
    }

    // ---------------------- SOBRECARGA ----------------------

    /**
     * Sobre carga: actualizar precio con porcentaje
     */
    public void actualizarPrecio(double porcentaje) {
        this.precio += (this.precio * (porcentaje / 100));
    }

    /**
     * Sobre carga: actualizar precio con valor fijo
     */
    public void actualizarPrecio(int aumento) {
        this.precio += aumento;
    }

    /**
     * Sobre carga: actualizar precio a un valor específico
     */
    public void actualizarPrecio(double precioNuevo, boolean reemplazar) {
        if (reemplazar) this.precio = precioNuevo;
    }

    // ---------------------- EQUALS / HASHCODE ----------------------

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Producto)) return false;

        Producto otro = (Producto) obj;
        return nombre.equalsIgnoreCase(otro.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.toLowerCase().hashCode();
    }

    // ---------------------- COMPARABLE ----------------------

    /**
     * Orden natural por nombre alfabético
     */
    @Override
    public int compareTo(Producto otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }
}
