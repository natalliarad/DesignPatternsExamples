package behaviour.observer.auctionExample;

import java.util.EventObject;

class BidEvent extends EventObject {

    public BidEvent(final Bid source) {
        super(source);
    }

    @Override
    public Bid getSource() {
        return (Bid) super.getSource();
    }
}
