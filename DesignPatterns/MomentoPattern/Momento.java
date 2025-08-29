package DesignPatterns.MomentoPattern;

public class Momento {
    private final String state;

    public Momento(String state){
        this.state=state;
    }

    public String getState() {
        return state;
    }
}
