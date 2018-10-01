package behaviour.command.base;

public final class RunnerCommand {

    public static void main(final String[] args) {
        final Receiver receiver = new Receiver();
        final Client client = new Client(receiver);
        final ICommand commandOne = client.initCommand(TypeCommand.ONE);
        final Invoker invokerOne = new Invoker(commandOne);
        invokerOne.invokeCommand();
        final ICommand commandTwo = client.initCommand(TypeCommand.TWO);
        final Invoker invokerTwo = new Invoker(commandTwo);
        invokerTwo.invokeCommand();
    }
}
