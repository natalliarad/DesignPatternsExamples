package behaviour.command.bankSystemExample;

public class WithdrawingCommand implements ICommand {

    private final Receiver receiver;

    public WithdrawingCommand(final Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action(CommandTypes.WITHDRAWING);
    }
}
