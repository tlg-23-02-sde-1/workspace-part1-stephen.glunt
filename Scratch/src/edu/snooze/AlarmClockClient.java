package edu.snooze;

/*
 * This i the application "main-class" (class with the main() method).
 * Every Java application has ONE main-class, and usually many "business" classes.
 */
class AlarmClockClient {
    // ENTRY point or starting point of every standalone Java application
    // The application "starts here"
    public static void main(String[] args) {
        // create an instance of AlarmClock
        AlarmClock clock1 = new AlarmClock(7);

        AlarmClock clock2 = new AlarmClock(5, 6);

        clock1.snooze();

        clock2.snooze();

        AlarmClock clock3 = new AlarmClock(AlarmClock.MAX_INTERVAL);
        clock3.snooze();
        System.out.println(clock1);
    }
}