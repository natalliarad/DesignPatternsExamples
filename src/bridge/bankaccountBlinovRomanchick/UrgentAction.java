package bridge.bankaccountBlinovRomanchick;

/**
 * Refines class {@link Action}.
 */
public class UrgentAction extends Action {

    static final int MONTHLY_PAYMENT = 10; //read from base
    private static final int MAX_SUM = 50; //read from base

    @Override
    public double chargeInterest() {
        //charge LOW interest on account
        return 0; //stub
    }

    @Override
    public double defineMaxSum() {
        //check credit
        //max sum is unbounded
        return MAX_SUM;
    }

    @Override
    public double increasePayment() {
        //MAX increase in monthly payments
        return MONTHLY_PAYMENT;
    }
}
