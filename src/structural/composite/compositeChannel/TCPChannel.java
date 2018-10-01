package structural.composite.compositeChannel;

public class TCPChannel extends ChannelLeaf {

    TCPChannel(final int id) {
        super(id);
    }

    @Override
    public void send() {
        System.out.println("tcp send " + getId());
    }

    @Override
    public void receive() {
        System.out.println("tcp receive");
    }
}
