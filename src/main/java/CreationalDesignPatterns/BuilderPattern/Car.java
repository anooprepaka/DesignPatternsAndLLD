package CreationalDesignPatterns.BuilderPattern;

class Car {
    private int seats;
    private String engine;
    private boolean tripComputer;
    private boolean GPS;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    @Override
    public String toString() {
        return "Car with " + seats + " seats, engine: " + engine +
                ", trip computer: " + (tripComputer ? "Yes" : "No") +
                ", GPS: " + (GPS ? "Yes" : "No");
    }
}
