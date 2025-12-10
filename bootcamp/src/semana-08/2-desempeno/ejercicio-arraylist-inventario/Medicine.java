public class Medicine {

    private String name;
    private String laboratory;
    private double price;

    public Medicine(String name, String laboratory, double price) {
        this.name = name;
        this.laboratory = laboratory;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getLaboratory() {
        return laboratory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void showInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Laboratorio: " + laboratory);
        System.out.println("Precio: $" + price);
        System.out.println("---------------------");
    }
}
