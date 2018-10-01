package structural.bridge.bankAccountBlinovRomanchick;

public class BridgeClient {

    public static void main(final String[] args) {
        Action action = new RegularAction();
        final DepositAccount depositAccount = new DepositAccount(action);
        depositAccount.setId(555);
        depositAccount.setAmount(1500);
        depositAccount.takeSum(200);
        action = new UrgentAction();
        depositAccount.setAction(action); //replacement action
        depositAccount.takeSum(100);

        new CreditAccount(action).takeSum(50);
    }
}
