package edu.charlotte.design_patterns.singleton_design_pattern;

public class DriverClass {
    public static void main(String[] args) {
        SingletonDesignPatternImplementation1 singletonObject1 = SingletonDesignPatternImplementation1.getInstance();
        System.out.println("Classical way of the Singleton Object is instantiated: " + singletonObject1);

        SingletonDesignPatternImplementation2 singletonObject2 = SingletonDesignPatternImplementation2.getInstance();
        System.out.println("Thread Synchronized way of the Singleton Object is instantiated: " + singletonObject2);

        SingletonDesignPatternImplementation3 singletonObject3 = SingletonDesignPatternImplementation3.getInstance();
        System.out.println("Eager Instantiation way of the Singleton Object is instantiated: " + singletonObject3);
    }
}
