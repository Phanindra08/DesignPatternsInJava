package edu.charlotte.design_patterns.factory_design_pattern.single_product.notifications;

/**
 * It is a common interface for all notification types.
 */
public interface Notification {
    void send(String message);
}