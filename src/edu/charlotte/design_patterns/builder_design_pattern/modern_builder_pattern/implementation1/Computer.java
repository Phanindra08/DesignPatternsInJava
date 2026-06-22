package edu.charlotte.design_patterns.builder_design_pattern.modern_builder_pattern.implementation1;

// Product
class Computer {
    private final String cpu;
    private final String ram;
    private final String storage;

    public Computer(Builder builder) {
        this.cpu = builder.getCPU();
        this.ram = builder.getRAM();
        this.storage = builder.getStorage();
    }

    public void displayInfo() {
        System.out.println("Computer Configuration:\n"
                + "\tCPU: " + cpu + "\n"
                + "\tRAM: " + ram + "\n"
                + "\tStorage: " + storage + "\n");
    }
}