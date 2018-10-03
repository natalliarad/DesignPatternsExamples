package behaviour.state.tcpConnectionExample;

public class TCPClosedState implements TCPState {

    @Override
    public void open(final TCPConnection context) {
        System.out.println("State Closed: Opening");
    }

    @Override
    public void close(final TCPConnection context) {
        System.out.println("State Closed: Closing");
    }

    @Override
    public void synchronize(final TCPConnection context) {
        System.out.println("State Closed: Synchronizing");
    }
}
