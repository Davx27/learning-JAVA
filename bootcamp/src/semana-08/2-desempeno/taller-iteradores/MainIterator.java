public class MainIterator {
    public static void main(String[] args) {

        IteratorExamples it = new IteratorExamples();

        // FOR-EACH
        System.out.println("\n=== FOR-EACH ===");
        it.showForEach();

        // FOR CLÁSICO
        System.out.println("\n=== FOR TRADICIONAL ===");
        it.showForClassic();

        // ITERATOR
        System.out.println("\n=== ITERATOR ===");
        it.showIterator();

        // ELIMINACIÓN SEGURA
        System.out.println("\n=== ELIMINAR CON ITERATOR ===");
        it.removeStartingWithC();

        // Mostrar lista después de eliminar
        System.out.println("\nLista final:");
        for (String n : it.getNames()) {
            System.out.println(n);
        }

        // COMPARACIÓN
        System.out.println("\n=== COMPARACIÓN ===");
        it.compareIteration();
    }
}
