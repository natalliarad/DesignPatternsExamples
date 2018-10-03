package behaviour.state.audioPlayer.states;

import behaviour.state.audioPlayer.ui.Player;

public class PlayingState extends State {

    PlayingState(final Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        player.setCurrentTrackAfterStop();

        return "Stop playing";
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));

        return "Paused...";
    }

    @Override
    public String onNext() {
        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        return player.previousTrack();
    }
}
