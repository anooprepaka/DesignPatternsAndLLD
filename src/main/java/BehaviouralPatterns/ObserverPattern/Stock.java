package BehaviouralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    double currentPrice;
    @Override
    public void addObservers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers(double newPrice) {
        currentPrice = newPrice;
        for(int i = 0; i < observers.size(); i++){
            observers.get(i).update(currentPrice);
        }
    }
}
