package DesignPatterns.TemplateMethod;

public abstract class DataParser {
    public void load(){
        openFile();
        parseData();
        closFile();
    }

    protected void openFile(){
        System.out.println("Opening the file...");
    }

    protected void closFile(){
        System.out.println("Closing the file...");
    }

    protected abstract void parseData();
}
