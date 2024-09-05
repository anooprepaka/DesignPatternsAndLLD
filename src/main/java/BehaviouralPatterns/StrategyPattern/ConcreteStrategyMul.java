package BehaviouralPatterns.StrategyPattern;

public class ConcreteStrategyMul  implements Strategy {

    @Override
    public int excecute(int a, int b) {
        return a*b;

    }
}