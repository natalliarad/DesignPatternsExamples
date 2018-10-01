package behaviour.chainOfResponsibilities.baseTasks;

public class SubTask implements BaseInterface {

    private String message = "";
    private Task root = null;

    SubTask(final String message, final Task root) {
        this.message = message;
        this.root = root;
    }

    @Override
    public String handleRequest() {
        System.out.println("Message in SubTask: " + message);

        if (root == null) {
            return message;
        } else {
            return root.handleRequest();
        }
    }
}
