package CreationalDesignPatterns.PrototypePattern;

public class Car extends Vehicle {
    private int topSpeed;
    public Car(int topSpeed) {


        this.topSpeed = topSpeed;
    }
    public Car(Car car)
    {
        super(car);
        this.topSpeed = car.topSpeed;
    }


    @Override
    public Car clone() {
        return new Car(this);
    }
}
