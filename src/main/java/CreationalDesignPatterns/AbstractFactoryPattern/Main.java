package CreationalDesignPatterns.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        /*
        Abstract factory is a creational design pattern that lets you reduce a family of related objects without specifying their concrete classes.
         */
        Company company = new AsusCompany();
        company.createGPU();
        company.createMonitor();
        company = new MsiCompany();
        company.createGPU();
        company.createMonitor();

    }
}
