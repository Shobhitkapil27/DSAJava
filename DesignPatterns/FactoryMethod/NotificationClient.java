package DesignPatterns.FactoryMethod;

public class NotificationClient {
    public static void main(String[] args) {
        NotificationFactory notify=new NotificationFactory();
        Notification notification =notify.createNotification("email");
        notification.sendNotification();
    }
}
