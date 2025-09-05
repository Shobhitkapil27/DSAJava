package DesignPattern.BridgePattern;

public class client {
    public static void main(String[] args) {
         basicRemote remote=new basicRemote(new TV());
         basicRemote remote2=new basicRemote(new Radio());

         remote.powerOn();
         remote.sleepSignal();
         remote.powerOff();

         remote2.powerOn();
         remote2.sleepSignal();
         remote2.powerOff();
    }
}
