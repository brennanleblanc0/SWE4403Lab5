package ca.brennanleblanc.SWE4403Lab5.E02;

public class Editor {
    public void openProject(String path) {
        Visual[] artefacts = {
                new MainDecorator(new Artefact("Main")),
                new Artefact("Demo"),
                new ErrorDecorator(new Artefact("EmailClient")),
                new Artefact("EmailProvider"),
        };

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
