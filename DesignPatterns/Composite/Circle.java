package DesignPattern.Composite;

public class Circle implements Graphic {
    @Override
    public void Draw() {
        System.out.println("Drawing a Circle!!");
    }
}

class Square implements Graphic {
    @Override
    public void Draw() {
        System.out.println("Drawing a Square!!");
    }
}
