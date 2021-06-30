package Java8.DateApi;


import java.time.LocalTime;

/*
*In this we will demonstrate localtime class which gives the information of time
*
**/
public class LocalTime_Example {

    public static void main(String[] args) {
        LocalTime time=LocalTime.of(20,50,2) ;
        System.out.println("Time is : " + time + " Hour is : " + time.getHour() + " ,minute is : " + time.getMinute()+
                " ,Second is : " + time.getSecond() + " " );


    }
}
