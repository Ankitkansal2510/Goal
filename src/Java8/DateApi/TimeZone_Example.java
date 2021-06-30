package Java8.DateApi;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * In this we will show how to use a different time zone
 *
 * The new java.time.ZoneId class is used to change the time zone
 * */
public class TimeZone_Example {

    public static void main(String[] args) {

        ZoneId zoneId=ZoneId.of("Europe/Rome");
        //The region id are all in the format : {area/city}
        //Once we have a zone id we can combine it with localDate ,localdatetime and instant to transform it into zoneDateTime instance ,which represent
        //time in relative to the specific time zone

        LocalDate date=LocalDate.of(2021,6,30);
        ZonedDateTime zonedDateTime=date.atStartOfDay(zoneId);
        System.out.println(zonedDateTime);

    }
}
