package behaviour.command.bankSystemExample;

public final class BankExample {

    public static void main(final String[] args) {
        final Account account = new Account(210012, 1100, false);
        final Receiver receiver = new Receiver(account);
        final Client client = new Client(receiver);

        ICommand commandCrediting = client.initCommand(CommandTypes.CREDITING);
        Invoker invokerCrediting = new Invoker(commandCrediting);
        invokerCrediting.invokeCommand();

        ICommand commandWithdrawing = client.initCommand(CommandTypes.WITHDRAWING);
        Invoker invokerWithdrawing = new Invoker(commandWithdrawing);
        invokerWithdrawing.invokeCommand();

        ICommand commandBlocking = client.initCommand(CommandTypes.BLOCKING);
        Invoker invokerBlocking = new Invoker(commandBlocking);
        invokerBlocking.invokeCommand();
    }
}
