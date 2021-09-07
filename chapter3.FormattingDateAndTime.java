import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek()); // MONDAY
        System.out.println(date.getMonth()); // JANUARY
        System.out.println(date.getYear()); // 2020
        System.out.println(date.getDayOfYear()); // 20
        System.out.println();

        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time1 = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
        System.out.println(date1.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time1.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println();

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime1)); // 1/20/20
        System.out.println(shortDateTime.format(date1)); // 1/20/20
        //System.out.println(shortDateTime.format(time1)); // UnsupportedTemporalTypeException

        DateTimeFormatter shortDateTime1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTime1.format(shortDateTime));
        System.out.println(date1.format(shortDateTime));
        //System.out.println(time1.format(shortDateTime));

        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time2 = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);
        DateTimeFormatter shortF = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(shortF.format(dateTime2)); // 1/20/20 11:12 AM
        System.out.println(mediumF.format(dateTime2)); // Jan 20, 2020 11:12:34 AM

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime2.format(f)); // January 20, 2020, 11:12

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm");
        f1.format(dateTime2);
        //f1.format(date2);//Exception at run time
        f1.format(time2);

        //Parsing Dates and Times
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date3 = LocalDate.parse("01 15 2015", f2);
        LocalTime time3 = LocalTime.parse("11:22");
        System.out.println(date3); // 2015-01-15
        System.out.println(time3); // 11:22



        //Java provides a class called DateTimeFormatter to help us
        //out. Unlike the LocalDateTime class, DateTimeFormatter can be used to format any type of
        //date and/or time object. What changes is the format. DateTimeFormatter is in the package
        //java.time.format.
    }
}
