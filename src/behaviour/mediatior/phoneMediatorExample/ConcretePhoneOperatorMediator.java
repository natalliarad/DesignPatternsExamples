package behaviour.mediatior.phoneMediatorExample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ConcretePhoneOperatorMediator implements PhoneOperatorMediator {

    private final Set<PhoneSubscriber> subscribers;
    private final Map<PhoneSubscriber, PhoneSubscriber> connections;
    private long nextPhoneNumber;

    public ConcretePhoneOperatorMediator() {
        subscribers = new HashSet<>();
        connections = new HashMap<>();
        nextPhoneNumber = 200_00_01;
    }

    @Override
    public long generatePhoneNumber() {
        return nextPhoneNumber++;
    }

    @Override
    public void addPhoneSubscriber(final PhoneSubscriber phoneSubscriber) {
        subscribers.add(phoneSubscriber);
    }

    @Override
    public boolean isSupported(final PhoneSubscriber phoneSubscriber) {
        boolean isSupported = subscribers.contains(phoneSubscriber);
        if (!isSupported) {
            System.out.println("Not supported " + phoneSubscriber);
        }
        return isSupported;
    }

    @Override
    public boolean connect(final PhoneSubscriber subscriber1, final PhoneSubscriber subscriber2) {
        if (!isSupported(subscriber1) || !isSupported(subscriber2)) {
            return false;
        }

        if (connections.containsKey(subscriber1) || connections.containsKey(subscriber2)) {
            System.out.println("Line is busy...");

            return false;
        }

        connections.put(subscriber1, subscriber2);
        connections.put(subscriber2, subscriber1);
        System.out.println(subscriber1 + " connected to " + subscriber2);

        return true;
    }

    @Override
    public boolean disconnect(final PhoneSubscriber subscriber1) {

        if (connections.containsKey(subscriber1)) {
            final PhoneSubscriber subscriber2 = connections.get(subscriber1);
            connections.remove(subscriber1);
            connections.remove(subscriber2);
            System.out.println(subscriber1 + " disconnected from " + subscriber2);

            return true;
        } else {
            System.out.println(subscriber1 + " not connected to any subscriber.");
            return false;
        }
    }
}
