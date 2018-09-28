package composite.compositeChannel;

public abstract class ChannelLeaf implements Component {

    private final int id;

    ChannelLeaf(final int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int countChannels() {
        return 1;
    }
}
