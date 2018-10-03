package behaviour.mediatior.base;

public class ConcreteColleagueTwo implements Colleague {

    private boolean flag;

    @Override
    public void changeFlag(final boolean flag) {
        this.flag = flag;
    }
}
