package edu.charlotte.design_patterns.builder_design_pattern.modern_builder_pattern.implementation4;

// Nested Static Builder + Pass individual values -> Less Common for many fields
public class Client {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.GamingComputerBuilder()
                .setCPU("Gaming CPU")
                .setRAM("16GB DDR4")
                .setStorage("1TB SSD")
                .build();

        gamingComputer.displayInfo();
    }
}