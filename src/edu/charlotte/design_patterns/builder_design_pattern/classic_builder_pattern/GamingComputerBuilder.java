package edu.charlotte.design_patterns.builder_design_pattern.classic_builder_pattern;

public class GamingComputerBuilder implements Builder {
    private final Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.setCPU("Gaming CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("16GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}