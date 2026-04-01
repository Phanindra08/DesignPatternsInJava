package edu.charlotte.design_patterns.factory_design_pattern.multiple_product.factory;

import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.Button;
import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.Checkbox;
import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.windows.WindowsButton;
import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.windows.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}