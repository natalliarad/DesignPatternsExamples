package bridge.bankaccountBlinovRomanchick;

/**
 * Abstraction layer
 */
public abstract class Account {

    private int id;
    private double amount;
    private Action action;

    protected Account(final Action action) {
        this.action = action;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(final double amount) {
        this.amount = amount;
    }

    public Action getAction() {
        return action;
    }

    protected void setAction(final Action action) {
        this.action = action;
    }

    public abstract boolean takeSum(double sum);
}
