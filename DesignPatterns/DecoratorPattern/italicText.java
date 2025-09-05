package DesignPattern.DecoratorPattern;

public class italicText extends textDecorator{

    public italicText(Text text){
        super(text);
    }

    @Override
    public String render() {
        return "<i>" + text.render() + "</i>";
    }
}
