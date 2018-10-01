package behaviour.command.bankSystemExample;

public class CreditingCommand implements ICommand {

    private final Receiver receiver;

    public CreditingCommand(final Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action(CommandTypes.CREDITING);
    }
}
