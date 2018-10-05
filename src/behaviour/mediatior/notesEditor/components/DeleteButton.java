package behaviour.mediatior.notesEditor.components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import behaviour.mediatior.notesEditor.mediator.Mediator;

public class DeleteButton extends JButton implements Component {

    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(final Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(final ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }
}
