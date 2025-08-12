package com.example.demo.internship.laptop;

public class LaptopTest {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();

        Laptop l2 = new Laptop("Dell", "3.2GHZ", "Intel");
        System.out.println(l1);
        System.out.println(l2);
    }
}
