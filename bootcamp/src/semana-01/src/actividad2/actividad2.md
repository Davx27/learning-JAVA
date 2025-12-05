## Actividad 2: Comparación de Paradigmas (Ejercicio 02)

**Instrucciones:**
- Investiga las diferencias entre programación estructurada y POO
- Escribe un ejemplo conceptual de cómo se manejaría la información de un medicamento en:
  1. **Programación estructurada** (usando variables sueltas y funciones)
  2. **Programación orientada a objetos** (usando una clase)

### Solución
Diferencias entre los paradigmas
	                    
#### Programación Estructurada
- Enfoque principal: Basado en funciones y procedimientos.
- Organización del código: Se divide en bloques o funciones.
- Manejo de datos: Los datos y las funciones están separados.
- Reutilización: Menor, requiere duplicar código.
- Mantenimiento: Más complejo en proyectos grandes.

#### Programación Orientada a Objetos

- Enfoque principal: Basado en clases y objetos.
- Organización del código: Se agrupa en clases que combinan datos y métodos.
- Manejo de datos: Los datos y los comportamientos están unidos dentro de los objetos.
- Reutilización: Alta, permite herencia, polimorfismo y composición.
- Mantenimiento: Más simple de mantener y extender.


### Ejemplo en Programación Estructurada

**Descripción:**
En este enfoque, los datos del medicamento se manejan con variables sueltas o estructuras simples.
Las operaciones se realizan mediante funciones separadas.
```java
// Definición de estructura
struct Medicamento {
    char nombre[30];
    char laboratorio[30];
    double precio;
};

// Función para mostrar información
void mostrarInformacion(struct Medicamento m) {
    printf("Nombre: %s\n", m.nombre);
    printf("Laboratorio: %s\n", m.laboratorio);
    printf("Precio: %.2f\n", m.precio);
}

int main() {
    struct Medicamento m1 = {"Dolex", "Lafrancol", 8500};
    mostrarInformacion(m1);
    return 0;
}
```

**Explicación:**
Se usa una estructura (struct) para guardar los datos del medicamento.
Las funciones (mostrarInformacion) están fuera de la estructura.
Si se quiere agregar una nueva acción, se debe crear otra función externa.

### Ejemplo en Programación Orientada a Objetos (Java)

**Descripción:**
En la POO, los datos y las funciones se agrupan dentro de una clase.
Cada medicamento se convierte en un objeto con atributos y métodos propios.
```java
public class Medicine {
    // Atributos
    String name;
    String laboratory;
    double price;

    // Constructor
    public Medicine(String name, String laboratory, double price) {
        this.name = name;
        this.laboratory = laboratory;
        this.price = price;
    }

    // Método para mostrar información
    public void showInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Laboratorio: " + laboratory);
        System.out.println("Precio: $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Medicine m1 = new Medicine("Dolex", "Lafrancol", 8500);
        m1.showInfo();
    }
}
```


**Explicación:**
Se crea una clase Medicine que agrupa los atributos y comportamientos.
Cada medicamento (objeto) puede ejecutar sus propios métodos.
Este enfoque permite extender el código fácilmente y mantenerlo organizado.
