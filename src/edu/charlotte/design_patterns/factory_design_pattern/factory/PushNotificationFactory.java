package edu.charlotte.design_patterns.factory_design_pattern.factory;

import edu.charlotte.design_patterns.factory_design_pattern.notifications.Notification;
import edu.charlotte.design_patterns.factory_design_pattern.notifications.PushNotification;

public class PushNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}