package edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.mac;

import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.Checkbox;

public class MacCheckbox implements Checkbox {
    public void check() {
        System.out.println("Mac Checkbox");
    }
}