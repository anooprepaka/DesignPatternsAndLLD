package BehaviouralPatterns.ObserverPattern;

public class main {
    public static void main(String[] args) {
        /*
        Observer Pattern: The Observer pattern is used when you have a one-to-many relationship between objects,
         meaning one object (the subject) changes state and needs to notify multiple other objects (observers) about the change.
         */
        Stock stock = new Stock();
        DisplayBoard displayBoard = new DisplayBoard();
        Logger logger = new Logger();
        MobileAlert mobileAlert = new MobileAlert();
        stock.addObservers(displayBoard);
        stock.addObservers(logger);
        stock.addObservers(mobileAlert);
        stock.notifyObservers(55);
        stock.removeObservers(displayBoard);
        stock.notifyObservers(60);

    }
}
