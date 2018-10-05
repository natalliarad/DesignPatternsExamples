package behaviour.mediatior.notesEditor.components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import behaviour.mediatior.notesEditor.mediator.Mediator;

public class SaveButton extends JButton implements Component {

    private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void setMediator(final Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(final ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }
}
