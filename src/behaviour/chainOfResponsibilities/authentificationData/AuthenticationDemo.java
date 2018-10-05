package behaviour.chainOfResponsibilities.authentificationData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import behaviour.chainOfResponsibilities.authentificationData.middleware.Middleware;
import behaviour.chainOfResponsibilities.authentificationData.middleware.RoleCheckMiddleware;
import behaviour.chainOfResponsibilities.authentificationData.middleware.ThrottlingMiddleware;
import behaviour.chainOfResponsibilities.authentificationData.middleware.UserExistsMiddleware;
import behaviour.chainOfResponsibilities.authentificationData.server.Server;

public final class AuthenticationDemo {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void main(final String[] args) throws IOException {
        init();
        boolean success;

        do {
            System.out.print("Enter email: ");
            final String email = reader.readLine();
            System.out.print("Input password: ");
            final String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // Checks are connected in one chain. A customer can build different chains
        // using the same components.
        final Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server)).linkWith(new RoleCheckMiddleware());

        // The server receives the chain from the client code.
        server.setMiddleware(middleware);
    }
}
