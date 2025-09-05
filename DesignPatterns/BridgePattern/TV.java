package DesignPattern.BridgePattern;

public class TV implements Device{
    @Override
    public void turnOff() {
        System.out.println("TV is turned off!!");
    }

    @Override
    public void turnOn() {
        System.out.println("TV is turned on!!");
    }

    @Override
    public void sleep() {
        System.out.println("TV is sleeping!!");
    }
}
