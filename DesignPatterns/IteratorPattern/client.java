package DesignPattern.IteratorPattern;

public class client {
    public static void main(String[] args) {
        Repository r=new Repository();
        Iterator<String> iterator=r.createIterator();

        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
