package StructuralDesignPatterns.DecoratorPattern;

public class Espresso implements Coffee{

    @Override
    public String getCoffeeDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 3;
    }
}
