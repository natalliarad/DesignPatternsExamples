package behaviour.chainOfResponsibilities.authentificationData.middleware;

public class RoleCheckMiddleware extends Middleware {

    public boolean check(final String email, final String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");

            return true;
        }
        System.out.println("Hello, user!");

        return checkNext(email, password);
    }
}
