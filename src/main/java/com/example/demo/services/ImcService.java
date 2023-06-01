package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.models.Person;

@Service
public class ImcService {
    public ImcService() {
        super();
        System.out.println("Criando ImcService!");
    }

    public void calculate(Person person) {
        var imc = person.getWeight() / Math.pow(person.getHeight(), 2);
        var description = "Obesidade!";
        if (imc < 18.5) description = "Magreza!";
        else if (imc < 24.9) description = "Normal!";
        else if (imc < 30) description = "Sobrepeso!";

        person.setImc(imc);
        person.setDescription(description);
    }
}