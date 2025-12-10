import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExamples {

    private List<String> names;

    public IteratorExamples() {
        names = new ArrayList<>();
        names.add("David");
        names.add("Alejandra");
        names.add("Carlos");
        names.add("Maria");
        names.add("Juan");
    }

    // ------------------------------
    //    FOR-EACH LOOP
    // ------------------------------

    public void showForEach() {
        System.out.println("▶ Recorriendo con for-each:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    // ------------------------------
    //      FOR TRADICIONAL
    // ------------------------------

    public void showForClassic() {
        System.out.println("▶ Recorriendo con for tradicional:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }

    // ------------------------------
    //     ITERATOR EXPLÍCITO
    // ------------------------------

    public void showIterator() {
        System.out.println("▶ Recorriendo con Iterator:");
        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
    }

    // ------------------------------
    //   ELIMINAR CON ITERATOR
    // ------------------------------

    public void removeStartingWithC() {
        System.out.println("▶ Eliminando nombres que comienzan con 'C':");

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String name = it.next();
            if (name.startsWith("C")) {
                it.remove();  // eliminación segura
                System.out.println("    - Eliminado: " + name);
            }
        }
    }

    // ------------------------------
    //     COMPARACIÓN GENERAL
    // ------------------------------

    public void compareIteration() {
        System.out.println("\n📌 Comparación de métodos:");

        System.out.println("- For-each: más limpio, ideal cuando NO eliminas elementos.");
        System.out.println("- For clásico: permite índices, útil para listas grandes.");
        System.out.println("- Iterator: único método SEGURO para eliminar mientras recorres.");
    }

    public List<String> getNames() {
        return names;
    }
}
