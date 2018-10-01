package behaviour.command.bankSystemExample;

public class BlockingCommand implements ICommand {

    private final Receiver receiver;

    public BlockingCommand(final Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action(CommandTypes.BLOCKING);
    }
}
