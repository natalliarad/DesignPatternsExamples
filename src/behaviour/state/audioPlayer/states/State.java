package behaviour.state.audioPlayer.states;

import behaviour.state.audioPlayer.ui.Player;

/**
 * Common interface for all states
 */
public abstract class State {

    Player player;

    /**
     * The context transfers itself to the state's constructor so that the state can access
     * its data and methods in the future, if required.
     */
    State(final Player player) {
        this.player = player;
    }

    public abstract String onLock();

    public abstract String onPlay();

    public abstract String onNext();

    public abstract String onPrevious();
}
