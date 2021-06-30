package Java8.DateApi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * In this we will practise latest date api provided by java 8
 *
 * There a re many classes provided by java 8 in new date api .
 *
 * First we will look about
 *
 * LocalDate-This LocalDate class provided only date information.
 * We can create an instance of LocalDate is an immutable object representing just a plain date without time .
 * We can create instance of this class using of static factory method.A localDate instance provide many many methods
 * to read its most commonly used value such a year ,month ,day of the week and so on.
 *
 * **/
public class LocalDate_Example {
    public static void main(String[] args) {

        LocalDate date=LocalDate.of(2021,6,30);
        int year=date.getYear();
        //int year=date.get(ChronoField.YEAR);
        Month month=date.getMonth();
        DayOfWeek dayOfWeek=date.getDayOfWeek();
        int length=date.lengthOfMonth();

        boolean leapyear=date.isLeapYear();
        System.out.println(date + " " + "Year is : " + year + " Month is : " + month + " Day of week is : " + dayOfWeek+
                " length of the month is : " + length + " leapyear : " + leapyear);

        //To get the current date from the system clock

        LocalDate today=LocalDate.now();
        System.out.println("Today date is : " + today );

        //LocalDate can be created by parsing a string

        LocalDate pasrsingDate=LocalDate.parse("2021-06-30");
        System.out.println(pasrsingDate + " year is : " + pasrsingDate.getYear() + " month is : " + pasrsingDate.getMonth()
        + " Dayofweek is : " + pasrsingDate.getDayOfWeek() + " dayof month is : " + pasrsingDate.getDayOfMonth() + " " +
                " is leap year: " + pasrsingDate.isLeapYear());

        //This class more method which are very useful for example we can plus minus days ,months and year

        LocalDate localDate=LocalDate.of(2021,6,30);
        LocalDate localDateplusyear=localDate.plusYears(2);
        LocalDate localDateplusMonth=localDate.plusMonths(4);
        LocalDate localDateplusDays=localDate.plusDays(3);
        LocalDate localDateminusMonth=localDate.minusMonths(4);
        System.out.println(String.format("%s%n%s%n%s%n%s%n%s%n","Original date is : " + localDate ,
                "LocalDate after adding 2 year : " + localDateplusyear ,
                "LocalDate after adding 4 months : " + localDateplusMonth ,
                "LocalDate after adding days : " + localDateplusDays ,
                "localDate after subtracting 4 months : " + localDateminusMonth));

    }
}
