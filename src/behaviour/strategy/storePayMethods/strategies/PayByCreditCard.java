package behaviour.strategy.storePayMethods.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Specific strategy. Implements payment baskets online store with a credit card customer.
 */
public class PayByCreditCard implements PayStrategy {

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    /**
     * Collect data from the client
     */
    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Enter the card number: ");
            final String number = READER.readLine();
            System.out.print("Enter the card expiration date 'mm/yy': ");
            final String date = READER.readLine();
            System.out.print("Enter the CVV code: ");
            final String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);

            // validation of the card number.

        } catch (final IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * After checking the card, we can make a payment. If the customer continues to purchase,
     * we do not re-request the card.
     */
    @Override
    public boolean pay(final int paymentAmount) {

        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);

            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
