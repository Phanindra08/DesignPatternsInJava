package edu.charlotte.design_patterns.builder_design_pattern.classic_builder_pattern;

public interface Builder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    Computer getResult();
}
