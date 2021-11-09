package model.queue;

public enum RateQueueType {
    //todo add proper value
    SEC(1000),MIN(60000),HOUR(3600000),WEEK(604800000),MONTH(25920000);
    long value;
    RateQueueType(long value) {
        this.value=value;
    }
}
