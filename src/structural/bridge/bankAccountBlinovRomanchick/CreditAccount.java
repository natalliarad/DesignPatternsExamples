package structural.bridge.bankAccountBlinovRomanchick;

/**
 * Refined abstraction
 */
public class CreditAccount extends Account {

    private double limitCredit;

    CreditAccount(final Action action) {
        super(action);
    }

    public double getLimitCredit() {
        return limitCredit;
    }

    public void setLimitCredit(final double limitCredit) {
        this.limitCredit = limitCredit;
    }

    @Override
    public boolean takeSum(final double sum) {
        System.out.println("Performing by credit account");
        final double maxSum = getAction().defineMaxSum();
        final double payment = getAction().increasePayment();
        System.out.println("accountID: " + getId() + " : increase monthly payments:  " + payment);
        System.out.println(" : recording of changes in the state accounts");
        System.out.println(" : withdrawal : " + maxSum);

        return false;
    }
}
