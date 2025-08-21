package DesignPatterns.AbstractFactory;

public class MacOsFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new macButton();
    }

    @Override
    public checkBox createCheckBox() {
        return new macCheckBox();
    }
}
