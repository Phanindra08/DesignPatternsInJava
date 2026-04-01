package edu.charlotte.design_patterns.factory_design_pattern;

import edu.charlotte.design_patterns.factory_design_pattern.factory.EmailNotificationFactory;
import edu.charlotte.design_patterns.factory_design_pattern.factory.NotificationFactory;
import edu.charlotte.design_patterns.factory_design_pattern.factory.PushNotificationFactory;
import edu.charlotte.design_patterns.factory_design_pattern.factory.SMSNotificationFactory;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory;

        factory = new EmailNotificationFactory();
        factory.notifyUser("Welcome via Email!");

        factory = new SMSNotificationFactory();
        factory.notifyUser("Your OTP is 1234");

        factory = new PushNotificationFactory();
        factory.notifyUser("You have a new friend request");
    }
}
