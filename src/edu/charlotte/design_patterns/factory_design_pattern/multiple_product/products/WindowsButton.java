package edu.charlotte.design_patterns.factory_design_pattern.multiple_product.products;

public class WindowsButton implements Button {
    public void render() {
        System.out.println("Windows Button");
    }
}