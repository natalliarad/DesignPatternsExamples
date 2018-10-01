package behaviour.command.bankSystemExample;

public class Client {

    private final Receiver receiver;

    public Client(final Receiver receiver) {
        this.receiver = receiver;
    }

    ICommand initCommand(final CommandTypes type) {
        ICommand command = null;

        switch (type) {
            case CREDITING:
                System.out.println("Creating command CREDITING & set up its receiver");
                command = new CreditingCommand(receiver);

                break;
            case WITHDRAWING:
                System.out.println("Creating command WITHDRAWING & set up its receiver");
                command = new WithdrawingCommand(receiver);

                break;
            case BLOCKING:
                System.out.println("Creating command BLOCKING & set up its receiver");
                command = new BlockingCommand(receiver);

                break;
        }

        return command;
    }
}
