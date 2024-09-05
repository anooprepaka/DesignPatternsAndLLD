package BehaviouralPatterns.ObserverPattern;

public class DisplayBoard implements Observer {
    double price;
    @Override
    public void update(double price) {
        this.price = price;
        System.out.println("Display Board updated with price " + price);

    }
}
