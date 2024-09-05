package CreationalDesignPatterns.BuilderPattern;



public interface CarBuilder {
    void reset();
    void setSeats(int number);
    void setEngine(String engine);
    void hasTripComputer(boolean hasTripComputer);
    void hasGPS(boolean hasGPS);
    Car getCar();
}
