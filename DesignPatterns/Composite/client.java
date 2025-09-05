package DesignPattern.Composite;

public class client {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Circle circle2 = new Circle();
        Square square2 = new Square();

        Drawing drawing = new Drawing();
        drawing.add(circle);
        drawing.add(square);

        Drawing drawing2 = new Drawing();
        drawing2.add(square2);
        drawing2.add(circle2);
        drawing.add(drawing2);

        drawing.Draw();

    }
}
