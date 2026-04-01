package edu.charlotte.design_patterns.factory_design_pattern.notifications;

/**
 * It is a common interface for all notification types.
 */
public interface Notification {
    void send(String message);
}