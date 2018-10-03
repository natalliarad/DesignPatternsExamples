package behaviour.observer.base;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {

    ArrayList<Observer> observers; //can be single object
    private Object state;

    public Object getState() {
        return state;
    }

    public void setState(final Object state) {
        this.state = state;
    }

    @Override
    public void attach(final Observer observer) {
        //realisation
    }

    @Override
    public void detach(final Observer observer) {
        //realisation
    }

    @Override
    public void notifyObservers() {
        //realisation
    }
}
