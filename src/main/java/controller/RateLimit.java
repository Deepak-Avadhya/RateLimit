package controller;

import exception.RateLimitException;
import model.client.Client;
import model.config.ConfigType;
import model.config.Configuration;
import model.config.Rule;
import model.config.RuleType;

import java.time.Duration;

public class RateLimit {
    public static void main(String[] args){
        Client client1 = new Client("deepak");
        Configuration config = new Configuration(ConfigType.LIMIT);
        config
                .add(new Rule(RuleType.SEC,10, Duration.ofSeconds(10)));

        long t=100;
        while (t-->0){
            try {
                config.tryConsume(1);
                System.out.println("yes");
                Thread.sleep(1000);
            } catch (RateLimitException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
