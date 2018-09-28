package bridge.bankAccountBlinovRomanchick;

/**
 * Refines class {@link Action}.
 */
public class RegularAction extends Action {

    private static final int MAX_SUM = 100; //read from base
    private static final int NORMAL_INTEREST = 3; //read from base

    @Override
    public double chargeInterest() {
        //charge NORMAL interest on account
        return NORMAL_INTEREST;
    }

    @Override
    public double defineMaxSum() {
        //max sum is unbounded
        return MAX_SUM;
    }

    @Override
    public double increasePayment() {
        return 0; //stub
    }
}
