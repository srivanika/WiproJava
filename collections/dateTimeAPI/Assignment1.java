package collections.dateTimeAPI;

import java.time.LocalDate;

public class Assignment1 {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate afterTenDays = today.plusDays(10);

        System.out.println("Today's Date : " + today);
        System.out.println("Date After 10 Days : " + afterTenDays);
    }
}
