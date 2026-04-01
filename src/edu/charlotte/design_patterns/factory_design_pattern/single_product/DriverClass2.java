package edu.charlotte.design_patterns.factory_design_pattern.single_product;

import edu.charlotte.design_patterns.factory_design_pattern.single_product.factory.*;

import java.util.Scanner;

public class DriverClass2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Options available are:\n" +
                "1. Email Notification\n 2. SMS Notification\n 3. Push Notification\n" +
                "4. WhatsApp Notification\n");
        System.out.print("Please select one choice from the above list:");
        int selectedType = scan.nextInt();
        scan.close();
        NotificationFactory factory = getFactory(selectedType);
        factory.notifyUser(getMessage(selectedType));
    }

    public static NotificationFactory getFactory(int selectedType) {
        return switch (selectedType) {
            case 1 -> new EmailNotificationFactory();
            case 2 -> new SMSNotificationFactory();
            case 3 -> new PushNotificationFactory();
            case 4 -> new WhatsAppNotificationFactory();
            default -> throw new IllegalArgumentException("Unknown type");
        };
    }

    public static String getMessage(int selectedType) {
        return switch (selectedType) {
            case 1 -> "Welcome via Email!";
            case 2 -> "Your OTP is 1234";
            case 3 -> "You have a new friend request";
            case 4 -> "Hello from WhatsApp";
            default -> "";
        };
    }
}
