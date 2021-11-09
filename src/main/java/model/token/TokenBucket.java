package model.token;

import java.time.Duration;

public class TokenBucket {

    private final long capacity;
    private final double refillTokensPerOneMillis;

    private double availableTokens;
    private long lastRefillTimestamp;

    public TokenBucket(long capacity, Duration duration) {
        this.capacity = capacity;
        this.refillTokensPerOneMillis = capacity/(double)duration.toMillis();

        this.availableTokens = capacity;
        this.lastRefillTimestamp = System.currentTimeMillis();
    }
    public long tokenAvailable() {
        refill();
        return (long)this.availableTokens;
    }
    public void consume(int numberTokens){
        availableTokens -= numberTokens;
    }

    private void refill() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > lastRefillTimestamp) {
            long millisSinceLastRefill = currentTimeMillis - lastRefillTimestamp;
            double refill = millisSinceLastRefill * refillTokensPerOneMillis;
            this.availableTokens = Math.min(capacity, availableTokens + refill);
            this.lastRefillTimestamp = currentTimeMillis;
        }
    }
}
