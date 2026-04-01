package edu.charlotte.design_patterns.factory_design_pattern.multiple_product.factory;

import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.Button;
import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}