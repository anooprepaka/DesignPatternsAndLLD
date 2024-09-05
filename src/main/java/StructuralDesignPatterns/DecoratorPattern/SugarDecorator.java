package StructuralDesignPatterns.DecoratorPattern;

public class SugarDecorator extends CoffeeDecorator{


    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffeeDescription() {
        return coffee.getCoffeeDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.7;
    }
}
