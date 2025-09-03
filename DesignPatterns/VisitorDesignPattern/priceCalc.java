package DesignPattern.VisitorDesignPattern;

public class priceCalc implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("The price of the book is : "+book.getPrice());
    }

    @Override
    public void visit(fruit Fruit) {
        System.out.println("The price of the fruit is : "+Fruit.getPrice());
    }
}
