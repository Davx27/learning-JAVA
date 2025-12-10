#  Evidencia de Conocimiento -- Colecciones (Semana 8)

## 1. Diferencias entre Arrays y Colecciones

###  Arrays

-   Tamaño fijo desde su creación.
-   Solo permiten un tipo de dato.
-   No cuentan con métodos avanzados (no se puede agregar/eliminar
    fácilmente).
-   Menor flexibilidad.

###  Colecciones (List, Set, Map)

-   Tamaño dinámico (pueden crecer o reducirse).
-   Incluyen métodos útiles: add(), remove(), contains(), size(), etc.
-   Permiten manipulación avanzada de datos.
-   Más seguras y flexibles gracias a **Generics**.

------------------------------------------------------------------------

## 2. Interfaces principales del Java Collections Framework

###  List

-   Permite elementos duplicados.
-   Mantiene el orden de inserción.
-   Ejemplos: ArrayList, LinkedList.

###  Set

-   No permite duplicados.
-   Puede o no mantener orden.
-   Ejemplos: HashSet, TreeSet.

###  Map

-   Almacena pares clave--valor.
-   No permite claves duplicadas.
-   Ejemplos: HashMap, TreeMap.

------------------------------------------------------------------------

## 3. ¿Cuándo usar cada colección?

-   **ArrayList**: cuando necesitas una lista dinámica con acceso rápido
    por índice.
-   **LinkedList**: cuando haces muchas inserciones/eliminaciones.
-   **HashSet**: cuando necesitas eliminar duplicados rápidamente.
-   **TreeSet**: cuando necesitas orden natural.
-   **HashMap**: cuando necesitas búsqueda rápida por clave única.
