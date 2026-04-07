package edu.charlotte.design_patterns.singleton_design_pattern;

/**
 * The instance of the singleton class is created in a static initializer. This is called eager instantiation.
 * The getInstance method is static, so that we can call the method without instantiating the class.
 */
public class SingletonDesignPatternImplementation3 {
    // Static member ensures memory is allocated only once (i.e., preserving the single instance)
    private static final SingletonDesignPatternImplementation3 instance = new SingletonDesignPatternImplementation3();

    /**
     * Creating a private constructor.
     * This prevents external attempts to create instances of the Singleton class to ensure the class has control over its instantiation process.
     */
    private SingletonDesignPatternImplementation3() {}

    /**
     * This is a static factory method. This acts as a gateway method, to provide global point of access to the singleton object.
     * @return - Returning the instance of Singleton class created
     */
    public static SingletonDesignPatternImplementation3 getInstance() {
        return instance;
    }
}