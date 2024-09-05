package CreationalDesignPatterns.FactoryPattern;

public class Main {
    /*
    Factory Method is a creational design pattern that provides an interface for creating objects
    in a superclass, but allows subclasses to alter the type of objects that will be created.
     */
   public static void main(String[] args) {
       Dialog dialog = new WindowsDialog();
       dialog.render();

   }
}
