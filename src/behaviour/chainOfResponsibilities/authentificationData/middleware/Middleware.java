package behaviour.chainOfResponsibilities.authentificationData.middleware;

/**
 * Basic class of the chain
 */
public abstract class Middleware {

    private Middleware next;

    /**
     * Helps to build a chain of objects-check.
     */
    public Middleware linkWith(final Middleware next) {
        this.next = next;
        return next;
    }

    /**
     * Subclasses implement specific checks in this method.
     */
    public abstract boolean check(String email, String password);

    /**
     * Runs the check in the next object or ends the check if we are in the last element of the chain.
     */
    protected boolean checkNext(final String email, final String password) {
        if (next == null) {
            return true;
        }
        
        return next.check(email, password);
    }
}
