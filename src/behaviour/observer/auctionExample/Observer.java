package behaviour.observer.auctionExample;

public interface Observer {

    void handleEvent(BidEvent event);
}
