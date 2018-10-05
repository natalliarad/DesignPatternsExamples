package behaviour.observer.editorObjects.listeners;

import java.io.File;

public class LogOpenListener implements EventListener {

    private File log;

    public LogOpenListener(final String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(final String eventType, final File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType
                + " operation with the following file: " + file.getName());
    }
}
