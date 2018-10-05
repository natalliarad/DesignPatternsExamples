package behaviour.mediatior.notesEditor.mediator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import behaviour.mediatior.notesEditor.components.AddButton;
import behaviour.mediatior.notesEditor.components.Component;
import behaviour.mediatior.notesEditor.components.DeleteButton;
import behaviour.mediatior.notesEditor.components.Filter;
import behaviour.mediatior.notesEditor.components.List;
import behaviour.mediatior.notesEditor.components.SaveButton;
import behaviour.mediatior.notesEditor.components.TextBox;
import behaviour.mediatior.notesEditor.components.Title;

/**
 * Specific mediator. All connections between specific components have moved to the intermediary
 * code. It receives notifications from its components and knows how to react to them.
 */
public class Editor implements Mediator {

    private Title title;
    private TextBox textBox;
    private AddButton add;
    private DeleteButton del;
    private SaveButton save;
    private List list;
    private Filter filter;

    private JLabel titleLabel = new JLabel("Title:");
    private JLabel textLabel = new JLabel("Text:");
    private JLabel label = new JLabel("Add or select existing note to proceed...");

    /**
     * Component registration
     */
    @Override
    public void registerComponent(final Component component) {
        component.setMediator(this);

        switch (component.getName()) {
            case "AddButton":
                add = (AddButton) component;

                break;
            case "DelButton":
                del = (DeleteButton) component;

                break;
            case "Filter":
                filter = (Filter) component;

                break;
            case "List":
                list = (List) component;
                this.list.addListSelectionListener(listSelectionEvent -> {
                    final Note note = (Note) list.getSelectedValue();

                    if (note != null) {
                        getInfoFromList(note);
                    } else {
                        clear();
                    }
                });

                break;
            case "SaveButton":
                save = (SaveButton) component;

                break;
            case "TextBox":
                textBox = (TextBox) component;

                break;
            case "Title":
                title = (Title) component;
                break;
        }
    }

    /**
     * Different methods for communication with components
     */
    @Override
    public void addNewNote(final Note note) {
        title.setText("");
        textBox.setText("");
        list.addElement(note);
    }

    @Override
    public void deleteNote() {
        list.deleteElement();
    }

    @Override
    public void getInfoFromList(final Note note) {
        title.setText(note.getName().replace('*', ' '));
        textBox.setText(note.getText());
    }

    @Override
    public void saveChanges() {
        try {
            final Note note = (Note) list.getSelectedValue();
            note.setName(title.getText());
            note.setText(textBox.getText());
            list.repaint();
        } catch (final NullPointerException ignored) {
        }
    }

    @Override
    public void markNote() {
        try {
            final Note note = list.getCurrentElement();
            final String name = note.getName();

            if (!name.endsWith("*")) {
                note.setName(note.getName() + "*");
            }

            list.repaint();
        } catch (final NullPointerException ignored) {
        }
    }

    @Override
    public void clear() {
        title.setText("");
        textBox.setText("");
    }

    @Override
    public void sendToFilter(final ListModel listModel) {
        filter.setList(listModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void setElementsList(final ListModel list) {
        this.list.setModel(list);
        this.list.repaint();
    }

    @Override
    public void hideElements(final boolean flag) {
        titleLabel.setVisible(!flag);
        textLabel.setVisible(!flag);
        title.setVisible(!flag);
        textBox.setVisible(!flag);
        save.setVisible(!flag);
        label.setVisible(flag);
    }

    @Override
    public void createGUI() {
        final JFrame notes = new JFrame("Notes");
        notes.setSize(960, 600);
        notes.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        final JPanel left = new JPanel();
        left.setBorder(new LineBorder(Color.BLACK));
        left.setSize(320, 600);
        left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));

        final JPanel filterPanel = new JPanel();
        filterPanel.add(new JLabel("Filter:"));
        filter.setColumns(20);
        filterPanel.add(filter);
        filterPanel.setPreferredSize(new Dimension(280, 40));

        final JPanel listPanel = new JPanel();
        list.setFixedCellWidth(260);
        listPanel.setSize(320, 470);

        final JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setPreferredSize(new Dimension(275, 410));
        listPanel.add(scrollPane);

        final JPanel buttonPanel = new JPanel();
        add.setPreferredSize(new Dimension(85, 25));
        buttonPanel.add(add);
        del.setPreferredSize(new Dimension(85, 25));
        buttonPanel.add(del);
        buttonPanel.setLayout(new FlowLayout());
        left.add(filterPanel);
        left.add(listPanel);
        left.add(buttonPanel);

        final JPanel right = new JPanel();
        right.setLayout(null);
        right.setSize(640, 600);
        right.setLocation(320, 0);
        right.setBorder(new LineBorder(Color.BLACK));

        titleLabel.setBounds(20, 4, 50, 20);
        title.setBounds(60, 5, 555, 20);
        textLabel.setBounds(20, 4, 50, 130);
        textBox.setBorder(new LineBorder(Color.DARK_GRAY));
        textBox.setBounds(20, 80, 595, 410);
        save.setBounds(270, 535, 80, 25);
        label.setFont(new Font("Verdana", Font.PLAIN, 22));
        label.setBounds(100, 240, 500, 100);

        right.add(label);
        right.add(titleLabel);
        right.add(title);
        right.add(textLabel);
        right.add(textBox);
        right.add(save);

        notes.setLayout(null);
        notes.getContentPane().add(left);
        notes.getContentPane().add(right);
        notes.setResizable(false);
        notes.setLocationRelativeTo(null);
        notes.setVisible(true);
    }
}
