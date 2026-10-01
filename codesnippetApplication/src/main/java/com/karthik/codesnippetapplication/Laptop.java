package com.karthik.codesnippetapplication;

import lombok.Getter;

public class Laptop {
    @Getter
    private int laptopId;
    private String brand;
    private String operatingSystem;
    private int price;
    private int rating;

    public Laptop(int laptopId, String brand, String operatingSystem, int price, int rating) {
        this.laptopId=laptopId;
        this.brand=brand;
        this.operatingSystem=operatingSystem;
        this.price=price;
        this.rating=rating;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId=laptopId;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

}
