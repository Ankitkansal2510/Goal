package Java8.DateApi;

import java.time.LocalDate;
import java.time.Period;

/**
 * In this we will demostrate Period;
 *
 * As Duration class is used to find the duration between time just like that
 * Period class is used to find the period between dates .
 *
 * ex
 * from 2015-jan-1 to 2020-jan-1 , the period is of 5 years
**/

public class Period_Example {

    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(2015,1,1);
        LocalDate localDate1=LocalDate.of(2020,2,1);
        Period betweenPeriod=Period.between(localDate,localDate1);
        System.out.println("Period between two date is : " + betweenPeriod);
        Period tenDays = Period.ofDays(10);
        Period threeWeeks = Period.ofWeeks(3);
        Period twoYearsSixMonthsOneDay = Period.of(2, 6, 1);
        System.out.println("Period of days is : " +tenDays);
    }
}
