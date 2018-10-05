package behaviour.chainOfResponsibilities.authentificationData.server;

import java.util.HashMap;
import java.util.Map;

import behaviour.chainOfResponsibilities.authentificationData.middleware.Middleware;

public class Server {

    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    /**
     * The client submits the finished chain to the server. This increases flexibility
     * and simplifies server class testing.
     */
    public void setMiddleware(final Middleware middleware) {
        this.middleware = middleware;
    }

    /**
     * The server receives the email and password from the client and runs an authorization check on the chain.
     */
    public boolean logIn(final String email, final String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successful!");

            // useful code for authentication
            return true;
        }

        return false;
    }

    public void register(final String email, final String password) {
        users.put(email, password);
    }

    public boolean hasEmail(final String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(final String email, final String password) {
        return users.get(email).equals(password);
    }
}
