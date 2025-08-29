package DesignPatterns.MomentoPattern;

public class Editor {
    private String text=" ";

    public void type(String word){
        text+=word;
    }

    public Momento save(){
        return new Momento(text);
    }

    public void restore(Momento momento){
        this.text=momento.getState();
    }

    public void show(){
        System.out.println(text);
    }
}
