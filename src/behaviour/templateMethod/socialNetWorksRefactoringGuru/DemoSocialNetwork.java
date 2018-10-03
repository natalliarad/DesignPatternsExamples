package behaviour.templateMethod.socialNetWorksRefactoringGuru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class DemoSocialNetwork {

    public static void main(final String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        final String userName = reader.readLine();
        System.out.print("Input password: ");
        final String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        final String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Create network objects and publish the post.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
