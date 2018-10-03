package behaviour.mediatior.base;

public class ConcreteColleagueOne implements Colleague {

    private boolean flag;

    @Override
    public void changeFlag(final boolean flag) {
        this.flag = flag;
    }
}
