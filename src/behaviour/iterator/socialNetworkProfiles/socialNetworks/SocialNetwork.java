package behaviour.iterator.socialNetworkProfiles.socialNetworks;

import behaviour.iterator.socialNetworkProfiles.iterators.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
