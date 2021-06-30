package Java8.DateApi;

import java.time.*;
import java.time.temporal.ChronoUnit;

/***
 * In this we will demonstrate LocalDateTime class which contains both date and time
 *
 * */
public class LocalDateTime_Example {

    public static void main(String[] args) {
        LocalDateTime localDateTime= LocalDateTime.of(2021,6,30,5,57,6);
        System.out.println("LocalDate time is : " + localDateTime + " ,year is : " + localDateTime.getYear() +
                " ,Hour is : " + localDateTime.getHour());

        //We can also pass instance of Date and time while creating LocalDate time


    }
}
