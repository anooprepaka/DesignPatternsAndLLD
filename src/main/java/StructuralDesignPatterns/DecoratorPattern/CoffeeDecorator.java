package StructuralDesignPatterns.DecoratorPattern;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getCoffeeDescription()
    {
        return coffee.getCoffeeDescription();

    }
    @Override
    public double cost()
    {
        return coffee.cost();

    }

}
