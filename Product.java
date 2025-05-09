package com.inventory.model;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private int quantity;
    private double price;
    private String category;

    public Product() {
        this.id = UUID.randomUUID();
    }

    public Product(String name, int quantity, double price, String category) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}