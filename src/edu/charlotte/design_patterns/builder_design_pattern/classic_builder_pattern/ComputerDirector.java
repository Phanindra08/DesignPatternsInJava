package edu.charlotte.design_patterns.builder_design_pattern.classic_builder_pattern;

public class ComputerDirector {
    public void construct(Builder builder) {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
    }
}