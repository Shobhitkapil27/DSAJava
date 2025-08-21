package DesignPatterns.AbstractFactory;

public class WindowButton implements Button{
    @Override
    public void draw() {
        System.out.println("Rendering Windows Button!!");
    }
}

class WindowCheckBox implements checkBox{
    @Override
    public void draw() {
        System.out.println("Rendering Windows checkbox");
    }
}

class macButton implements Button{
    @Override
    public void draw() {
        System.out.println("Rendering MacOS Button");
    }
}

class macCheckBox implements checkBox{
    @Override
    public void draw() {
        System.out.println("Rendering MacOS CheckBox");
    }
}
