import java.time.*;
public class DateAndTimes {
    LocalDateTime myTime;
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time2);

        //LocalDate d = new LocalDate(); // DOES NOT COMPILE
        //You are not allowed to construct a date or time object directly

        //LocalDate.of(2015, Month.JANUARY, 32); // throws DateTimeException
        //java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 32

        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date); // 2014-01-20
        date = date.plusDays(2);
        System.out.println(date); // 2014-01-22
        date = date.plusWeeks(1);
        System.out.println(date); // 2014-01-29
        date = date.plusMonths(1);
        System.out.println(date); // 2014-02-28
        date = date.plusYears(5);
        System.out.println(date); // 2019-02-28
        System.out.println();

        //Backward in time
        LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date4, time);
        System.out.println(dateTime); // 2020-01-20T05:15
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); // 2020-01-19T05:15
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2020-01-18T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2020-01-18T19:14:30

        DateAndTimes myTry = new DateAndTimes();
        myTry.myTime =LocalDateTime.now();
        System.out.println(myTry.myTime.minusYears(1));

        LocalDate date5 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time5 = LocalTime.of(5, 15);
        LocalDateTime dateTime5 = LocalDateTime.of(date2, time).minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println(dateTime5);

        LocalDate date6 = LocalDate.of(2020, Month.JANUARY, 20);
        date6.plusDays(10);
        System.out.println(date6);
        //Adding 10 days was useless because we ignored the result.
        //Whenever you see immutable types, pay attention to make sure the return value of a
        //method call isn’t ignored.

        LocalDate date7 = LocalDate.of(2020, Month.JANUARY, 20);
        //date = date7.plusMinutes(1); // DOES NOT COMPILE
        //LocalDate does not contain time. This means you cannot add minutes to it.



    }
}
