package edu.charlotte.design_patterns.factory_design_pattern.single_product.notifications;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Push notification: " + message);
    }
}
