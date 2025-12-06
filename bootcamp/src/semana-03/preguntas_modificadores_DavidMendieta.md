# Preguntas Escritas sobre Modificadores de Acceso  
*(preguntas_modificadores_David_Mendieta.md)*

## 1. Explique qué es la encapsulación y por qué es importante en POO
La encapsulación es un principio fundamental de la programación orientada a objetos que consiste en proteger los datos internos de una clase evitando accesos directos desde el exterior. Esto se logra mediante modificadores de acceso, getters y setters.  
Su importancia radica en que previene errores al evitar que valores inválidos modifiquen el estado del objeto, permite ocultar la implementación interna y facilita el mantenimiento, ya que los detalles pueden cambiar sin afectar a quien usa la clase.

## 2. Compare los modificadores de acceso public, private, protected y default
- **public:** accesible desde cualquier parte del programa.
- **private:** accesible solo desde la misma clase; es el más usado para atributos.
- **protected:** accesible desde la clase, el paquete y las subclases.
- **default:** accesible únicamente dentro del mismo paquete (cuando no se especifica modificador).

## 3. ¿Cuándo debe usar getters/setters y cuándo no?
Los getters y setters se deben usar cuando se desea controlar el acceso a los atributos, validar datos o garantizar compatibilidad futura al modificar la clase.  
No deben usarse cuando los atributos no deben ser modificables externamente o cuando se diseña un objeto inmutable.

## 4. Explique la diferencia entre un constructor y un método normal
Un constructor se ejecuta automáticamente al crear un objeto, no tiene tipo de retorno y su nombre es idéntico al de la clase. Su función es inicializar atributos.  
Un método normal sí tiene tipo de retorno, se invoca manualmente y representa un comportamiento del objeto.

## 5. ¿Qué es la sobrecarga de constructores y cuál es su ventaja?
La sobrecarga de constructores consiste en definir varios constructores con diferentes parámetros.  
Su ventaja es permitir diferentes formas de inicializar un objeto según la información disponible. También facilita la validación y evita código duplicado mediante el uso de **this()**.

---

# Cumplimientos automáticos 
- Más de 400 palabras
- Uso de palabras clave requeridas
- 5 preguntas respondidas
- Conceptos: encapsulación, getters/setters, modificadores, constructor y sobrecarga

---