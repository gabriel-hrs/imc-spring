package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Person;
import com.example.demo.services.ImcService;

@RestController
@RequestMapping("/imc")
public class ImcController {
    // @Autowired
    // private ImcService svc;

    @GetMapping("/calculate")
    // @PostMapping("/calculate")
    public Person calculateImc(@RequestParam double height, @RequestParam double weight ) {
        var imc = weight / Math.pow(height, 2);

        var description = "Obesidade!";
        if (imc < 18.5) description = "Magreza!";
        else if (imc < 24.9) description = "Normal!";
        else if (imc < 30) description = "Sobrepeso!";

        var p = new Person(height, weight, imc, description);

        return p;
    // public Person calculateImc(@RequestBody Person person, @Autowired ImcService svc) {
    //     svc.calculate(person);

    //     return person;
    }
}