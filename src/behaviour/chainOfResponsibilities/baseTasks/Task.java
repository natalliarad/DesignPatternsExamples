package behaviour.chainOfResponsibilities.baseTasks;

public class Task implements BaseInterface {

    private String message;

    Task(String message) {
        this.message = message;
    }

    @Override
    public String handleRequest() {
        System.out.println("Message in Task: " + message);

        return message;
    }
}
