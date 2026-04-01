package edu.charlotte.design_patterns.factory_design_pattern.single_product.factory;

import edu.charlotte.design_patterns.factory_design_pattern.single_product.notifications.Notification;
import edu.charlotte.design_patterns.factory_design_pattern.single_product.notifications.WhatsAppNotification;

public class WhatsAppNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new WhatsAppNotification();
    }
}