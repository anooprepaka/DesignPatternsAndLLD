package BehaviouralPatterns.StrategyPattern;

public class ConcreteStrategyAdd  implements Strategy {

    @Override
    public int excecute(int a, int b) {
        return a+b;

    }
}
