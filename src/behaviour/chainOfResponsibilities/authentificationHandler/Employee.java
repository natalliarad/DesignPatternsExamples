package behaviour.chainOfResponsibilities.authentificationHandler;

/**
 * Class, which entity's calls are handled.
 */
public class Employee {

    private final int id;
    private final String login;
    private final String password;

    Employee(final int id, final String login, final String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    int getId() {
        return id;
    }

    String getLogin() {
        return login;
    }

    String getPassword() {
        return password;
    }

    @Override
    public int hashCode() {
        int result = id + ((login == null) ? 0 : login.hashCode());
        result = 31 * result + ((password == null) ? 0 : password.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final Employee other = (Employee) obj;

        if (id != other.id) {
            return false;
        }

        if (login == null) {

            if (other.login != null) {
                return false;
            }

        } else if (!login.equals(other.login)) {
            return false;
        }

        if (password == null) {

            if (other.password != null) {
                return false;
            }
        } else if (!password.equals((other.password))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", login=" + login + ", password=" + password + "]";
    }
}
