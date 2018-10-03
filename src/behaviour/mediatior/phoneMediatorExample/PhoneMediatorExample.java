package behaviour.mediatior.phoneMediatorExample;

public final class PhoneMediatorExample {

    public static void main(final String[] args) {
        final ConcretePhoneOperatorMediator operatorMediator = new ConcretePhoneOperatorMediator();
        PhoneSubscriber subscriber1 = new PhoneSubscriber(operatorMediator);
        PhoneSubscriber subscriber2 = new PhoneSubscriber(operatorMediator);
        PhoneSubscriber subscriber3 = new PhoneSubscriber(operatorMediator);
        PhoneSubscriber subscriber4 = new PhoneSubscriber(operatorMediator);

        operatorMediator.addPhoneSubscriber(subscriber1);
        operatorMediator.addPhoneSubscriber(subscriber2);
        operatorMediator.addPhoneSubscriber(subscriber3);

        //two subscribers try to call to a single number
        subscriber1.call(subscriber2);
        subscriber3.call(subscriber2);
        //end of the conversation
        subscriber2.finishCall();
        subscriber3.call(subscriber2);
        //unregistered client try to call
        subscriber4.call(subscriber1);
    }
}
