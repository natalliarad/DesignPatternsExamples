package behaviour.iterator.socialNetworkProfiles.iterators;

import java.util.ArrayList;
import java.util.List;

import behaviour.iterator.socialNetworkProfiles.profile.Profile;
import behaviour.iterator.socialNetworkProfiles.socialNetworks.Facebook;

public class FacebookIterator implements ProfileIterator {

    private final Facebook facebook;
    private final String type;
    private final String email;
    private int currentPosition;
    private final List<String> emails = new ArrayList<>();
    private final List<Profile> profiles = new ArrayList<>();

    public FacebookIterator(final Facebook facebook, final String type, final String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (emails.isEmpty()) {
            final List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);

            for (final String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        final String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
