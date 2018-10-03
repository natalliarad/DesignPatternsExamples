package behaviour.mediatior.phoneMediatorExample;

public interface PhoneOperatorMediator {

    long generatePhoneNumber();

    void addPhoneSubscriber(PhoneSubscriber phoneSubscriber);

    boolean isSupported(PhoneSubscriber phoneSubscriber);

    boolean connect(PhoneSubscriber subscriber1, PhoneSubscriber subscriber2);

    boolean disconnect(PhoneSubscriber subscriber);
}
