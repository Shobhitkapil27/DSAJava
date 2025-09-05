package DesignPattern.DecoratorPattern;

public class plainText implements Text{
    private String text;

    public plainText(String text) {
        this.text = text;
    }

    @Override
    public String render() {
        return text;
    }
}
