package edu.charlotte.design_patterns.factory_design_pattern.single_product.factory;

import edu.charlotte.design_patterns.factory_design_pattern.single_product.notifications.Notification;
import edu.charlotte.design_patterns.factory_design_pattern.single_product.notifications.PushNotification;

public class PushNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}