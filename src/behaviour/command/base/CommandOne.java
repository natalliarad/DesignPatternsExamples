package behaviour.command.base;

public class CommandOne implements ICommand {

    private Receiver receiver;

    CommandOne(final Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Determine connection between receiver and action");
        receiver.action(TypeCommand.ONE);
    }
}
