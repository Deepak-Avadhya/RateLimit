package model.config;

import model.queue.RateQueue;
import model.queue.RateQueueType;
import model.token.TokenBucket;

import java.time.Duration;

public class Rule {
    private RuleType ruleType;
    private TokenBucket tokenBucket;

    public Rule(RuleType ruleType, long capacity, Duration duration) {
        this.ruleType = ruleType;
        this.tokenBucket=new TokenBucket(capacity,duration);
    }

    public RuleType getRuleName() {
        return ruleType;
    }

    public void setRuleName(RuleType ruleType) {
        this.ruleType = ruleType;
    }

    public TokenBucket getTokenBucket() {
        return tokenBucket;
    }

    public void setTokenBucket(TokenBucket tokenBucket) {
        this.tokenBucket = tokenBucket;
    }
    public long tokenAvailable(){
        return tokenBucket.tokenAvailable();
    }
    public void consumer(int requestNUm){
        //todo throw exception if not consumed
        this.tokenBucket.consume(requestNUm);
    }
}
