package DesignPatterns.AbstractFactory;

public class windowFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public checkBox createCheckBox() {
        return new WindowCheckBox();
    }
}
