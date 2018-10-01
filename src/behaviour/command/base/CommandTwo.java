package behaviour.command.base;

public class CommandTwo implements ICommand {

    private final Receiver receiver;

    CommandTwo(final Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Determine connection between receiver and action");
        receiver.action(TypeCommand.TWO);
    }
}
