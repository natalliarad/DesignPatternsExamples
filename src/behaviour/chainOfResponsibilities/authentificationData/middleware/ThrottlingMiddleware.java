package behaviour.chainOfResponsibilities.authentificationData.middleware;

/**
 * A specific element in the chain processes the request in its own way.
 */
public class ThrottlingMiddleware extends Middleware {

    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(final int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * Note that the checkNext () call can be inserted both at the beginning of this method
     * and in the middle or at the end.
     * <p>
     * This gives another level of flexibility compared to loop checks. For example, a chain
     * element may skip all other checks forward and run its check at the end.
     */
    public boolean check(final String email, final String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            Thread.currentThread().stop();
        }
        return checkNext(email, password);
    }
}
