package behaviour.chainOfResponsibilities.authentificationHandler;

public final class ChainDemo {

    public static void main(final String[] args) {
        final Employee user = new Employee(30, "user", "passwordUser");
        //chain configuration
        final RoleManager roleManager = new RoleManager();
        final Authentication auth = new Authentication();
        final TaskManager taskManager = new TaskManager();
        auth.setSuccessor(roleManager);
        roleManager.setSuccessor(taskManager);
        System.out.println("----chain--start----");
        auth.chain(user);
    }
}
