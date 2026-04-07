package edu.charlotte.design_patterns.singleton_design_pattern;

/**
 * This is the Classical implementation.
 * Singleton Class object is not created until we need it and call the getInstance() method. This is called lazy instantiation.
 * This getInstance method is static, so that we can call the method without instantiating the class.
 * The main problem with this type of implementation is it is not thread-safe. If two threads access the getInstance method at the same time then the execution sequence creates two objects for the Singleton Class.
 */
public class SingletonDesignPatternImplementation1 {
    // Static member ensures memory is allocated only once (i.e., preserving the single instance)
    private static SingletonDesignPatternImplementation1 instance;

    /**
     * Creating a private constructor.
     * This prevents external attempts to create instances of the Singleton class to ensure the class has control over its instantiation process.
     */
    private SingletonDesignPatternImplementation1() {}

    /**
     * This is a static factory method. This acts as a gateway method, to provide global point of access to the singleton object.
     * Method implementation creates a new instance of the class if no instance is created.
     * @return - Returning the instance of Singleton class created
     */
    public static SingletonDesignPatternImplementation1 getInstance() {
        if(instance == null)
            instance = new SingletonDesignPatternImplementation1();
        return instance;
    }
}