package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class HelloController {
    @GetMapping
    String hola(){
        return "hola desde BootCamp";
    }
    @GetMapping("/bootstrap")
    String bootstrap(){
        return "Hola desde Tarea01";
    }
}
