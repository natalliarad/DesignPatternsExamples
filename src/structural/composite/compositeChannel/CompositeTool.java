package structural.composite.compositeChannel;

import java.util.ArrayList;

public class CompositeTool implements Component {

    private final int id;
    private final ArrayList<Component> channels;

    CompositeTool(final int id) {
        this.id = id;
        this.channels = new ArrayList<>();
    }

    void add(final Component channel) {
        channels.add(channel);
    }

    void remove(final Component channel) {
        channels.remove(channel);
    }

    @Override
    public void send() {
        System.out.println("\tComposite Tool #" + id + ", size tool: " + channels.size()
                + ", number channels: " + countChannels());
        for (Component channel : channels) {
            channel.send();
        }
    }

    @Override
    public void receive() {
        //some code here
    }

    @Override
    public int countChannels() {
        int count = 0;
        for (final Component channel : channels) {
            count += channel.countChannels();
        }
        return count;
    }
}
