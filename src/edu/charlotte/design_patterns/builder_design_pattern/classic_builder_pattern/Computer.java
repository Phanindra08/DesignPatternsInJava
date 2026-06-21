package edu.charlotte.design_patterns.builder_design_pattern.classic_builder_pattern;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }
    public void setRAM(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void displayInfo() {
        System.out.println("The Computer Configurations are:\n"
                + "\tCPU: " + cpu + "\n"
                + "\tRAM: " + ram + "\n"
                + "\tStorage: " + storage + "\n");
    }
}
