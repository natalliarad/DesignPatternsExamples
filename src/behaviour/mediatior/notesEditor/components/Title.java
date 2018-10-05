package behaviour.mediatior.notesEditor.components;

import java.awt.event.KeyEvent;

import javax.swing.JTextField;

import behaviour.mediatior.notesEditor.mediator.Mediator;

public class Title extends JTextField implements Component {

    private Mediator mediator;

    @Override
    public void setMediator(final Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(final KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "Title";
    }
}
