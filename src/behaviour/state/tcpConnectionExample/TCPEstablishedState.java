package behaviour.state.tcpConnectionExample;

public class TCPEstablishedState implements TCPState {

    @Override
    public void open(final TCPConnection context) {
        System.out.println("State Established: Opening");
    }

    @Override
    public void close(final TCPConnection context) {
        System.out.println("State Established: Closing");
    }

    @Override
    public void synchronize(final TCPConnection context) {
        System.out.println("State Established: Synchronizing");
    }
}
