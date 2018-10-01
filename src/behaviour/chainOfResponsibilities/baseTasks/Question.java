package behaviour.chainOfResponsibilities.baseTasks;

public class Question implements BaseInterface {

    private String message;
    private SubTask parent;

    Question(final String message, final SubTask parent) {
        this.message = message;
        this.parent = parent;
    }

    @Override
    public String handleRequest() {
        System.out.println("Message in Question: " + message);

        if (parent == null) {
            return message;
        } else {
            return parent.handleRequest();
        }
    }
}
