package DesignPattern.VisitorDesignPattern;

public class fruit implements Item{
    private int price;

    public fruit(int price){
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
