package DesignPatterns.ObserverPattern;

public class client {
    public static void main(String[] args) {
        DisplayDevice d1=new DisplayDevice("Mobile Phone");
        DisplayDevice d2=new DisplayDevice("TV");

        WeatherStation station=new WeatherStation();

        station.registerObserver(d1);
        station.registerObserver(d2);
        station.setTemprature(25);
        station.setTemprature(45.0f);

    }
}
