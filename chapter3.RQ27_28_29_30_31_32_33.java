import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;
import java.time.*;
public class RQ27_28_29_30_31_32_33 {
    public static void main(String[] args) {
        //RQ27
        //The first if statement is false because the variables do not point to the same object.
        //The second if statement is true because ArrayList implements equality to mean the
        //same elements in the same order.
        List<String> one = new ArrayList<String>();
        one.add("abc");
        List<String> two = new ArrayList<>();
        two.add("abc");
        if (one == two)
            System.out.println("A");
        else if (one.equals(two))
            System.out.println("B");//B
        else
            System.out.println("C");

        //RQ28
        LocalDate date =LocalDate.of(2014, 6, 21);//D.
        LocalDate date1 =LocalDate.of(2014, Month.JUNE, 21);//E.

        LocalDate date2=LocalDate.of(2014, Calendar.JUNE, 21);//Incorrect answer
        //is incorrect because it uses the old pre–Java 8 way of counting months, again
        //beginning with 0.

        //LocalDate date3 =new LocalDate(2014, 6, 21);//Incorrect because LocalDate
        // does not have a public constructor.
        System.out.println(date+" "+date1+" "+date2);

        //RQ29
        //A LocalDate does not have a time element. Therefore, it has no method to add
        //hours and the code does not compile.
        LocalDate date3 = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        date.plusDays(2);//ignore the result
        //date.plusHours(3);//DOES NOT COMPILE
        System.out.println(date3.getYear() + " " + date3.getMonth() + " "
                + date3.getDayOfMonth());

        //RQ30
        //Java throws  a run time exception if invalid date values are passed. There is no 40th day in
        //April—or any other month for that matter.
        //LocalDate date4 = LocalDate.of(2018, Month.APRIL, 40);
        //System.out.println(date4.getYear() + " " + date4.getMonth() + " "+ date4.getDayOfMonth());

        //RQ31
        //The date starts out as April 30, 2018. Since dates are immutable and the plus methods
        //have their return values ignored, the result is unchanged. Therefore, option B is
        //correct.
        LocalDate date5 = LocalDate.of(2018, Month.APRIL, 30);
        date5.plusDays(2);//ignore the result
        date5.plusYears(3);//ignore the result
        System.out.println(date5.getYear() + " " + date5.getMonth() + " "
                + date5.getDayOfMonth());

        //RQ32
        //Even though d has both date and time, the formatter only outputs time.
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.of(1, 2, 3);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(d.format(f));//11:22 AM

        //RQ33
        //Only the last method is used because the Period.ofXXX methods are static methods.
        LocalDateTime d1 = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p1 = Period.ofDays(1).ofYears(2);
        d1 = d1.minus(p1);
        DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f1.format(d1));//5/10/13, 11:22 AM
        //Period does not allow chaining. Only the last Period method called counts, so only
        //the two years are subtracted.
    }
}
