package behaviour.state.tcpConnectionExample;

class TCPConnection {

    private TCPState state;
    //another fields

    public TCPConnection() {
        state = new TCPClosedState();
    }

    void close() {
        state.close(this);
        this.changeState(new TCPClosedState());
    }

    void open() {
        state.open(this);
        this.changeState(new TCPOpenState());
    }

    void synchronize() {
        state.synchronize(this);
        this.changeState(new TCPEstablishedState());
    }

    private void changeState(TCPState state) {
        this.state = state;
    }
}
