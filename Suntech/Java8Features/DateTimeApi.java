package Suntech.Java8Features;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Set;

public class DateTimeApi {
    private static LocalDate of;

    public static void main(String[] args) {

        //the current date from the system clock in the default time-zone.
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println( now.getDayOfMonth());
        System.out.println(now.getYear());
        System.out.println(now.getMonthValue());

        //custom Date
        LocalDate customDate = LocalDate.of(2003, 4, 21);
        System.out.println(customDate);

        //example
        LocalDate today = LocalDate.now();
        System.out.println(today.minusDays(10));
        System.out.println(today.minusMonths(2));


        //localtime
        LocalTime t = LocalTime.now();
        System.out.println(t);
        System.out.println(t.getMinute());

        //Custom time
        LocalTime tc = LocalTime.of(12,34 , 12);
        System.out.println(tc);
        
        //parse
        LocalTime ParsedTime = LocalTime.parse("12:23:45");
        System.out.println(ParsedTime);

       System.out.println( t.minusHours(2));
       if(t.isAfter(t.minusHours(2))){
        System.out.println("ok got it");
       }

       //LocalDateTime is used to get both date and time
       LocalDateTime ldt = LocalDateTime.now();
       System.out.println(ldt);

       //custom
       LocalDateTime dt = LocalDateTime.of(2003
       , 4, 21, 7, 30, 34);
       System.out.println(dt);
       LocalDateTime parseldt = LocalDateTime.parse("2003-03-21T12:23:21");
       System.out.println(parseldt);
       
       //ZonedDateTime is same as LocalDateTime with an added zone
       ZonedDateTime now2 = ZonedDateTime.now();
       System.out.println(now2);
       Set <String> zoneid = ZoneId.getAvailableZoneIds();
       zoneid.forEach(System.out::println);

       //custom
       ZonedDateTime Europe = ZonedDateTime.of(2003,
        1, 21, 12, 21, 11, 0, ZoneId.of("Europe/Athens"));
       System.out.println(Europe);
       ZonedDateTime America = ZonedDateTime.now(ZoneId.of("US/Pacific"));
       System.out.println("time is Pacific region of America is " +America);

       //Instant is used for machine time stamping Instantaneous point on the time stamp
       //returns zano second that have been passed since 1970

       Instant Instantt = Instant.now();
       System.out.println(Instantt);

       //duration :with nano second Precision time between 2 points in time
       Instant start = Instant.now();
       int sum =1;
       for(int i =1 ; i<10000;i++){
        sum+=i;
        
       }
       Instant Stop = Instant.now();
       Duration between2 = Duration.between(start, Stop);
       System.out.println(between2);

       Duration ofSeconds = Duration.ofSeconds(sum);

       System.out.println(ofSeconds);

       int i = between2.compareTo(ofSeconds);

       //period works same as duration but between dates
       LocalDate of4 = LocalDate.now();
       LocalDate of2 = LocalDate.of(1999, 11, 14);


       Period between = Period.between(of2,of4);
       System.out.println(between);

       //DateTimeFormatter agar 2003-04-12 ko ese likha 2003/04/12 DateTimeFormatting will work
       String date = "21/04/2003";
       DateTimeFormatter DF =DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate newDate = LocalDate.parse(date,DF);
       System.out.println(dt);

       


    







    }
}
