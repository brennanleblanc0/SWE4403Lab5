package ca.brennanleblanc.SWE4403Lab5.E02;

public class Artefact implements Visual {
    private String name;

    public Artefact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String render() {
        return getName();
    }
}
