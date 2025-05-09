package com.sena.proyecto.spring.suma.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ControladorCalculadora {

    @GetMapping("/sumar")
    public int Suma(@RequestParam int num1, @RequestParam int num2, @RequestParam int num3){
        return num1+num2+num3;
    }

    @GetMapping("/restar/{num1}/{num2}")
    public int Resta(@PathVariable int num1,@PathVariable int num2){
        return num1-num2;
    }

    @PostMapping("/multiplicar")
    public int Multiplicacion(@RequestBody int num1, @RequestBody int num2){
        int total= num1*num2;
        return total;
    }

    @DeleteMapping("/dividir")
    public double Division(@RequestParam int num1, @RequestParam int num2){
        double total= num1/num2;
        return total;
    }


}
