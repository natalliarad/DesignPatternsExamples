package behaviour.strategy.storePayMethods.strategies;

/**
 * The common interface of all strategies.
 */
public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
