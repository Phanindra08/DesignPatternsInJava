package edu.charlotte.design_patterns.factory_design_pattern.multiple_product.factory;

import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.Button;
import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.Checkbox;
import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.mac.MacButton;
import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.mac.MacCheckbox;

public class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}