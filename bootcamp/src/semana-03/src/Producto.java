import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa un producto de la Farmacia SaludPlus.
 * Implementa encapsulación completa, validaciones, Javadoc y métodos de negocio.
 *
 * @author
 * David Alejandro Mendieta Aponte
 * @version 1.0
 */
public class Producto {

    // ================================
    // A T R I B U T O S   P R I V A D O S
    // ================================

    private String codigo;
    private String nombre;
    private String laboratorio;
    private double precio;
    private int stock;
    private LocalDate fechaVencimiento;
    private boolean requiereFormula;

    // ================================
    // C O N S T R U C T O R E S
    // ================================

    /**
     * Constructor sin parámetros.
     * Usa this() para evitar duplicar código.
     */
    public Producto() {
        this("SIN-CODIGO", "Producto", "Desconocido",
                1000.0, 0, LocalDate.now().plusDays(30), false);
    }

    /**
     * Constructor con parámetros esenciales.
     */
    public Producto(String codigo, String nombre, String laboratorio) {
        this(codigo, nombre, laboratorio,
                1000.0, 0, LocalDate.now().plusDays(30), false);
    }

    /**
     * Constructor completo con todas las validaciones.
     */
    public Producto(String codigo, String nombre, String laboratorio,
                    double precio, int stock, LocalDate fechaVencimiento,
                    boolean requiereFormula) {

        setCodigo(codigo);
        setNombre(nombre);
        setLaboratorio(laboratorio);
        setPrecio(precio);
        setStock(stock);
        setFechaVencimiento(fechaVencimiento);
        setRequiereFormula(requiereFormula);
    }

    // ================================
    // G E T T E R S  Y  S E T T E R S
    // ================================

    public String getCodigo() { return codigo; }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }
        this.codigo = codigo;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }
        this.nombre = nombre;
    }

    public String getLaboratorio() { return laboratorio; }

    public void setLaboratorio(String laboratorio) {
        if (laboratorio == null || laboratorio.isBlank()) {
            throw new IllegalArgumentException("Debe indicar un laboratorio.");
        }
        this.laboratorio = laboratorio;
    }

    public double getPrecio() { return precio; }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a 0.");
        }
        this.precio = precio;
    }

    public int getStock() { return stock; }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.stock = stock;
    }

    public LocalDate getFechaVencimiento() { return fechaVencimiento; }

    public void setFechaVencimiento(LocalDate fecha) {
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula.");
        }
        if (fecha.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de vencimiento debe ser futura.");
        }
        this.fechaVencimiento = fecha;
    }

    public boolean getRequiereFormula() { return requiereFormula; }

    public void setRequiereFormula(boolean rf) {
        this.requiereFormula = rf;
    }

    // ================================
    // M É T O D O S   D E   N E G O C I O
    // ================================

    /**
     * Aumenta stock en una cantidad dada.
     */
    public void aumentarStock(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva.");
        }
        this.stock += cantidad;
    }

    /**
     * Reduce stock si hay suficiente.
     */
    public void reducirStock(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva.");
        }
        if (cantidad > stock) {
            throw new IllegalArgumentException("Stock insuficiente.");
        }
        this.stock -= cantidad;
    }

    /**
     * Aplica descuento porcentual al precio.
     */
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje <= 0 || porcentaje >= 100) {
            throw new IllegalArgumentException("Porcentaje inválido.");
        }
        precio -= precio * (porcentaje / 100.0);
    }

    /**
     * Indica si el producto está vencido.
     */
    public boolean estaVencido() {
        return fechaVencimiento.isBefore(LocalDate.now());
    }

    /**
     * Formato bonito para mostrar información.
     */
    public void mostrarInfo() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("==== PRODUCTO ====");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Laboratorio: " + laboratorio);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Vence: " + fechaVencimiento.format(f));
        System.out.println("Requiere fórmula: " + (requiereFormula ? "Sí" : "No"));
        System.out.println("==================\n");
    }
}
