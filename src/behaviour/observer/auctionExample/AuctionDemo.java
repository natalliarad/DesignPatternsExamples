package behaviour.observer.auctionExample;

import java.util.ArrayList;

public final class AuctionDemo {

    public static void main(final String[] args) {
        Bid bid1 = new Bid(1, 34);
        Bid bid2 = new Bid(2, 35);
        Bid bid3 = new Bid(3, 14);
        Bid bid4 = new Bid(4, 20);
        Bid bid5 = new Bid(5, 39);

        AuctionObserver observer = new AuctionObserver();

        bid1.addObserver(observer);
        bid2.addObserver(observer);
        bid3.addObserver(observer);
        bid4.addObserver(observer);
        bid5.addObserver(observer);

        ArrayList<Bid> list = new ArrayList<>();

        list.add(bid1);
        list.add(bid2);
        list.add(bid3);
        list.add(bid4);
        list.add(bid5);

        System.out.println("First:");

        bid3.changePrice(45); //more than maximum value

        for (final Bid bid : list) {
            System.out.println(bid);
        }

        bid2.changePrice(40); //less than maximum value

        for (final Bid bid : list) {
            System.out.println(bid);
        }

        bid4.changePrice(50); //more than maximum value

        for (final Bid bid : list) {
            System.out.println(bid);
        }
    }
}
