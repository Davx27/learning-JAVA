#  ANÁLISIS – Semana 05
## Polimorfismo en Empresa Farmacéutica

Este documento describe el análisis, decisiones de diseño, aplicación de polimorfismo y conclusiones del desarrollo de la semana 05.

---

#  1. Objetivo del Sistema

Implementar un sistema orientado a objetos para una empresa farmacéutica, aplicando herencia, polimorfismo (overriding y overloading), equals/hashCode, Comparable, binding dinámico y un gestor polimórfico.

---

#  2. Diseño de la Solución

## 2.1. Superclase `Producto`
Representa un producto genérico con:
- `nombre`, `precio`, `laboratorio`, `stock`
- método polimórfico `calcularPrecioFinal()`
- 3 sobrecargas de `aplicarDescuento()`
- equals(), hashCode(), compareTo()

## 2.2. Subclase `Medicamento`
- Atributo `requiereFormula`
- Sobrescritura de `calcularPrecioFinal()`
- 2 métodos sobrecargados propios

## 2.3. Subclase `Cosmetico`
- Atributo `tipoPiel`
- Sobrescritura de `calcularPrecioFinal()`
- 2 métodos sobrecargados propios

## 2.4. GestorProductos
Maneja:
- agregar productos
- mostrar polimórficamente
- buscar
- ordenar por precio
- estadísticas

---

#  3. Aplicación del Polimorfismo

## 3.1. Overriding
`calcularPrecioFinal()` redefinido en cada subclase.

## 3.2. Overloading
Variantes de `aplicarDescuento()` con diferentes parámetros.

## 3.3. Referencias Polimórficas
Uso de:
```java
Producto p = new Medicamento(...);
```

## 3.4. Comparable
Permite ordenar productos por precio.

## 3.5. equals()/hashCode()
Comparación segura basada en nombre + laboratorio.

---

# ⚖ 4. Comparación Antes / Después

| Antes | Después |
|-------|---------|
| Código repetido | Lógica centralizada |
| Muchos if/instanceof | Casi ninguno |
| Difícil extender | Cada nueva subclase encaja perfecto |
| Sin ordenamiento | Comparable lo resuelve |

---

#  5. Pruebas

Probado con:
- Medicamentos con/sin fórmula
- Cosméticos de varios tipos
- equals/hashCode
- Ordenamiento
- Sobrecargas
- Gestor polimórfico

---

#  6. Problemas y Soluciones

1. Comparación incorrecta → se implementó equals/hashCode
2. Código duplicado en descuentos → se creó sobrecarga
3. Ordenamiento fallaba → se implementó Comparable
4. Main simple → se amplió para mostrar polimorfismo

---

#  7. Conclusiones

- Polimorfismo simplifica el manejo de múltiples tipos.
- Herencia reduce duplicación.
- equals/hashCode son esenciales.
- Sobre carga + sobreescritura = flexibilidad y especialización.
- Proyecto cumple todos los criterios.  
