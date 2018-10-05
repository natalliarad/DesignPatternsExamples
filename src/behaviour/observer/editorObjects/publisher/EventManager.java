package behaviour.observer.editorObjects.publisher;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import behaviour.observer.editorObjects.listeners.EventListener;

public class EventManager {

    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(final String... operations) {
        for (final String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(final String eventType, final EventListener listener) {
        final List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(final String eventType, final EventListener listener) {
        final List<EventListener> users = listeners.get(eventType);
        final int index = users.indexOf(listener);
        users.remove(index);
    }

    public void notify(final String eventType, final File file) {
        final List<EventListener> users = listeners.get(eventType);

        for (final EventListener listener : users) {
            listener.update(eventType, file);
        }
    }
}
