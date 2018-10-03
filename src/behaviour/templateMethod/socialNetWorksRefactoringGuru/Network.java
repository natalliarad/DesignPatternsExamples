package behaviour.templateMethod.socialNetWorksRefactoringGuru;

/**
 * Base class of the social network
 */
public abstract class Network {

    String userName;
    String password;

    Network() {
    }

    /**
     * Publish data to any network.
     */
    boolean post(final String message) {
        //Check user data before posting to social network.
        // Each network uses different methods for verification.
        if (logIn(this.userName, this.password)) {
            //Sending data.
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);

    abstract boolean sendData(byte[] data);

    abstract void logOut();
}
