package behaviour.command.base;

class Receiver {

    void action(final TypeCommand command) {

        switch (command) {
            case ONE:
                System.out.println("Know the information to complete request One");

                break;
            case TWO:
                System.out.println("Know the information to complete request Two");

                break;
        }
    }
}
