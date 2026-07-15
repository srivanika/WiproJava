package collections.dateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Assignment2 {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate nextMonth = today.plusMonths(1).withDayOfMonth(1);

        LocalDate secondSunday = nextMonth.with(
                TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));

        System.out.println("Second Sunday of Next Month : " + secondSunday);
    }
}