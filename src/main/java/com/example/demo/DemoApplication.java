package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        //LaptopRepository laptopRepository=context.getBean(LaptopRepository.class);
        //Laptop laptop=new Laptop(null,"hp",1200.20);

    }

}
