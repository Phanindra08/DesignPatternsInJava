package edu.charlotte.design_patterns.factory_design_pattern.factory;

import edu.charlotte.design_patterns.factory_design_pattern.notifications.EmailNotification;
import edu.charlotte.design_patterns.factory_design_pattern.notifications.Notification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}