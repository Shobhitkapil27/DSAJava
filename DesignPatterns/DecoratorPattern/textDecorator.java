package DesignPattern.DecoratorPattern;

public abstract class textDecorator implements Text {

    protected Text text;

    public textDecorator(Text text) {
        this.text = text;
    }

    @Override
    public abstract String render();
}
