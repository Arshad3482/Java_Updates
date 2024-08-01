package com.example.builder;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                            .setDough("Thin crust")
                            .setSauce("Tomato")
                            .setTopping("Pepperoni")
                            .build();

        System.out.println(pizza);
    }
}
