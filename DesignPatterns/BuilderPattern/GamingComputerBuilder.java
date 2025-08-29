package DesignPatterns.BuilderPattern;

public class GamingComputerBuilder implements ComputerBuilderIF{
    private ComputerProduct computer;

    public GamingComputerBuilder() {
        this.computer=new ComputerProduct();
    }

    @Override
    public void buildCPU() {
      computer.setCPU("Intel i9");
    }

    @Override
    public void buildGPU() {
      computer.setGPU("Nvidia G9");
    }

    @Override
    public void buildRAM() {
     computer.setRAM("32GB");
    }

    @Override
    public void buildROM() {
      computer.setROM("1TB");
    }

    public ComputerProduct buildComputer() {
        return computer;
    }
}
