package bridge.bankAccountBlinovRomanchick;

/**
 * Abstract class which implements Implementor {@link IAction}. May contain general methods for
 * all actions (for example, user verification, account blocking, etc.)
 */
public abstract class Action implements IAction {

    //fields and method which are common for all realisations.
    public void operation() {
        //more code
    }
}
