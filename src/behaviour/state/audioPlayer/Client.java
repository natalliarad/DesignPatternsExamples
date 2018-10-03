package behaviour.state.audioPlayer;

import behaviour.state.audioPlayer.ui.Player;
import behaviour.state.audioPlayer.ui.UI;

public final class Client {

    public static void main(final String[] args) {
        final Player player = new Player();
        final UI ui = new UI(player);
        ui.init();
    }
}
