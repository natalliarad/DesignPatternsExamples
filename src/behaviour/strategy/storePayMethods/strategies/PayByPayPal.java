package behaviour.strategy.storePayMethods.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Specific strategy. Implements payment for an online store basket through the PayPal payment system.
 */
public class PayByPayPal implements PayStrategy {

    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
    }

    /**
     * Collect data from the client
     */
    @Override
    public void collectPaymentDetails() {
        try {

            while (!signedIn) {
                System.out.print("Enter the user's email: ");
                email = READER.readLine();
                System.out.print("Enter the password: ");
                password = READER.readLine();

                if (verify()) {
                    System.out.println("Data verification has been successfull.");
                } else {
                    System.out.println("Wrong email or password!");
                }
            }
        } catch (final IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    /**
     * If the client is already logged in, you will not have to enter data for the next payment.
     */
    @Override
    public boolean pay(final int paymentAmount) {

        if (signedIn) {
            System.out.println("Paying " + paymentAmount + " using PayPal.");

            return true;
        } else {
            return false;
        }
    }

    private void setSignedIn(final boolean signedIn) {
        this.signedIn = signedIn;
    }
}
