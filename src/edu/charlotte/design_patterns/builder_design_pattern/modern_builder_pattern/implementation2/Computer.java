package edu.charlotte.design_patterns.builder_design_pattern.modern_builder_pattern.implementation2;

// Product
class Computer {
    private final String cpu;
    private final String ram;
    private final String storage;

    public Computer(String cpu, String ram, String storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public void displayInfo() {
        System.out.println("Computer Configuration:\n"
                + "\tCPU: " + cpu + "\n"
                + "\tRAM: " + ram + "\n"
                + "\tStorage: " + storage + "\n");
    }
}