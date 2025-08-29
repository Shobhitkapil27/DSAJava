package DesignPatterns.BuilderPattern;

public class ComputerDirector {

    private ComputerBuilderIF builder;

    public ComputerDirector(ComputerBuilderIF builder){
        this.builder=builder;
    }

    public void constructComputer(){
        builder.buildCPU();
        builder.buildGPU();
        builder.buildRAM();
        builder.buildROM();
    }

    public ComputerProduct getComputer(){
       return builder.buildComputer();
    }
}
