package behaviour.mediatior.notesEditor.mediator;

public class Note {

    private String name;
    private String text;

    public Note() {
        name = "New note";
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return name;
    }
}
