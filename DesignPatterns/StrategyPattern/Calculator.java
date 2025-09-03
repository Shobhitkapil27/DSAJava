package DesignPattern.StrategyPattern;

public class Calculator {

    private Strategy strategy;

    public Calculator(Strategy strategy){
        this.strategy = strategy;
    }

    //This is for changing the strategy at runtime
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int a,int b){
        return strategy.execute(a,b);
    }
}
