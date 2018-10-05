package behaviour.observer.editorObjects;

import behaviour.observer.editorObjects.editor.Editor;
import behaviour.observer.editorObjects.listeners.EmailNotificationListener;
import behaviour.observer.editorObjects.listeners.LogOpenListener;

public final class ObserverDemo {

    public static void main(final String[] args) {
        final Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
