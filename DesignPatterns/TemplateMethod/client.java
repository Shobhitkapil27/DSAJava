package DesignPatterns.TemplateMethod;

public class client {
    public static void main(String[] args) {
        DataParser csvParser=new csvParser();
        DataParser xmlParser=new xmlParser();

        csvParser.load();
        System.out.println();
        xmlParser.load();
    }
}
