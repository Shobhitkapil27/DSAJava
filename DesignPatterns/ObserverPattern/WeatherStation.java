package DesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private List<Observer> observers=new ArrayList<>();
    private float temprature;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
       for (Observer o:observers)
           o.update(temprature);
    }

    public void setTemprature(float temprature) {
        this.temprature = temprature;
        notifyObserver();
    }
}
