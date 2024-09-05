package BehaviouralPatterns.ObserverPattern;

class MobileAlert implements Observer {
    @Override
    public void update(double price) {
        System.out.println("Mobile Alert: Stock price updated to " + price);
    }
}
