package behaviour.command.base;

class Client {

    private final Receiver receiver;

    Client(final Receiver receiver) {
        this.receiver = receiver;
    }

    ICommand initCommand(final TypeCommand command) {
        ICommand iCommand = null;

        switch (command) {
            case ONE:
                System.out.println("Creating command One and set up its receiver");
                iCommand = new CommandOne(receiver);

                break;
            case TWO:
                System.out.println("Creating command Two and set up its receiver");
                iCommand = new CommandTwo(receiver);

                break;
        }

        return iCommand;
    }
}
