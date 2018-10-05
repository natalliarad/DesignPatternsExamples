package behaviour.mediatior.notesEditor;

import javax.swing.DefaultListModel;

import behaviour.mediatior.notesEditor.components.AddButton;
import behaviour.mediatior.notesEditor.components.DeleteButton;
import behaviour.mediatior.notesEditor.components.Filter;
import behaviour.mediatior.notesEditor.components.List;
import behaviour.mediatior.notesEditor.components.SaveButton;
import behaviour.mediatior.notesEditor.components.TextBox;
import behaviour.mediatior.notesEditor.components.Title;
import behaviour.mediatior.notesEditor.mediator.Editor;
import behaviour.mediatior.notesEditor.mediator.Mediator;

public final class DemoNotes {

    public static void main(final String[] args) {
        final Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
