package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contolador {
    
    @GetMapping("/")
    public String mensaje(){
        System.out.println("Exito");
        return "Hola mundo :D";
    }
}
