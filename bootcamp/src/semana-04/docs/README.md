# Semana 04 – Sistema de Gestión de Empleados (Herencia)

Este proyecto implementa un sistema de gestión de empleados utilizando herencia, encapsulación, constructores con `super()` y polimorfismo.

---

## Estructura del Proyecto

```
src/
├── Empleado.java
├── EmpleadoTiempoCompleto.java
├── EmpleadoTiempoParcial.java
├── Contratista.java
└── Main.java

docs/
├── diagrama-uml.png
└── README.md
```

---

## Cómo compilar y ejecutar

**Desde la carpeta raíz del proyecto:**

```bash
javac src/*.java
java -cp src Main
```

**O ejecutando directamente dentro de `src/`:**

```bash
cd src
javac *.java
java Main
```

---

## Diagrama UML

El diagrama UML se encuentra en:

```
docs/diagrama-uml.png
```

---

## Descripción breve de `Main.java`

El archivo `Main.java` demuestra:

- Creación de objetos de cada subclase (`EmpleadoTiempoCompleto`, `EmpleadoTiempoParcial`, `Contratista`)
- Uso de métodos comunes heredados
- Métodos específicos de cada tipo de empleado
- Polimorfismo mediante un arreglo de tipo `Empleado`
- Cálculo de salarios sobrescrito según cada modalidad

---

## Estado

Semana 04 completada.
