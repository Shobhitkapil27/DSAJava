package DesignPatterns.BuilderPattern;

public interface ComputerBuilderIF {
    void buildCPU();
    void buildGPU();
    void buildRAM();
    void buildROM();
    ComputerProduct buildComputer();
}
