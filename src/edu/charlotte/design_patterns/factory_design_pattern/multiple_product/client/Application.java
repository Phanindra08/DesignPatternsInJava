package edu.charlotte.design_patterns.factory_design_pattern.multiple_product.client;

import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.factory.GUIFactory;
import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.Button;
import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.Checkbox;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.check();
    }
}