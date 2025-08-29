package DesignPatterns.Prototype;

public class client {
    public static void main(String[] args) {
        ConcreteP doc=new ConcreteP("The Monk who sold his ferrari","Enlightenment");
        ConcreteP docDup= (ConcreteP) doc.clone();
        System.out.println(doc);
        System.out.println(docDup);

        docDup.setContent("History");
        docDup.setTitle("The war of LANKA");
        System.out.println(docDup);
    }
}
