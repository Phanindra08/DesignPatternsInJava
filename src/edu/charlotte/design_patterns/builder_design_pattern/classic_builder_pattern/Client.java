package edu.charlotte.design_patterns.builder_design_pattern.classic_builder_pattern;

public class Client {
    public static void main(String[] args) {
        GamingComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector();
        computerDirector.construct(gamingComputerBuilder);
        Computer gamingComputer = gamingComputerBuilder.getResult();
        gamingComputer.displayInfo();
    }
}