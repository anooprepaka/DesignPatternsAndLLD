package BehaviouralPatterns.ObserverPattern;

class Logger implements Observer {
    @Override
    public void update(double price) {
        System.out.println("Logger: Stock price change recorded as " + price);
    }
}
