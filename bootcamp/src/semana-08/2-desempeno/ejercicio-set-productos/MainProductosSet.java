import java.util.Set;

public class MainProductSet {
    public static void main(String[] args) {

        ProductSet setA = new ProductSet();
        ProductSet setB = new ProductSet();

        // -----------------------
        //   AGREGAR PRODUCTOS
        // -----------------------

        setA.addProduct(new Product("001", "Dolex", 8500));
        setA.addProduct(new Product("002", "Ibuprofeno", 12000));
        setA.addProduct(new Product("003", "Omeprazol", 18000));

        // Duplicado
        setA.addProduct(new Product("001", "Dolex", 8500));

        System.out.println("\n--- Set A ---");
        setA.showAll();

        // Set B
        setB.addProduct(new Product("002", "Ibuprofeno", 12000));
        setB.addProduct(new Product("004", "Vitamina C", 9000));

        System.out.println("\n--- Set B ---");
        setB.showAll();

        // -----------------------
        //  OPERACIONES DE CONJUNTOS
        // -----------------------

        System.out.println("\n--- Unión (A U B) ---");
        Set<Product> union = ProductSet.union(setA.getSet(), setB.getSet());
        union.forEach(System.out::println);

        System.out.println("\n--- Intersección (A ∩ B) ---");
        Set<Product> inter = ProductSet.intersection(setA.getSet(), setB.getSet());
        inter.forEach(System.out::println);

        System.out.println("\n--- Diferencia (A - B) ---");
        Set<Product> dif = ProductSet.difference(setA.getSet(), setB.getSet());
        dif.forEach(System.out::println);
    }
}
