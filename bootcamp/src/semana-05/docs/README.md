## Semana 05 – Polimorfismo en Empresa Farmacéutica

Este proyecto implementa polimorfismo, sobrecarga, sobrescritura, equals/hashCode, Comparable y un gestor polimórfico dentro del dominio de una empresa farmacéutica.
Incluye una superclase Producto, dos subclases (Medicamento y Cosmetico) y un GestorProductos que aplica polimorfismo real.

### Estructura del Proyecto
```
semana-05/
├── src/
│   ├── Producto.java
│   ├── Medicamento.java
│   ├── Cosmetico.java
│   ├── GestorProductos.java
│   └── Main.java
└── docs/
├── ANALISIS.md
└── README.md
```
## Ejecución

Desde la carpeta raíz:
```
javac src/*.java
java -cp src Main
```
## Clases implementadas
**Superclase Producto**

Incluye:

- 3 métodos sobrecargados (aplicarDescuento)
- equals() y hashCode()
- Comparable<Producto>
- Método polimórfico calcularPrecioFinal()
- Atributos comunes:
nombre, precio, laboratorio, stock

 **Subclase Medicamento**

Incluye:
- atributo requiereFormula
- sobrescritura de calcularPrecioFinal()
- 2 métodos sobrecargados adicionales
- implementación correcta de @Override

**Subclase Cosmetico**

Incluye:
- atributo tipoPiel
- sobrescritura de calcularPrecioFinal()
- 2 métodos sobrecargados
- implementación de equals/hashCode heredada

 **GestorProductos**

Implementa polimorfismo:
- agregar productos
- buscar productos
- ordenar lista (Comparable)
- calcular estadísticas
- mostrar productos polimórficamente

NO usa instanceof innecesario.

## Main.java

### Demuestra:

- Polimorfismo dinámico

- Overriding

- Overloading

- equals / hashCode

- compareTo

- Gestor polimórfico

### Ejemplo de salida del programa
```
Medicamento: Dolex → Precio final: 10200
Cosmético: Crema Nivea → Precio final: 15800
Lista ordenada por precio:
- Crema Nivea: 15800
- Dolex: 10200
  Productos iguales según equals(): false
```
## Documentación incluida
ANALISIS.md contiene:
- Explicación del diseño
- Justificación del polimorfismo aplicado
- Comparación antes/después de aplicar herencia
- Problemas encontrados y soluciones
- Conclusiones de la semana

## Estado

### Semana 05 completada con:

- Polimorfismo 

- Sobrecarga 

- Sobrescritura

- equals/hashCode

- Comparable

- Gestor polimórfico

- Main demostrativo 

- Documentación completa