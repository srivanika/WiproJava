package collections.dateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class Assignment3 {

    public static void main(String[] args) {

        // Change this joining date according to your requirement
        LocalDate joiningDate = LocalDate.of(2023, 7, 1);

        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("Experience");
        System.out.println("Years  : " + experience.getYears());
        System.out.println("Months : " + experience.getMonths());
        System.out.println("Days   : " + experience.getDays());
    }
}
