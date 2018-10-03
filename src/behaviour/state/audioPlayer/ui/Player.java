package behaviour.state.audioPlayer.ui;

import java.util.ArrayList;
import java.util.List;

import behaviour.state.audioPlayer.states.ReadyState;
import behaviour.state.audioPlayer.states.State;

public class Player {

    private State state;
    private boolean playing;
    private List<String> playlist = new ArrayList<>();
    private int currentTrack;

    public Player() {
        this.state = new ReadyState(this);
        setPlaying(true);

        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }
    }

    public void changeState(final State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setPlaying(final boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public String startPlayback() {
        return "Playing " + playlist.get(currentTrack);
    }

    public String nextTrack() {
        currentTrack++;

        if (currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }

        return "Playing " + playlist.get(currentTrack);
    }

    public String previousTrack() {
        currentTrack--;

        if (currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }

        return "Playing " + playlist.get(currentTrack);
    }

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }
}
