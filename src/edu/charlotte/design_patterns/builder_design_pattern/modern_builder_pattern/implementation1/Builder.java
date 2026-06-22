package edu.charlotte.design_patterns.builder_design_pattern.modern_builder_pattern.implementation1;

interface Builder {
    Builder setCPU(String cpu);
    Builder setRAM(String ram);
    Builder setStorage(String storage);
    String getCPU();
    String getRAM();
    String getStorage();
    Computer build();
}