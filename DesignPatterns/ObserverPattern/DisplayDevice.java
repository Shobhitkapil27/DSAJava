package DesignPatterns.ObserverPattern;

public class DisplayDevice implements Observer{

    private String name;

    public DisplayDevice(String name){
        this.name=name;
    }

    @Override
    public void update(float temprature) {
        System.out.println(name + " received updated temperature: " + temprature + "°C");
    }
}
