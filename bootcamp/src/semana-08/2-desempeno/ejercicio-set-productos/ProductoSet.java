import java.util.HashSet;
import java.util.Set;

public class ProductSet {

    private Set<Product> products;

    public ProductSet() {
        this.products = new HashSet<>();
    }

    public void addProduct(Product p) {
        if (products.add(p)) {
            System.out.println("✔️ Producto agregado.");
        } else {
            System.out.println("❌ Producto duplicado (no agregado).");
        }
    }

    public void removeProduct(String code) {
        Product toRemove = null;

        for (Product p : products) {
            if (p.getCode().equalsIgnoreCase(code)) {
                toRemove = p;
                break;
            }
        }

        if (toRemove != null) {
            products.remove(toRemove);
            System.out.println("✔️ Producto eliminado.");
        } else {
            System.out.println("❌ Producto no encontrado.");
        }
    }

    public boolean containsProduct(String code) {
        for (Product p : products) {
            if (p.getCode().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

    public void showAll() {
        System.out.println("📦 Productos en el Set:");
        for (Product p : products) {
            p.showInfo();
        }
    }

    // ------------------------------
    //  OPERACIONES DE CONJUNTOS
    // ------------------------------

    public static Set<Product> union(Set<Product> a, Set<Product> b) {
        Set<Product> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    public static Set<Product> intersection(Set<Product> a, Set<Product> b) {
        Set<Product> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    public static Set<Product> difference(Set<Product> a, Set<Product> b) {
        Set<Product> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }

    public Set<Product> getSet() {
        return products;
    }
}
