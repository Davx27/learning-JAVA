import java.util.ArrayList;

public class Inventory {

    private ArrayList<Medicine> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    // Agregar producto
    public void addProduct(Medicine m) {
        products.add(m);
        System.out.println("✔️ Producto agregado.");
    }

    // Eliminar por nombre
    public void removeProduct(String name) {
        Medicine toRemove = null;

        for (Medicine m : products) {
            if (m.getName().equalsIgnoreCase(name)) {
                toRemove = m;
                break;
            }
        }

        if (toRemove != null) {
            products.remove(toRemove);
            System.out.println("✔️ Producto eliminado.");
        } else {
            System.out.println("❌ No encontrado.");
        }
    }

    // Buscar por nombre
    public Medicine searchByName(String name) {
        for (Medicine m : products) {
            if (m.getName().equalsIgnoreCase(name)) {
                return m;
            }
        }
        return null;
    }

    // Filtrar por laboratorio
    public void filterByLab(String lab) {
        boolean found = false;
        for (Medicine m : products) {
            if (m.getLaboratory().equalsIgnoreCase(lab)) {
                m.showInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("❌ No hay productos de ese laboratorio.");
        }
    }

    // Actualizar precio
    public void updatePrice(String name, double newPrice) {
        Medicine m = searchByName(name);

        if (m != null) {
            m.setPrice(newPrice);
            System.out.println("✔️ Precio actualizado.");
        } else {
            System.out.println("❌ Producto no encontrado.");
        }
    }

    // Obtener cantidad total
    public int size() {
        return products.size();
    }

    // Mostrar todo el inventario
    public void showAll() {
        for (Medicine m : products) {
            m.showInfo();
        }
    }
}
