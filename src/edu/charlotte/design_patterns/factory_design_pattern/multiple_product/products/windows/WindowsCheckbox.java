package edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.windows;

import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.Checkbox;

public class WindowsCheckbox implements Checkbox {
    public void check() {
        System.out.println("Windows Checkbox");
    }
}