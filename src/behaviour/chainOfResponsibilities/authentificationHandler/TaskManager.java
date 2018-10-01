package behaviour.chainOfResponsibilities.authentificationHandler;

class TaskManager extends AbstractHandler {

    public TaskManager() {
    }

    @Override
    void handleRequest(final Employee user) {
        assignTask();
    }

    void assignTask() {
        System.out.println("assign task");
    }
}
