package collections.dateTimeAPI;

import java.time.LocalTime;

public class Assignment5 {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        LocalTime after25Minutes = currentTime.plusMinutes(25);

        System.out.println("Current Time : " + currentTime);
        System.out.println("After 25 Minutes : " + after25Minutes);
    }
}
