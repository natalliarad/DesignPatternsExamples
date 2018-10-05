package behaviour.mediatior.notesEditor.components;

import javax.swing.*;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import behaviour.mediatior.notesEditor.mediator.Mediator;
import behaviour.mediatior.notesEditor.mediator.Note;

public class Filter extends JTextField implements Component {

    private Mediator mediator;
    private ListModel listModel;

    public Filter() {
    }

    @Override
    public void setMediator(final Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(final KeyEvent keyEvent) {
        final String start = getText();
        searchElements(start);
    }

    public void setList(final ListModel listModel) {
        this.listModel = listModel;
    }

    private void searchElements(final String s) {
        if (listModel == null) {
            return;
        }

        if (s.equals("")) {
            mediator.setElementsList(listModel);
            return;
        }

        final ArrayList<Note> notes = new ArrayList<>();

        for (int i = 0; i < listModel.getSize(); i++) {
            notes.add((Note) listModel.getElementAt(i));
        }

        final DefaultListModel<Note> listModel = new DefaultListModel<>();

        for (final Note note : notes) {
            if (note.getName().contains(s)) {
                listModel.addElement(note);
            }
        }
        mediator.setElementsList(listModel);
    }

    @Override
    public String getName() {
        return "Filter";
    }
}
