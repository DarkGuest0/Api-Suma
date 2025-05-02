package com.sena.proyecto.spring.suma.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSuma {

    @GetMapping("/sumar")
    public String Suma(@RequestParam int num1, @RequestParam int num2) {
        int t = num1 + num2;
        System.out.println("Total = " + t);
        return "Total = " + t;
    }
}
