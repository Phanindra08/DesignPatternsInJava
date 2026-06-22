package edu.charlotte.design_patterns.builder_design_pattern.modern_builder_pattern.implementation4;

interface Builder {
    Builder setCPU(String cpu);
    Builder setRAM(String ram);
    Builder setStorage(String storage);
    Computer build();
}