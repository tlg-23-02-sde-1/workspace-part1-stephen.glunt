package edu.snooze;

/*
 * System or "business class" to model the workings of an alarm clock.
 */
public class AlarmClock {
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    // attributes or properties, in Java these are called "fields" or "instance variables"
    private int snoozeInterval = 5;
    private int repeat  = 10;  //Number of times you can snooze.



    public AlarmClock(){
        //just default values
    }

    public AlarmClock(int snoozeInterval){
        this();
        setSnoozeInterval(snoozeInterval);
    }

    public AlarmClock(int snoozeInterval, int repeat){
        this(snoozeInterval);
        setRepeat(repeat);
    }

    public void setSnoozeInterval(int interval){
        if(interval >= MIN_INTERVAL && interval <= MAX_INTERVAL){
            snoozeInterval = interval;
        } else {
            throw new IllegalArgumentException("Invalid snooze interval: " + interval +
                    ". Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + " inclusive.");
        }
    }

    public int getSnoozeInterval(){
        return snoozeInterval;
    }

    public void setRepeat(int repeat) {
        if(repeat >= 1 && repeat <= 10) {
            this.repeat = repeat;
        } else {
            throw new IllegalArgumentException("Repeat must be between 1 and 10.");
        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void snooze() {
        System.out.println("Snoozing for " + snoozeInterval + " minutes.");
    }

    public String toString(){
        return "AlarmClock: snoozeInterval = " + getSnoozeInterval() + ", repeat = " + repeat;
    }
}