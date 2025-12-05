# Diagrama UML – Farmacia SaludPlus

A continuación se presenta el diagrama de clases UML basado en el dominio de la farmacia SaludPlus.
Incluye clases, atributos, métodos y relaciones principales del sistema.

---

## Diagrama de Clases (ASCII)

                    +----------------+
                    |    Cliente     |
                    +----------------+
                    | - nombre       |
                    | - cedula       |
                    | - telefono     |
                    | - historialC.  |
                    +----------------+
                    | + agregarCompra() 
                    | + mostrarHistorial()
                    +----------------+
                           |
                           | 1
                           |
                           | *
                    +----------------+
                    |     Venta      |
                    +----------------+
                    | - fecha        |
                    | - total        |
                    | - cliente      |
                    | - listaProd.   |
                    +----------------+
                    | + calcularTotal()
                    | + agregarProducto()
                    | + mostrarDetalle()
                    +----------------+
                       /         \
                      /           \
                     *             *
                    /               \
        +----------------+     +----------------+
        |   Producto     |     |   Empleado     |
        +----------------+     +----------------+
        | - nombre       |     | - nombre       |
        | - laboratorio  |     | - cargo        |
        | - precio       |     | - salario      |
        | - stock        |     | - turno        |
        +----------------+     +----------------+
        | + actualizarStock()  | + registrarVenta()
        | + verificarVto()     | + atenderCliente()
        +----------------+     +----------------+

                    +-----------------------+
                    |      Inventario       |
                    +-----------------------+
                    | - listaProductos      |
                    | - cantidadTotal       |
                    +-----------------------+
                    | + agregarProducto()   |
                    | + buscarProducto()    |
                    | + mostrarInventario() |
                    +-----------------------+
                           |
                         1 |---◼ (composición)
                           |
                           *  
                     +-----------+
                     | Producto  |
                     +-----------+

---

## Relaciones principales

- **Cliente 1 → * Venta**
- **Venta * ↔ * Producto**
- **Empleado 1 → * Venta**
- **Inventario 1 → * Producto** (composición)
