package BehaviouralPatterns.ObserverPattern;

import java.util.ArrayList;

public interface Subject {


    public void addObservers(Observer observer);
    public void removeObservers(Observer observer);
    public void notifyObservers(double price);


}
