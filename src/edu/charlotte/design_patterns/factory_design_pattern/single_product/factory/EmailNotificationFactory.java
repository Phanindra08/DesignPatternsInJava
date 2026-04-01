package edu.charlotte.design_patterns.factory_design_pattern.single_product.factory;

import edu.charlotte.design_patterns.factory_design_pattern.single_product.notifications.EmailNotification;
import edu.charlotte.design_patterns.factory_design_pattern.single_product.notifications.Notification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}