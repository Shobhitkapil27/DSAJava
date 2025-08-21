package DesignPatterns.FactoryMethod;

public class NotificationFactory {
    public Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "sms":
                return new smsNotification();
            case "email":
                return new emailNotification();
            case "push":
                return new msgNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}
