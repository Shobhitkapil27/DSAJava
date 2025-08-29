package DesignPatterns.TemplateMethod;

public class csvParser extends DataParser{
    @Override
    protected void parseData() {
        System.out.println("Reading CSV data... Loading to DB!");
    }
}

class xmlParser extends DataParser{
    @Override
    protected void parseData() {
        System.out.println("Reading the XML file.... Loading to DB!!");
    }
}
