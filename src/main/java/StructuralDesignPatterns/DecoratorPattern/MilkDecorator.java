package StructuralDesignPatterns.DecoratorPattern;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getCoffeeDescription() {
        return coffee.getCoffeeDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }
}
