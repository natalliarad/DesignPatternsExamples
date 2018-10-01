package structural.bridge.bankAccountBlinovRomanchick;

/**
 * Abstraction layer
 */
public abstract class Account {

    private int id;
    private double amount;
    private Action action;

    Account(final Action action) {
        this.action = action;
    }

    int getId() {
        return id;
    }

    void setId(final int id) {
        this.id = id;
    }

    double getAmount() {
        return amount;
    }

    void setAmount(final double amount) {
        this.amount = amount;
    }

    Action getAction() {
        return action;
    }

    void setAction(final Action action) {
        this.action = action;
    }

    public abstract boolean takeSum(double sum);
}
