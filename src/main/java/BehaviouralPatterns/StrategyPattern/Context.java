package BehaviouralPatterns.StrategyPattern;

public class Context {
    private Strategy strategy;
    public void setStrategy (Strategy strategy) {
        this.strategy = strategy;
    }
    public int  excecuteStrategy(int a, int b)
    {
        return strategy.excecute(a,b);
    }

}
