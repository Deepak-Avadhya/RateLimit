package model.queue;

import java.util.Date;
import java.util.LinkedList;

public class RateQueue {
    private RateQueueType queueType;
    private Integer limit;
    private LinkedList<Long> timeQueue;

    public RateQueue(RateQueueType queueType, Integer limit) {
        this.queueType = queueType;
        this.limit = limit;
        timeQueue=new LinkedList<>();
    }
    public synchronized Boolean addToQueue(int q){
        long currentTime = new Date().getTime();
        while (!timeQueue.isEmpty()){
            long lastTime = timeQueue.getFirst();
            if(currentTime-lastTime>queueType.value){
                timeQueue.removeLast();
            }else {
                break;
            }
        }
        if(limit-timeQueue.size()<q)return false;
        while (q-->0){
            timeQueue.add(currentTime);
        }
        return true;
    }
}
