public class MainInventory {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        // Agregar productos
        inventory.addProduct(new Medicine("Dolex", "Lafrancol", 8500));
        inventory.addProduct(new Medicine("Ibuprofeno", "MK", 12000));
        inventory.addProduct(new Medicine("Loratadina", "Tecnoquimicas", 15000));
        inventory.addProduct(new Medicine("Acetaminofén", "Genfar", 6000));

        System.out.println("\n--- Inventario completo ---");
        inventory.showAll();

        // Buscar
        System.out.println("\n--- Buscar Ibuprofeno ---");
        Medicine m = inventory.searchByName("Ibuprofeno");
        if (m != null) m.showInfo();

        // Filtrar
        System.out.println("\n--- Productos de MK ---");
        inventory.filterByLab("MK");

        // Actualizar precio
        System.out.println("\n--- Actualizar precio de Loratadina ---");
        inventory.updatePrice("Loratadina", 18000);

        // Eliminar
        System.out.println("\n--- Eliminar Acetaminofén ---");
        inventory.removeProduct("Acetaminofén");

        // Ver tamaño
        System.out.println("\nProductos totales: " + inventory.size());
    }
}
