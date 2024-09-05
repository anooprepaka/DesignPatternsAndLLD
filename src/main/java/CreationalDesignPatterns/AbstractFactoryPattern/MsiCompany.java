package CreationalDesignPatterns.AbstractFactoryPattern;

public class MsiCompany  extends Company{
    @Override
    public GPU createGPU() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
