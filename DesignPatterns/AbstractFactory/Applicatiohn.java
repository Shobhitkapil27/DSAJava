package DesignPatterns.AbstractFactory;

public class Applicatiohn {
    private Button button;
    private checkBox checkBox;

       public Applicatiohn(GuiFactory factory){
           button= factory.createButton();
           checkBox= factory.createCheckBox();
       }

       public void draw(){
           button.draw();
           checkBox.draw();
    }

    public static void main(String[] args) {
        GuiFactory factory = null;
        String osName=System.getProperty("os.name").toLowerCase();
        if(osName.contains("windows"))
            factory=new windowFactory();
        if(osName.contains("mac"))
            factory=new MacOsFactory();

        Applicatiohn app=new Applicatiohn(factory);
        app.draw();
    }
}
