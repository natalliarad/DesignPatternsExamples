package behaviour.iterator.socialNetworkProfiles.socialNetworks;

import java.util.ArrayList;
import java.util.List;

import behaviour.iterator.socialNetworkProfiles.iterators.FacebookIterator;
import behaviour.iterator.socialNetworkProfiles.iterators.ProfileIterator;
import behaviour.iterator.socialNetworkProfiles.profile.Profile;

public class Facebook implements SocialNetwork {

    private List<Profile> profiles;

    public Facebook(final List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    public Profile requestProfileFromFacebook(final String profileEmail) {
        // There would be a POST request to one of the Facebook API addresses. But instead we emulate
        // a long network connection, just like in real life ...
        simulateNetworkLatency();
        System.out.println("Facebook: Loading profile '" + profileEmail + "' over the network...");

        // ...and return test data.
        return findProfile(profileEmail);
    }

    public List<String> requestProfileFriendsFromFacebook(final String profileEmail, final String contactType) {
        // There would be a POST request to one of the Facebook API addresses. But instead we emulate
        // a long network connection, just like in real life ...
        simulateNetworkLatency();
        System.out.println("Facebook: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        /// ...and return test data.
        final Profile profile = findProfile(profileEmail);

        if (profile != null) {
            return profile.getContacts(contactType);
        }

        return null;
    }

    private Profile findProfile(final String profileEmail) {
        for (final Profile profile : profiles) {

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
        return new FacebookIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(final String profileEmail) {
        return new FacebookIterator(this, "coworkers", profileEmail);
    }
}
