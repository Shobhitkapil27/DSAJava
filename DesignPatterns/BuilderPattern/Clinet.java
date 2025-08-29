package DesignPatterns.BuilderPattern;

public class Clinet {
    public static void main(String[] args) {
        ComputerBuilderIF builder=new GamingComputerBuilder();
        ComputerDirector d=new ComputerDirector(builder);
        d.constructComputer();
        ComputerProduct comp=d.getComputer();
        System.out.println(comp);
    }
}
