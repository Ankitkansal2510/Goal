package Java8.DateApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Duration class is used to find the duration between two object.We can use Duration
 * only for localTime  LocalDateTime and Instant
 *
 * Instant class is used to represent time for the machine.
 *
 * */
public class Duration_Example {

    public static void main(String[] args) {
        LocalTime date=LocalTime.of(20,1,1);
        LocalTime date1=LocalTime.of(22,2,1);
        Duration between=Duration.between(date,date1);
        System.out.println("Duration between is : " + between.toString());
        Duration threeMinutes = Duration.ofMinutes(3);
        Duration threeMinutes1= Duration.of(3, ChronoUnit.MINUTES);

        System.out.println("Duration of Minutes : " + threeMinutes);
    }
}
