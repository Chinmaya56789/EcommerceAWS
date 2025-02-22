package com.chintu.ecommerce.Models;

public class Product {

    private int ID;
    private String name;
        private String Category;

    public Product(int ID, String name, String category) {
        this.ID = ID;
        this.name = name;
        Category = category;
    }

    public String getCategory() {
        return Category;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", Category='" + Category + '\'' +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setName(String name) {
        this.name = name;
    }
}
