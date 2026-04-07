package edu.charlotte.design_patterns.singleton_design_pattern;

/**
 * Singleton Class object is not created until we need it and call the getInstance() method. This is called lazy instantiation.
 * This getInstance method is static, so that we can call the method without instantiating the class.
 * This getInstance method is synchronized to make sure that only one thread at a time can execute it.
 * The main disadvantage of this type of implementation: it is expensive and may decrease the performance of your program as synchronized is being used every time while getting the instance of the singleton class. However, if the performance of getInstance method is not critical for your application this method provides a clean and simple solution.
 */
public class SingletonDesignPatternImplementation2 {
    // Static member ensures memory is allocated only once (i.e., preserving the single instance)
    private static SingletonDesignPatternImplementation2 instance;

    /**
     * Creating a private constructor.
     * This prevents external attempts to create instances of the Singleton class to ensure the class has control over its instantiation process.
     */
    private SingletonDesignPatternImplementation2() {}

    /**
     * This is a static factory method. This acts as a gateway method, to provide global point of access to the singleton object.
     * Method implementation creates a new instance of the class if no instance is created.
     * @return - Returning the instance of Singleton class created
     */
    public static synchronized SingletonDesignPatternImplementation2 getInstance() {
        if(instance == null)
            instance = new SingletonDesignPatternImplementation2();
        return instance;
    }
}