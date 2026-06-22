package edu.charlotte.design_patterns.builder_design_pattern.modern_builder_pattern.implementation2;

class GamingComputerBuilder implements Builder {
    private String cpu;
    private String ram;
    private String storage;

    @Override
    public Builder setCPU(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public Builder setRAM(String ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public Builder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(cpu, ram, storage);
    }
}