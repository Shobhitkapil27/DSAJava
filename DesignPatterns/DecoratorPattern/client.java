package DesignPattern.DecoratorPattern;

public class client {
    public static void main(String[] args) {
        Text text=new plainText("Hello World");
        Text text2=new boldText(text);
        Text finalText=new italicText(text2);

        System.out.println(finalText.render());
    }
}
