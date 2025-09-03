package DesignPattern.VisitorDesignPattern;

public class Book implements Item{
    private int price;

    public Book(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
         visitor.visit(this);
    }
}
