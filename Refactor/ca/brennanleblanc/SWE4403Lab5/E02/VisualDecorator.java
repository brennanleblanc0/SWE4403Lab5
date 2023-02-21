package ca.brennanleblanc.SWE4403Lab5.E02;

public abstract class VisualDecorator implements Visual {
    protected Visual wrappee;

    public VisualDecorator(Visual wrappee) {
        this.wrappee = wrappee;
    }

    public String getName() {
        return wrappee.getName();
    }

    public abstract String render();
}
