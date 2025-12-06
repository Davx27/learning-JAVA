#  Excepciones Personalizadas --- Semana 07

Este documento describe las excepciones personalizadas creadas para el
proyecto SaludPlus, siguiendo los criterios de la rúbrica.

------------------------------------------------------------------------

#  ¿Por qué crear excepciones personalizadas?

-   Representan errores de negocio reales.\
-   Diferencian distintas causas de fallo.\
-   Mejoran la claridad del código.\
-   Permiten manejar errores específicos en el `Main`.

------------------------------------------------------------------------

#  Excepciones creadas (todas CHECKED)
------------------------------------------------------------------------

## 1️ `InvalidMedicineException`

### Usos:

-   Cuando un medicamento tiene:
    -   nombre vacío
    -   laboratorio vacío
    -   precio ≤ 0
    -   stock negativo
    -   objeto null

### Se lanza en:

`PharmacyService.addMedicine(...)`

### Firma:

``` java
public class InvalidMedicineException extends Exception { ... }
```

------------------------------------------------------------------------

## 2️ `MedicineNotFoundException`

### Usos:

-   Cuando un medicamento **NO** se encuentra por id.

### Se lanza en:

-   `getMedicineById(id)`
-   `sellMedicine(id, quantity)`

### Firma:

``` java
public class MedicineNotFoundException extends Exception { ... }
```

------------------------------------------------------------------------
## 3️ `StockException`

### Usos:

-   Cuando se intenta vender más stock del disponible.

### Se lanza en:

-   `sellMedicine(id, quantity)`

### Firma:

``` java
public class StockException extends Exception { ... }
```

------------------------------------------------------------------------

#  Diferencias entre `throw` y `throws`

## `throw`

Lanza una excepción en un punto exacto del código.

### Ejemplo:

``` java
throw new StockException("Stock insuficiente");
```

## `throws`

Indica que el método **puede lanzar** esa excepción.

### Ejemplo:

``` java
public void sellMedicine(int id, int qty)
        throws MedicineNotFoundException, StockException
```

------------------------------------------------------------------------

#  Manejo en el Main

Cada caso utiliza:

``` java
try {
    service.sellMedicine(1, 5);
} catch (MedicineNotFoundException | StockException e) {
    System.out.println("❌ Error: " + e.getMessage());
} finally {
    System.out.println("⏹️ Finalizado");
}
```
