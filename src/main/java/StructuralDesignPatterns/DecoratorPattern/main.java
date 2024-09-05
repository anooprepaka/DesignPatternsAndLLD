package StructuralDesignPatterns.DecoratorPattern;

public class main {
    public static void main(String[] args) {
        /*
        Decorator is a Structural Design Pattern that lets you attach new behaviours to objects
        by placing these objects inside special wrapper objects that contain behaviours

         */
        Coffee coffee= new Espresso();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getCoffeeDescription());
        System.out.println(coffee.cost());
         coffee= new Cappuccino();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getCoffeeDescription());
        System.out.println(coffee.cost());
    }
}
