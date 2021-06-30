package Java8.DateApi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

import static java.time.temporal.TemporalAdjusters.previousOrSame;

/**
 * All the date operation  we have seen are simple , but what if we need some complex operation .
 *
 * Like Adjusting a date to next Sunday,or finding the first day of the month etc
 *
 * In this case we can use predefined Temporal Object as shown below:
 *We can use static method with()-> which created the copy of the Temporal object with part change
 *
 * **/
public class TemporalAdjusters_Example {

    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2021,6,30);
        LocalDate date1=date.with(ChronoField.MONTH_OF_YEAR,9);
        System.out.println("After using with to update the month of the year is : " + date1);

        //Now if we want to perform more complex operation

        LocalDate date2=date.with(DayOfWeek.SUNDAY);
        System.out.println("The upcoming sunday post the date 2021-6-30 will be : " + date2);
        System.out.println("The Previous sunday before the date 2021-6-30 will be : " + date.with(previousOrSame(DayOfWeek.SUNDAY)));

        //Like this we can use many method inside with to work on dates

    }
}
