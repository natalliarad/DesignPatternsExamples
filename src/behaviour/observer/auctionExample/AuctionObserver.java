package behaviour.observer.auctionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class AuctionObserver implements Observer {

    private ArrayList<Bid> list = new ArrayList<>();

    void addObservable(final Bid bid) {
        list.add(bid);
    }

    void removeObservable(final Bid bid) {
        list.remove(bid);
    }

    @Override
    public void handleEvent(final BidEvent event) {
        final double newPrice = event.getSource().getPrice();
        double price = 0;
        final Iterator<Bid> iterator = list.iterator();
        boolean lead = true;

        while (iterator.hasNext()) {
            final Bid bid = iterator.next();
            price = bid.getPrice();

            if (newPrice > price) {
                bid.setLeader(false);
            } else if (newPrice < price) {
                lead = false;
            }
            if (lead) {
                event.getSource().setLeader(true);
                LeaderInfo.currentPrice = newPrice;
                System.out.println("Leading Price " + newPrice);
            }
        }
    }
}
