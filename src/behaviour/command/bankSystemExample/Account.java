package behaviour.command.bankSystemExample;

class Account {

    private int id;
    private double balance;
    private boolean blocked;

    Account(final int id, final double balance, final boolean blocked) {
        this.id = id;
        this.balance = balance;
        this.blocked = blocked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(final double balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(final boolean blocked) {
        this.blocked = blocked;
    }
}
