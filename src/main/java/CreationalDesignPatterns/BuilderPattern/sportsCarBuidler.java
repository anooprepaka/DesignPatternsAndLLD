package CreationalDesignPatterns.BuilderPattern;




public class sportsCarBuidler implements CarBuilder {
    private Car car;
    public sportsCarBuidler() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car=new Car();

    }

    @Override
    public void setSeats(int number) {
        car.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void hasTripComputer(boolean hasTripComputer) {
        car.setTripComputer(hasTripComputer);
    }


    @Override
    public void hasGPS(boolean hasGPS) {
       car.setGPS(hasGPS);
    }

    @Override
    public Car getCar() {
        return this.car;
    }


}
