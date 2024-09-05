package CreationalDesignPatterns.PrototypePattern;
public abstract class Vehicle {
    private String brand;
    private String model;
    private String color;
    // No-argument constructor
    protected Vehicle() {
    }

    protected Vehicle(Vehicle vehocle)
    {
        this.brand = vehocle.brand;
        this.model = vehocle.model;
        this.color = vehocle.color;

    }
    public abstract Vehicle clone();
}