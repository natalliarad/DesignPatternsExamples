package behaviour.mediatior.notesEditor.components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import behaviour.mediatior.notesEditor.mediator.Mediator;
import behaviour.mediatior.notesEditor.mediator.Note;

/**
 * Specific components are not related to each other. They have the only one channel of
 * communication - through sending notifications to the mediator.
 */
public class AddButton extends JButton implements Component {

    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(final Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(final ActionEvent event) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
