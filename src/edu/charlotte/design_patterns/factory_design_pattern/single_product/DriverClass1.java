package edu.charlotte.design_patterns.factory_design_pattern.single_product;

import edu.charlotte.design_patterns.factory_design_pattern.single_product.factory.*;

public class DriverClass1 {
    public static void main(String[] args) {
        NotificationFactory factory;

        factory = new EmailNotificationFactory();
        factory.notifyUser("Welcome via Email!");

        factory = new SMSNotificationFactory();
        factory.notifyUser("Your OTP is 1234");

        factory = new PushNotificationFactory();
        factory.notifyUser("You have a new friend request");

        factory = new WhatsAppNotificationFactory();
        factory.notifyUser("Hello from WhatsApp");
    }
}