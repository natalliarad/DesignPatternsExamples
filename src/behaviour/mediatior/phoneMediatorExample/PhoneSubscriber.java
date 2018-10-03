package behaviour.mediatior.phoneMediatorExample;

class PhoneSubscriber {

    private PhoneOperatorMediator phoneOperator;
    private long number;

    public PhoneSubscriber(final PhoneOperatorMediator phoneOperator) {
        this.phoneOperator = phoneOperator;
        this.number = phoneOperator.generatePhoneNumber();
    }

    boolean call(final PhoneSubscriber otherPhoneSubscriber) {
        return phoneOperator.connect(this, otherPhoneSubscriber);
    }

    boolean finishCall() {
        return phoneOperator.disconnect(this);
    }

    public long getPhoneNumber() {
        return number;
    }

    public void setPhoneNumber(final long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "subscriber #" + number;
    }

    @Override
    public boolean equals(final Object obj) {//simplest
        if (obj instanceof PhoneSubscriber) {
            return this.getPhoneNumber() == ((PhoneSubscriber) obj).getPhoneNumber();
        } else {
            return false;
        }
    }
}
