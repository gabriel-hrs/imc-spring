package com.example.demo.models;

public class Person {
    private double height;
    private double weight;
    private double imc;
    private String description;

    public Person() {
        super();
    }

    public Person(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public Person(double height, double weight, double imc, String description) {
        this.height = height;
        this.weight = weight;
        this.imc = imc;
        this.description = description;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getImc() {
        return imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}