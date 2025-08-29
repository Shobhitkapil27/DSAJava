package DesignPatterns.BuilderPattern;

public class ComputerProduct {

    private String RAM;
    private String ROM;
    private String GPU;
    private String CPU;

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setROM(String ROM) {
        this.ROM = ROM;
    }

    @Override
    public String toString() {
        return "ComputerProduct{" +
                "RAM='" + RAM + '\'' +
                ", ROM='" + ROM + '\'' +
                ", GPU='" + GPU + '\'' +
                ", CPU='" + CPU + '\'' +
                '}';
    }
}
