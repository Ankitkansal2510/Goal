package Java8.DateApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * In this example we will see how we can format a date
 * The new java.time.format package in entirely devoted to this purpose.The most important class of this package is DateTimeFormatter.
 * The easiest way to create a formatter is through its static factory method and constant.The constant such as BASIC_ISO_DATE and ISO_LOCAL_DATE
 * are just predefined instances of the dDAteTimeFormatter class.
 *All DateTimeFormatter can be used to creat a String representation a given date or time in a specified format
 * */
public class FormattingDate_Example {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.parse("20140318", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate date2 = LocalDate.parse("2014-03-18", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(date1 + " " + date2);

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        LocalDate date3 =LocalDate.of(2014,2,21);
        String formattedDate=date3.format(dateTimeFormatter); //This formatting will return the string version of the date
        System.out.println("String version after formatting : "+ formattedDate);
        LocalDate date4=LocalDate.parse(formattedDate,dateTimeFormatter);//Again converting string version of the date to the Date object
        System.out.println("After converting string version of the date to the date object : " + date4);

//The ofPattern method also has an overloaded version allowing you to create a formatter for a given Locale, as shown in the following listing


        DateTimeFormatter italianFormatter =
                DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.ITALIAN);
        LocalDate date5 = LocalDate.of(2014, 3, 18);
        String formattedDated = date5.format(italianFormatter);
        System.out.println("Converting using locale.italian : " + formattedDated);
        LocalDate date6 = LocalDate.parse(formattedDated, italianFormatter);
        System.out.println("Converting back to object : " + date6);

    }
}
