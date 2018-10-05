package behaviour.iterator.socialNetworkProfiles.socialNetworks;

import java.util.ArrayList;
import java.util.List;

import behaviour.iterator.socialNetworkProfiles.iterators.LinkedInIterator;
import behaviour.iterator.socialNetworkProfiles.iterators.ProfileIterator;
import behaviour.iterator.socialNetworkProfiles.profile.Profile;

public class LinkedIn implements SocialNetwork {

    private List<Profile> contacts;

    public LinkedIn(final List<Profile> cache) {
        if (cache != null) {
            this.contacts = cache;
        } else {
            this.contacts = new ArrayList<>();
        }
    }

    public Profile requestContactInfoFromLinkedInAPI(final String profileEmail) {
        // There would be a POST request to one of the LinkedIn API addresses. But instead we emulate
        // a long network connection, just like in real life ...
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading profile '" + profileEmail + "' over the network...");

        // ...and return test data.
        return findContact(profileEmail);
    }

    public List<String> requestRelatedContactsFromLinkedInAPI(final String profileEmail, final String contactType) {
        // There would be a POST request to one of the LinkedIn API addresses. But instead we emulate
        // a long network connection, just like in real life ...
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        // ...and return test data.
        final Profile profile = findContact(profileEmail);

        if (profile != null) {
            return profile.getContacts(contactType);
        }

        return null;
    }

    private Profile findContact(final String profileEmail) {
        for (final Profile profile : contacts) {

            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }

        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (final InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(final String profileEmail) {
        return new LinkedInIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(final String profileEmail) {
        return new LinkedInIterator(this, "coworkers", profileEmail);
    }
}
