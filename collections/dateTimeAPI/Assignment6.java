package collections.dateTimeAPI;

import java.time.LocalTime;

public class Assignment6 {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        LocalTime beforeTime = currentTime.minusHours(5).minusMinutes(30);

        System.out.println("Current Time : " + currentTime);
        System.out.println("5 Hours 30 Minutes Before : " + beforeTime);
    }
}
