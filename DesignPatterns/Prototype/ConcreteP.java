package DesignPatterns.Prototype;

public class ConcreteP implements PrototypeIF {
    private String title;
    private String content;

    public ConcreteP(String title, String content){
        this.content=content;
        this.title=title;

    }

    public ConcreteP(ConcreteP concreteP){
        this.title=concreteP.title;
        this.content=concreteP.content;
    }

    @Override
    public PrototypeIF clone() {
        return new ConcreteP(this);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ConcreteP{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
