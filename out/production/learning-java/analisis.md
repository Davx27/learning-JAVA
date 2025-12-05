# Análisis del dominio – Semana 02
## Farmacia SaludPlus

### Objetos del dominio
1. Producto
2. Cliente
3. Empleado
4. Venta
5. Inventario

---

## Atributos y métodos

### Producto
- Atributos: nombre, laboratorio, precio, stock, fechaVencimiento
- Métodos: verificarVencimiento(), actualizarStock(), aplicarDescuento()

### Cliente
- Atributos: nombre, cedula, telefono, historialCompras
- Métodos: agregarCompra(), mostrarHistorial()

### Empleado
- Atributos: nombre, cargo, salario, turno
- Métodos: registrarVenta(), atenderCliente()

### Venta
- Atributos: fecha, cliente, listaProductos, total
- Métodos: calcularTotal(), agregarProducto(), mostrarDetalle()

### Inventario
- Atributos: listaProductos, cantidadTotal
- Métodos: agregarProducto(), buscarProducto(), actualizarStock(), mostrarInventario()

---

## Relaciones del sistema

- Cliente – Venta: un cliente realiza muchas ventas (1 a muchos)
- Venta – Producto: una venta puede contener múltiples productos (muchos a muchos)
- Inventario – Producto: inventario contiene a los productos (composición)
- Empleado – Venta: un empleado registra varias ventas (1 a muchos)
