package CreationalDesignPatterns.SingletonPattern;

public class Singleton {
    private static Singleton uniqueInstance;
    //other useful instance Variables here


    private Singleton() {

    }

    /*By adding the synchronized keyword to getInstance() we force every thread to wait
    the turn
     */
    public static synchronized Singleton  getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    //other useful methods here
}
