package edu.snooze;

/*
 * Test class focused on validation testing.
 */
class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();
        clock.setSnoozeInterval(1);
        System.out.println(clock);


    }
}