package edu.charlotte.design_patterns.builder_design_pattern.modern_builder_pattern.implementation1;

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
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getStorage() {
        return this.storage;
    }

    @Override
    public Computer build() {
        return new Computer(this);
    }
}