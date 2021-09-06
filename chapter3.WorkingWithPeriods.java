import java.time.*;
public class WorkingWithPeriods {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1); // create a period
        Period annually = Period.ofYears(1); // every 1 year
        Period quarterly = Period.ofMonths(3); // every 3 months
        Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
        Period everyOtherDay = Period.ofDays(2); // every 2 days
        Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days
        performAnimalEnrichment(start, end, period);

        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period1 = Period.ofMonths(1);
        System.out.println(date.plus(period1)); // 2015-02-20
        System.out.println(dateTime.plus(period1)); // 2015-02-20T06:15
        //System.out.println(time.plus(period1)); // UnsupportedTemporalTypeException
        //The first has only the date, and the second has both the date and time.

        //You’ve probably noticed by now that a Period is a day or more of time. There is also
        //Duration, which is intended for smaller units of time. For Duration, you can specify the
        //number of days, hours, minutes, seconds, or nanoseconds. And yes, you could pass 365
        //days to make a year, but you really shouldn’t—that’s what Period is for.
    }
    private static void performAnimalEnrichment(LocalDate start, LocalDate end,
                                                Period period) { // uses the generic period
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period
        }
        System.out.println();
    }
}
