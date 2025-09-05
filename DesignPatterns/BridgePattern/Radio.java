package DesignPattern.BridgePattern;

public class Radio implements Device{@Override
public void turnOff() {
    System.out.println("Radio is turned off!!");
}

    @Override
    public void turnOn() {
        System.out.println("Radio is turned on!!");
    }

    @Override
    public void sleep() {
        System.out.println("Radio is sleeping!!");
    }
}
