package edu.charlotte.design_patterns.factory_design_pattern.notifications;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Push notification: " + message);
    }
}
