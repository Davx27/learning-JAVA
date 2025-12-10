public class Product {

    private String code;       // identificador único
    private String name;
    private double price;

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Necesario para HashSet
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Product other = (Product) obj;

        return this.code.equalsIgnoreCase(other.code);
    }

    // Necesario para HashSet
    @Override
    public int hashCode() {
        return code.toLowerCase().hashCode();
    }

    public void showInfo() {
        System.out.println("Código: " + code);
        System.out.println("Nombre: " + name);
        System.out.println("Precio: $" + price);
        System.out.println("-------------------------");
    }

    @Override
    public String toString() {
        return "{code='" + code + "', name='" + name + "', price=" + price + "}";
    }
}
