package edu.charlotte.design_patterns.factory_design_pattern.factory;

import edu.charlotte.design_patterns.factory_design_pattern.notifications.Notification;

public abstract class NotificationFactory {

    // Factory Method
    public abstract Notification createNotification();

    // Common business logic using the notifications product
    public void notifyUser(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}