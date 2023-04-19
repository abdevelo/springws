package com.kbstar.dto;

public class ProductDTO {

    private String id;
    private String name;
    private int qt;
    private double price;

    public ProductDTO() {
    }

    public ProductDTO(String id, String name, int qt, double price) {
        this.id = id;
        this.name = name;
        this.qt = qt;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", qt=" + qt +
                ", price=" + price +
                '}';
    }
}
