package behaviour.command.bankSystemExample;

public class Invoker {

    private ICommand command;

    public Invoker(final ICommand command) {
        this.command = command;
    }

    void invokeCommand() {
        System.out.println("Refer to command for execution");
        command.execute();
    }
}
