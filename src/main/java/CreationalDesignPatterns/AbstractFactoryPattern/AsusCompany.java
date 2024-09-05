package CreationalDesignPatterns.AbstractFactoryPattern;

public class AsusCompany  extends Company{
    @Override
    public GPU createGPU() {
        return new AsusGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
