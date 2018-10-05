package behaviour.observer.editorObjects.listeners;

import java.io.File;

public class EmailNotificationListener implements EventListener {

    private String email;

    public EmailNotificationListener(final String email) {
        this.email = email;
    }

    @Override
    public void update(final String eventType, final File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType
                + " operation with the following file: " + file.getName());
    }
}
