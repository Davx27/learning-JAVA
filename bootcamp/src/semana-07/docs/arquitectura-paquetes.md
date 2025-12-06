#  Arquitectura de Paquetes --- Semana 07

Este documento describe la organización del proyecto utilizando
**paquetes Java**, siguiendo las convenciones profesionales y la rúbrica
del Bootcamp POO.

------------------------------------------------------------------------

##  ¿Por qué usar paquetes?

-   Organizan el código.
-   Evitan conflictos de nombres.
-   Clarifican responsabilidades.
-   Facilitan escalabilidad y mantenimiento.

------------------------------------------------------------------------

#  Estructura General

    com.saludplus
    ├── modelo
    ├── servicio
    ├── excepciones
    └── Main.java

------------------------------------------------------------------------

##  1. `com.saludplus.modelo`

Contiene las **clases del dominio**, es decir, los elementos reales del
negocio.

### Clase incluida:

-   `Medicine.java`

### Responsabilidades:

-   Representar datos del mundo real.
-   Definir atributos.
-   Contener comportamiento mínimo del modelo.

------------------------------------------------------------------------

## 2. `com.saludplus.servicio`

Contiene la **lógica de negocio** de la farmacia.

### Clase incluida:

-   `PharmacyService.java`

### Responsabilidades:

-   Validar datos.
-   Buscar medicamentos.
-   Vender medicamentos.
-   Lanzar excepciones personalizadas.

Este paquete separa la lógica del modelo, manteniendo el código limpio y
escalable.

------------------------------------------------------------------------

##  3. `com.saludplus.excepciones`

Contiene todas las **excepciones personalizadas**, siguiendo la
convención:

-   Deben terminar en `Exception`.
-   Deben extender `Exception` (para ser checked).
-   Deben tener constructor con mensaje y mensaje+causa.

### Excepciones incluidas:

-   `InvalidMedicineException`
-   `MedicineNotFoundException`
-   `StockException`

------------------------------------------------------------------------

##  4. `com.saludplus`

Contiene la clase principal:

-   `Main.java`

Responsabilidad: - Demostrar el funcionamiento. - Probar casos exitosos
y fallidos. - Manejar try-catch-finally.

------------------------------------------------------------------------

## Convenciones aplicadas

###  Nombres de paquetes

-   Minúsculas.
-   Basado en dominio del estudiante.
-   `com.saludplus` cumple convención estándar.

###  Imports

-   Específicos, no comodines.

###  Separación coherente

-   Dominio → modelo\
-   Lógica → servicio\
-   Errores → excepciones\
-   Ejecución → Main

------------------------------------------------------------------------

##  Beneficios para futuras semanas

-   Permite migrar a un proyecto más complejo.
-   Facilita la futura implementación de:
    -   Base de datos
    -   Controladores
    -   Tests unitarios
    -   Servicios adicionales

------------------------------------------------------------------------

##  Conclusión

La arquitectura cumple y supera los criterios de la rúbrica para la
Semana 07, manteniendo un diseño profesional, modular y fácil de
extender.
