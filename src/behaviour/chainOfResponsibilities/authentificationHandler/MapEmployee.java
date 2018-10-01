package behaviour.chainOfResponsibilities.authentificationHandler;

import java.util.HashMap;

class MapEmployee {

    private final HashMap<Integer, Employee> users = new HashMap<>();

    MapEmployee() {
        users.put(1, new Employee(10, "admin", "passwordAdmin"));
        users.put(2, new Employee(20, "employee", "passwordEmployee"));
        users.put(3, new Employee(30, "user", "passwordUser"));
    }

    HashMap<Integer, Employee> getUsers() {
        return users;
    }

    boolean containsUser(final Employee employee) {
        return users.containsValue(employee);
    }
}
