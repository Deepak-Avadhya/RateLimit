package model.config;

import exception.RateLimitException;

import java.util.ArrayList;
import java.util.List;

public class Configuration {
    private ConfigType configType;
    private List<Rule> rules;

    public Configuration(ConfigType configType) {
        this.configType = configType;
        rules=new ArrayList<>();
    }

    public Configuration add(Rule rule){
        this.rules.add(rule);
        return this;
    }

    private Boolean isTokenAvailable(int reqNum){

        for (Rule rule: rules){
            long token=rule.tokenAvailable();
            System.out.println(rule.getRuleName()+" "+token);
            if(token<reqNum)return false;
        }
        return true;
    }
    private void consume(int reqNum){
        for (Rule rule:rules){
            rule.consumer(reqNum);
        }
    }
    public synchronized Boolean tryConsume(int reqNum) throws RateLimitException {
        if(isTokenAvailable(reqNum)){
            consume(reqNum);
            return true;
        }
        throw new RateLimitException("Limit has breached please try later");
    }

}
