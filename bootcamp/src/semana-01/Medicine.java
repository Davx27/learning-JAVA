public class Medicine {
    // Atributos privados
    private String name;
    private String lab;
    private double price;

    // Constructor
    public Medicine(String name, String lab, double price) {
        this.name = name;
        this.lab = lab;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getLab() {
        return lab;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Método para mostrar información
    public void showInfo() {
        System.out.println("Medicamento: " + name);
        System.out.println("Laboratorio: " + lab);
        System.out.println("Precio: $" + price);
        System.out.println("-------------------------");
    }
}
