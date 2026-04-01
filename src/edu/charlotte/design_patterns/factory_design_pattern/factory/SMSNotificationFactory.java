package edu.charlotte.design_patterns.factory_design_pattern.factory;

import edu.charlotte.design_patterns.factory_design_pattern.notifications.Notification;
import edu.charlotte.design_patterns.factory_design_pattern.notifications.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}