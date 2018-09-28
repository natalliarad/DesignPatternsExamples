package bridge.bankaccountBlinovRomanchick;

/**
 * Refined abstraction
 */
public class CreditAccount extends Account {

    private double limitCredit;

    public CreditAccount(Action action) {
        super(action);
    }

    public double getLimitCredit() {
        return limitCredit;
    }

    public void setLimitCredit(double limitCredit) {
        this.limitCredit = limitCredit;
    }

    @Override
    public boolean takeSum(double sum) {
        System.out.println("Performing by credit account");
        double maxSum = getAction().defineMaxSum();
        double payment = getAction().increasePayment();
        System.out.println("accountID: " + getId() + " : increase monthly payments:  " + payment);
        System.out.println(" : recording of changes in the state accounts");
        System.out.println(" : withdrawal : " + maxSum);
        return false;
    }
}
