package StructuralDesignPatterns.DecoratorPattern;

public class Cappuccino implements Coffee{


    @Override
    public String getCoffeeDescription() {
        return "Cappuccino";
    }

    @Override
    public double cost() {
        return 2;
    }


}
