package edu.charlotte.design_patterns.builder_design_pattern.modern_builder_pattern.implementation3;

// Nested Static Builder + Pass Builder Object -> Very Common
public class Client {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Gaming CPU")
                .setRAM("16GB DDR4")
                .setStorage("1TB SSD")
                .build();

        gamingComputer.displayInfo();
    }
}