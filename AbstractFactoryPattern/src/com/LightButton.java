package com.example;

// Concrete Product A1
public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Light Button");
    }
}
