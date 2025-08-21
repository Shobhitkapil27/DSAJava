package DesignPatterns.FactoryMethod;

public class smsNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("You have recieved a text Message !!");
    }
}

class emailNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("You have recieved an E-mail");
    }
}

class msgNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("You have recieved an Whatsapp Message");
    }
}
