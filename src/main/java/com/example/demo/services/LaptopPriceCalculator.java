package com.example.demo.services;

import com.example.demo.models.Laptop;

public class LaptopPriceCalculator {
    public double calculatePrice(Laptop laptop){
        double price= laptop.getPrecio();
        if(laptop.getPrecio()>100){
            price+=20;
        }
        price+=5;
        return price;
    }
}
