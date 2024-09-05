package CreationalDesignPatterns.FactoryPattern;

public class HTMLDialog implements Dialog {
    private Button button;
    @Override
    public void render() {

    }

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
