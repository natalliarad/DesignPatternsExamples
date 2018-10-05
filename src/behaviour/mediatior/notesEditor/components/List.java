package behaviour.mediatior.notesEditor.components;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import behaviour.mediatior.notesEditor.mediator.Mediator;
import behaviour.mediatior.notesEditor.mediator.Note;

@SuppressWarnings("unchecked")
public class List extends JList implements Component {

    private Mediator mediator;
    private final DefaultListModel LIST_MODEL;

    public List(final DefaultListModel listModel) {
        super(listModel);
        this.LIST_MODEL = listModel;
        setModel(listModel);
        this.setLayoutOrientation(JList.VERTICAL);
        final Thread thread = new Thread(new Hide(this));
        thread.start();
    }

    @Override
    public void setMediator(final Mediator mediator) {
        this.mediator = mediator;
    }

    public void addElement(final Note note) {
        LIST_MODEL.addElement(note);
        final int index = LIST_MODEL.size() - 1;
        setSelectedIndex(index);
        ensureIndexIsVisible(index);
        mediator.sendToFilter(LIST_MODEL);
    }

    public void deleteElement() {
        final int index = this.getSelectedIndex();

        try {
            LIST_MODEL.remove(index);
            mediator.sendToFilter(LIST_MODEL);
        } catch (final ArrayIndexOutOfBoundsException ignored) {
        }
    }

    public Note getCurrentElement() {
        return (Note) getSelectedValue();
    }

    @Override
    public String getName() {
        return "List";
    }

    private class Hide implements Runnable {

        private final List list;

        Hide(final List list) {
            this.list = list;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(300);
                } catch (final InterruptedException ex) {
                    ex.printStackTrace();
                }
                if (list.isSelectionEmpty()) {
                    mediator.hideElements(true);
                } else {
                    mediator.hideElements(false);
                }
            }
        }
    }
}
