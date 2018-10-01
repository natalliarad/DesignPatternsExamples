package behaviour.command.base;

class Invoker {

    private final ICommand iCommand;

    Invoker(final ICommand iCommand) {
        this.iCommand = iCommand;
    }

    void invokeCommand() {
        System.out.println("Refer to command for execution.");
        iCommand.execute();
    }
}
