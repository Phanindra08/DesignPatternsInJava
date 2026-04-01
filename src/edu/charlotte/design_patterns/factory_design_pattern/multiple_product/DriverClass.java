package edu.charlotte.design_patterns.factory_design_pattern.multiple_product;

import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.client.Application;
import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.factory.GUIFactory;
import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.factory.MacFactory;
import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.factory.WindowsFactory;

public class DriverClass {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();
        Application app = new Application(factory);
        app.render();

        factory = new MacFactory();
        app = new Application(factory);
        app.render();
    }
}