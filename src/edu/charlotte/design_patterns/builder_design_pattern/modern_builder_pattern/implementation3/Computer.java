package edu.charlotte.design_patterns.builder_design_pattern.modern_builder_pattern.implementation3;

// Product
class Computer {
    private final String cpu;
    private final String ram;
    private final String storage;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

    public void displayInfo() {
        System.out.println("Computer Configuration:\n"
                + "\tCPU: " + cpu + "\n"
                + "\tRAM: " + ram + "\n"
                + "\tStorage: " + storage + "\n");
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}