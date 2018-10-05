package behaviour.mediatior.notesEditor.components;

import java.awt.event.KeyEvent;

import javax.swing.JTextArea;

import behaviour.mediatior.notesEditor.mediator.Mediator;

public class TextBox extends JTextArea implements Component {

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
        return "TextBox";
    }
}
