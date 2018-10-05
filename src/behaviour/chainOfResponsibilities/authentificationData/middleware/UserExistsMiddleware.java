package behaviour.chainOfResponsibilities.authentificationData.middleware;

import behaviour.chainOfResponsibilities.authentificationData.server.Server;

public class UserExistsMiddleware extends Middleware {

    private Server server;

    public UserExistsMiddleware(final Server server) {
        this.server = server;
    }

    public boolean check(final String email, final String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }

        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }

        return checkNext(email, password);
    }
}
