package DesignPattern.BridgePattern;

import java.rmi.Remote;

public class basicRemote extends remoteControl {
     public basicRemote(Device device) {
         super(device);
     }

    public void sleepSignal() {
        device.sleep();
    }

    @Override
    public void powerOff() {
        device.turnOff();
    }
    @Override
    public void powerOn() {
         device.turnOn();
    }
}
