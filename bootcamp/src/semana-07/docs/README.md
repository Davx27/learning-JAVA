#  Semana 07 -- Manejo de Paquetes y Excepciones

**Proyecto:** Farmacia SaludPlus\
**Estudiante:** David Alejandro Mendieta Aponte\
**Ficha:** 3228973B

------------------------------------------------------------------------

##  Estructura del Proyecto

    Proyecto-SaludPlus-Semana07/
    │
    ├── docs/
    │   ├── README.md
    │   ├── arquitectura-paquetes.md
    │   └── excepciones-personalizadas.md
    │
    └── src/
        └── com/
            └── saludplus/
                ├── modelo/
                │   └── Medicine.java
                ├── servicio/
                │   └── PharmacyService.java
                ├── excepciones/
                │   ├── InvalidMedicineException.java
                │   ├── MedicineNotFoundException.java
                │   └── StockException.java
                └── Main.java

------------------------------------------------------------------------

##  Objetivo de la Semana 07

-   Organizar un proyecto en **paquetes Java** correctamente.\
-   Crear y utilizar **excepciones personalizadas (checked)**.\
-   Manejar múltiples escenarios con **try-catch-finally**.\
-   Aplicar **throw** y **throws**.\
-   Demostrar la lógica de negocio en un `Main`.

------------------------------------------------------------------------

## Descripción del Proyecto

Este proyecto simula parte del funcionamiento básico de la farmacia
**SaludPlus**, permitiendo:

-   Registrar medicamentos.\
-   Validar datos.\
-   Vender medicamentos.\
-   Manejar errores mediante excepciones personalizadas.

------------------------------------------------------------------------

##  Paquetes creados

### `com.saludplus.modelo`

Contiene clases relacionadas con el modelo de dominio:

  -----------------------------------------------------------------------
Clase        Descripción
  ------------ ----------------------------------------------------------
`Medicine`   Representa un medicamento con id, nombre, laboratorio,
precio y stock.

  -----------------------------------------------------------------------

------------------------------------------------------------------------

### `com.saludplus.servicio`

Contiene la lógica de negocio:

Clase               Descripción
  ------------------- ------------------------------------------
`PharmacyService`   Registra, consulta y vende medicamentos.

Incluye validaciones y lanza excepciones personalizadas.

------------------------------------------------------------------------

### `com.saludplus.excepciones`

Excepciones personalizadas (todas **checked**):

  ---------------------------------------------------------------------------
Excepción                     Motivo
  ----------------------------- ---------------------------------------------
`InvalidMedicineException`    Datos inválidos al crear/agregar
medicamentos.

`MedicineNotFoundException`   No se encontró el medicamento por id.

`StockException`              No hay suficiente stock para una venta.
---------------------------------------------------------------------------

------------------------------------------------------------------------

### `com.saludplus`

Clase    Descripción
  -------- -------------------------------------
`Main`   Demuestra más de 5 casos de prueba.

------------------------------------------------------------------------

##  Casos demostrados en el Main

1.   Agregar medicamentos válidos\
2.   Venta con stock suficiente\
3.   Venta excediendo stock (**StockException**)\
4.   Venta de id inexistente (**MedicineNotFoundException**)\
5.   Intento de agregar medicamento inválido
     (**InvalidMedicineException**)\
6.  ✔️ Mostrar inventario final

Incluye uso de `try-catch-finally` en cada caso.

------------------------------------------------------------------------

## 🛠️ Cómo compilar

``` bash
javac src/com/saludplus/**/*.java
```

## ▶️ Cómo ejecutar

``` bash
java -cp src com.saludplus.Main
```
