package com.example.builder;

import com.example.builder.Computer;

public class Main {
    public static void main(String[] args) {
        // Creating a Computer object using the Builder
        Computer myComputer = new Computer.Builder()
            .setCPU("Intel i7")
            .setRAM(16)
            .setStorage(512)
            .build();

        // Accessing properties of the Computer object
        System.out.println("CPU: " + myComputer.getCPU());         // Outputs: Intel i7
        System.out.println("RAM: " + myComputer.getRAM() + "GB");  // Outputs: 16GB
        System.out.println("Storage: " + myComputer.getStorage() + "GB");  // Outputs: 512GB
    }
}
