package edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.windows;

import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.Button;

public class WindowsButton implements Button {
    public void render() {
        System.out.println("Windows Button");
    }
}