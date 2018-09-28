package bridge.bankaccountBlinovRomanchick;

/**
 * Refined abstraction
 */
public class DepositAccount extends Account {

    public DepositAccount(final Action action) {
        super(action);
    }

    @Override
    public boolean takeSum(final double sum) {
        System.out.println("Performing by deposit account");
        double interest = getAction().chargeInterest();
        double maxSum = getAction().defineMaxSum();
        //check amount
        System.out.println("accountID: " + getId() + " : interest is " + interest);
        System.out.println(" : recording of changes in the state accounts");
        System.out.println(" : withdrawal : " + sum);
        return true;
    }
}
