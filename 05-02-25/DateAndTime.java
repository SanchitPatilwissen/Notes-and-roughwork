import java.util.*;
import java.time.*;

// Before Java SE 8 we use Joda for good accuracy of date and time classes. 

public class DateAndTime {
    public static void main(String[] args) {
        Date d1 = new Date(); // Its format is not correct and gives date as well as time. Additionally, it is precise only upto second.
        System.out.println(d1);
        LocalDate d2 = LocalDate.now(); // Gives only date
        System.out.println(d2);
        LocalTime d3 = LocalTime.now(); // Gives only time with high precision
        System.out.println(d3);
        LocalDateTime d4 = LocalDateTime.now(); // Gives both
        System.out.println(d4);
        System.out.println(d4.withMonth(5)); // Will set month to may
        System.out.println(d4.withMonth(Month.MAY.getValue())); // Will set month to may

        LocalDate d5 = LocalDate.of(1983, Month.APRIL, 17);
        System.out.println(d5);

        LocalTime t1 = LocalTime.now(ZoneId.of("Singapore"));
        System.out.println(t1);

        Set s = ZoneId.getAvailableZoneIds();
        s.forEach(System.out::println);

    }    

}
