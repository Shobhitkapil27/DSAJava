package DesignPattern.DecoratorPattern;

public class boldText extends textDecorator{
    public boldText(Text text) {
        super(text);
    }

    public String render() {
        return "<b>" + text.render() + "</b>";
    }
}
