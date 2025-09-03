package DesignPattern.StrategyPattern;

public class client {
    public static void main(String[] args) {
        Calculator clac=new Calculator(new AddStrategy());
        System.out.println("Addition of 55 and 56: "+clac.calculate(55,56));

        clac.setStrategy(new subtractStrategy());
        System.out.println("Subtraction of 55 and 56: "+clac.calculate(55,56));

        clac.setStrategy(new multiplyStrategy());
        System.out.println("Multiplication of 55 and 56: "+clac.calculate(55,56));

        clac.setStrategy(new devideStrategy());
        System.out.println("Devide of 55 and 56: "+clac.calculate(55,56));
    }
}
