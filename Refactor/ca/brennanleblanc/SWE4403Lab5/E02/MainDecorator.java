package ca.brennanleblanc.SWE4403Lab5.E02;

public class MainDecorator extends VisualDecorator {
    public MainDecorator(Visual wrappee) {
        super(wrappee);
    }

    @Override
    public String render() {
        return String.format("%s [Main]", wrappee.getName());
    }
}
