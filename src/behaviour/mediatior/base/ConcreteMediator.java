package behaviour.mediatior.base;

public class ConcreteMediator implements Mediator {

    private ConcreteColleagueOne colleagueOne;
    private ConcreteColleagueTwo colleagueTwo;

    ConcreteMediator() {
        this.colleagueOne = new ConcreteColleagueOne();
        this.colleagueTwo = new ConcreteColleagueTwo();
    }

    @Override
    public void setTrue() {
        colleagueOne.changeFlag(true);
        colleagueTwo.changeFlag(true);
        System.out.println("Both set to true");
    }

    @Override
    public void setFalse() {
        colleagueOne.changeFlag(false);
        colleagueTwo.changeFlag(false);
        System.out.println("Both set to false");
    }

    @Override
    public void setDifferent() {
        colleagueOne.changeFlag(true);
        colleagueTwo.changeFlag(false);
        System.out.println("First - true, Second - false");
    }
}
