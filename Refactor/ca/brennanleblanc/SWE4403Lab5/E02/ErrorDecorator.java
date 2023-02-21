package ca.brennanleblanc.SWE4403Lab5.E02;

public class ErrorDecorator extends VisualDecorator {

    public ErrorDecorator(Visual wrappee) {
        super(wrappee);
    }

    @Override
    public String render() {
        return String.format("%s [Error]", wrappee.getName());
    }
}
