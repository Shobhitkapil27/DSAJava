package DesignPattern.VisitorDesignPattern;

public class client {
    public static void main(String[] args) {
        Book book=new Book(23);
        fruit apple=new fruit(34);

        Item[] item=new Item[]{apple,book};

        priceCalc Price=new priceCalc();

        for(Item i:item){
            i.accept(Price);
        }
    }
}
