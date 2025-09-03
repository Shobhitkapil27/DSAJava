package DesignPattern.StrategyPattern;

public class AddStrategy implements Strategy{
    @Override
    public int execute(int numA, int numB) {
        return numA+numB;
    }
}

class subtractStrategy implements Strategy{
    @Override
    public int execute(int numA, int numB) {
        return numA-numB;
    }
}

class multiplyStrategy implements Strategy{
    @Override
    public int execute(int numA, int numB) {
        return numA*numB;
    }
}

class devideStrategy implements Strategy{
    @Override
    public int execute(int numA, int numB) {
        return numA/numB;
    }
}
