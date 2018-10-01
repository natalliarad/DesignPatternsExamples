package behaviour.command.bankSystemExample;

public class Receiver {

    private final Account account;
    private double amount;
    private static final double INTEREST_RATE = 9.5; //internal value

    public Receiver(final Account account) {
        this.account = account;
    }

    void action(final CommandTypes commandType) {
        switch (commandType) {
            case CREDITING: //realisation of the CREDITING operation

                if (account.isBlocked()) {
                    System.out.println("Sorry, the account #" + account.getId()
                            + " is blocked! You can't credit charges to it");
                } else {
                    double balance = account.getBalance();
                    balance *= INTEREST_RATE * 0.01;
                    account.setBalance(balance);
                    System.out.println("Crediting is performed with " + INTEREST_RATE
                            + " % interest rate to the account #" + account.getId());
                }

                break;
            case WITHDRAWING: //realisation of the WITHDRAWING operation

                if (account.isBlocked()) {
                    System.out.println("Sorry, the account #" + account.getId()
                            + " is blocked! You can't withdraw money");
                } else {
                    double balance = account.getBalance();
                    balance -= amount;
                    account.setBalance(balance);
                    System.out.println(amount + " is withdraw from the account #" + account.getId());
                }

                break;
            case BLOCKING:
                if (account.isBlocked()) {
                    account.setBlocked(false);
                    System.out.println("The account #" + account.getId() + " is unblocked");
                } else {
                    account.setBlocked(true);
                    System.out.println("The account #" + account.getId() + " is blocked");
                }

                break;

        }
    }
}
