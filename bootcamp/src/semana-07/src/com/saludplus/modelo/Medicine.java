package com.saludplus.modelo;

/**
 * Modelo que representa un medicamento en la farmacia SaludPlus.
 */
public class Medicine {
    private final int id;
    private final String name;
    private final String laboratory;
    private double price;
    private int stock;

    public Medicine(int id, String name, String laboratory, double price, int stock) {
        this.id = id;
        this.name = name;
        this.laboratory = laboratory;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
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

    public int getStock() {
        return stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void decreaseStock(int amount) {
        this.stock -= amount;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", laboratory='" + laboratory + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}