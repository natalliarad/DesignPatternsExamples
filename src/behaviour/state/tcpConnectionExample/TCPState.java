package behaviour.state.tcpConnectionExample;

public interface TCPState {

    void open(TCPConnection context);

    void close(TCPConnection context);

    void synchronize(TCPConnection context);
}
