package behaviour.iterator.socialNetworkProfiles.iterators;

import behaviour.iterator.socialNetworkProfiles.profile.Profile;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}
