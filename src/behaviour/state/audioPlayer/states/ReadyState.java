package behaviour.state.audioPlayer.states;

import behaviour.state.audioPlayer.ui.Player;

/**
 * It can also translate context to other states.
 */
public class ReadyState extends State {

    public ReadyState(final Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        return "Locked...";
    }

    @Override
    public String onPlay() {
        final String action = player.startPlayback();
        player.changeState(new PlayingState(player));

        return action;
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}
