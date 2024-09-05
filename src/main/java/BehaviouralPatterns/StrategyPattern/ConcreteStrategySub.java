package BehaviouralPatterns.StrategyPattern;

public class ConcreteStrategySub  implements Strategy {

    @Override
    public int excecute(int a, int b) {
        return a-b;

    }
}