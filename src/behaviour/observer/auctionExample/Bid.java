package behaviour.observer.auctionExample;

class Bid {

    private int id;
    private double price;
    private AuctionObserver observer;
    private boolean leader = false;

    Bid(final int id, final double price) {
        super();
        this.id = id;
        this.price = price;
    }

    void changePrice(final double price) {
        this.price = price;
        notifyObservers();
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public boolean isLeader() {
        return leader;
    }

    public void setLeader(final boolean leader) {
        this.leader = leader;
    }

    void addObserver(final AuctionObserver observer) {
        this.observer = observer;
        observer.addObservable(this);
    }

    void removeObserver() {
        observer.removeObservable(this);
        observer = null;
    }

    private void notifyObservers() {
        if (observer != null) {
            observer.handleEvent(new BidEvent(this));
        }
    }

    @Override
    public String toString() {
        return "Bid [id=" + id + ", price=" + price + ", leader=" + leader + "]";
    }
}
