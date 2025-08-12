package com.example.demo.internship.laptop;

public class Laptop {
    String brand;
    int id;

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", id=" + id +
                ", brandName='" + brandName + '\'' +
                ", processorSpeed='" + processorSpeed + '\'' +
                ", processorBrand='" + processorBrand + '\'' +
                '}';
    }

    String brandName;
    String processorSpeed;
    String processorBrand;

    public Laptop(String brand, String processorSpeed, String processorBrand){
        this.brand = brand;
        this.processorSpeed = processorSpeed;
        this.processorBrand = processorBrand;
    }
    public Laptop(){

    }
}
