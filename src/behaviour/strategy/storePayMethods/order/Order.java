package behaviour.strategy.storePayMethods.order;

import behaviour.strategy.storePayMethods.strategies.PayStrategy;

/**
 * Order Class. It knows nothing about the way (strategy) the client will pay, but simply calls
 * the payment method. The strategy does the rest.
 */
public class Order {

    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(final PayStrategy strategy) {
        strategy.collectPaymentDetails();
        // Here we could pick up and save payment information from the strategy.
    }

    public void setTotalCost(final int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
