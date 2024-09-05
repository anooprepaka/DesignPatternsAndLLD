package CreationalDesignPatterns.FactoryPattern;

public class WindowsDialog implements Dialog{

    @Override
    public void render() {

    }

    @Override
    public Button createButton() {
        return new WindowsButton();

    }
}
