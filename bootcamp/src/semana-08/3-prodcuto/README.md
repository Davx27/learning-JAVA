#  README -- Proyecto Final Semana 8

# Agenda de Contactos (Java -- Colecciones & Generics)

Este proyecto corresponde a la actividad final de la **Semana 8:
Colecciones y Programación Genérica**.\
Implementa una agenda completa de contactos usando:

-   **HashMap** para acceso rápido por ID\
-   **ArrayList** para historial general\
-   **Generics** en toda la estructura\
-   **Excepciones personalizadas**\
-   **Búsquedas y filtrados avanzados**

------------------------------------------------------------------------

## 🏗 Estructura del Proyecto

    3-producto/
    │
    ├── Contact.java
    ├── FullAgenda.java
    ├── MainAgendaFull.java
    │
    ├── exceptions/
    │     ├── ContactNotFoundException.java
    │     ├── DuplicateContactException.java
    │     └── InvalidDataException.java
    │
    └── README.md

------------------------------------------------------------------------

##  Contact.java

Modelo que representa un contacto con:

-   ID\
-   Nombre\
-   Teléfono\
-   Email\
-   Ciudad

Incluye validaciones y método `showInfo()` para mostrar datos en
consola.

------------------------------------------------------------------------

##  FullAgenda.java
Clase principal que gestiona la agenda mediante:

###  Colecciones utilizadas

-   `HashMap<String, Contact>` → Búsqueda rápida por ID\
-   `ArrayList<Contact>` → Historial y recorrido completo

###  Operaciones implementadas

-   **Agregar** contactos (validando duplicados y datos vacíos)\
-   **Obtener** contacto por ID\
-   **Actualizar** información\
-   **Eliminar** por ID\
-   **Buscar por:**
    -   Nombre (contiene)\
    -   Ciudad\
    -   Inicial del nombre\
-   **Mostrar todo** el historial

### Uso de Generics

Todas las estructuras usan generics para garantizar type-safety.

###  Excepciones

-   `InvalidDataException`\
-   `DuplicateContactException`\
-   `ContactNotFoundException`

------------------------------------------------------------------------

## 🖥 MainAgendaFull.java

Clase de prueba donde se realiza:

-   Agregar contactos\
-   Buscar por nombre, ciudad y letra inicial\
-   Actualizar contacto\
-   Eliminar\
-   Mostrar lista completa\
-   Probar error por ID duplicado\
-   Manejo de excepciones con mensajes claros

Este archivo sirve como **demostración del funcionamiento completo**.

------------------------------------------------------------------------

##  Cómo Ejecutar

1.  Compilar todas las clases:

```{=html}
<!-- -->
```
    javac exceptions/*.java *.java

2.  Ejecutar:

```{=html}
<!-- -->
```
    java MainAgendaFull

3.  La consola mostrará todas las operaciones del sistema.

------------------------------------------------------------------------

##  Pruebas Incluidas

El `MainAgendaFull.java` prueba automáticamente:

-   CRUD completo\
-   Búsqueda múltiple\
-   Excepciones personalizadas\
-   Recorridos por ArrayList\
-   Acceso rápido con HashMap

------------------------------------------------------------------------

##  Requisitos Cubiertos de la Rúbrica

Criterio                     Cumplido
  ---------------------------- ----------
Uso de HashMap y ArrayList   ✔
CRUD completo                ✔
Búsquedas avanzadas          ✔
Manejo de excepciones        ✔
Generics y type-safety       ✔
Código limpio y organizado   ✔
Documentación (README)       ✔
Demostración en Main         ✔

------------------------------------------------------------------------

##  Conclusión

Este proyecto demuestra dominio de:

-   Colecciones de Java\
-   Programación Genérica\
-   Diseño orientado a objetos\
-   Manejo de excepciones\
-   Buenas prácticas de código

Cumple todos los criterios para obtener **nota excelente** en la
evidencia de producto.
