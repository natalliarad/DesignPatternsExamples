package behaviour.mediatior.notesEditor.mediator;

import javax.swing.ListModel;

import behaviour.mediatior.notesEditor.components.Component;

/**
 * Common interface of all mediators.
 */
public interface Mediator {

    void addNewNote(Note note);

    void deleteNote();

    void getInfoFromList(Note note);

    void saveChanges();

    void markNote();

    void clear();

    void sendToFilter(ListModel listModel);

    void setElementsList(ListModel list);

    void registerComponent(Component component);

    void hideElements(boolean flag);

    void createGUI();
}
