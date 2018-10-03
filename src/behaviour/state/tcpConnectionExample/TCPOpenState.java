package behaviour.state.tcpConnectionExample;

public class TCPOpenState implements TCPState {

    @Override
    public void open(final TCPConnection context) {
        System.out.println("State Open: Opening");
    }

    @Override
    public void close(final TCPConnection context) {
        System.out.println("State Open: Closing");
    }

    @Override
    public void synchronize(final TCPConnection context) {
        System.out.println("State Open: Synchronizing");
    }
}
