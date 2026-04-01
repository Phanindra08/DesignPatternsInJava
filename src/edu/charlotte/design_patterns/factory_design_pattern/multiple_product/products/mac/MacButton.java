package edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.mac;

import edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products.Button;

public class MacButton implements Button {
    public void render() {
        System.out.println("Mac Button");
    }
}