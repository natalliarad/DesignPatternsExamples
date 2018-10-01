package structural.composite.compositeChannel;

public class UDPChannel extends ChannelLeaf {

    UDPChannel(final int id) {
        super(id);
    }

    @Override
    public void send() {
        System.out.println("upd send " + getId());
    }

    @Override
    public void receive() {
        System.out.println("upd receive");
    }
}
