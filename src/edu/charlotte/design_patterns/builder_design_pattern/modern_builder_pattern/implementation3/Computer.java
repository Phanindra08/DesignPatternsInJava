package edu.charlotte.design_patterns.builder_design_pattern.modern_builder_pattern.implementation3;

// Product
class Computer {
    private final String cpu;
    private final String ram;
    private final String storage;

    public Computer(GamingComputerBuilder gamingComputerBuilder) {
        this.cpu = gamingComputerBuilder.cpu;
        this.ram = gamingComputerBuilder.ram;
        this.storage = gamingComputerBuilder.storage;
    }

    public void displayInfo() {
        System.out.println("Computer Configuration:\n"
                + "\tCPU: " + cpu + "\n"
                + "\tRAM: " + ram + "\n"
                + "\tStorage: " + storage + "\n");
    }

    public static class GamingComputerBuilder implements Builder {
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
            return new Computer(this);
        }
    }
}