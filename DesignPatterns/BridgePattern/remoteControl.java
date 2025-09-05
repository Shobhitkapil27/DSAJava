package DesignPattern.BridgePattern;

public abstract class remoteControl {
    protected Device device;
    public remoteControl(Device device){
        this.device=device;
    }
    abstract public void powerOn();
    abstract public void powerOff();
    abstract public void sleepSignal();
}
