/**
 * Clase que representa un producto de la farmacia SaludPlus con encapsulación completa.
 *
 * @author David Mendieta
 * @version 1.0
 * @since 2025-12-03
 */
public class Producto {
    // Atributos privados
    private String nombre;
    private String laboratorio;
    private double precio;
    private int stock;
    private String categoria;

    // Constructor sin parámetros
    public Producto() {
        this("Sin nombre", "Sin laboratorio", 0.0, 0, "General");
    }

    // Constructor con algunos parámetros
    public Producto(String nombre, String laboratorio) {
        this(nombre, laboratorio, 0.0, 0, "General");
    }

    // Constructor con todos los parámetros
    public Producto(String nombre, String laboratorio, double precio, int stock, String categoria) {
        setNombre(nombre);
        setLaboratorio(laboratorio);
        setPrecio(precio);
        setStock(stock);
        setCategoria(categoria);
    }

    // Getters y Setters con validación
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        if(laboratorio == null || laboratorio.trim().isEmpty()) {
            throw new IllegalArgumentException("El laboratorio no puede estar vacío");
        }
        this.laboratorio = laboratorio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if(categoria == null || categoria.trim().isEmpty()) {
            this.categoria = "General";
        } else {
            this.categoria = categoria;
        }
    }

    // Métodos de negocio
    public void actualizarStock(int cantidad) {
        if(cantidad < 0) {
            System.out.println("No se puede disminuir stock con valor negativo");
        } else {
            this.stock += cantidad;
        }
    }

    public void aplicarDescuento(double porcentaje) {
        if(porcentaje < 0 || porcentaje > 100) {
            System.out.println("Porcentaje de descuento no válido");
        } else {
            this.precio -= this.precio * (porcentaje / 100);
        }
    }

    public void mostrarInfo() {
        System.out.println("------ Producto ------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Laboratorio: " + laboratorio);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Categoría: " + categoria);
        System.out.println("----------------------");
    }
}
