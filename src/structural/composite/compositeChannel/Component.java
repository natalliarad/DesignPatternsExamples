package structural.composite.compositeChannel;

public interface Component {

    void send();

    void receive();

    int countChannels();
}
