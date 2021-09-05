public class UnderstandingEquality {
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true
        System.out.println(one.equals(three));//true
        System.out.println(one.equals(two));//false
        System.out.println();

        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y); // true
        //Remember that Strings are immutable and literals are pooled. The JVM created only
        //one literal in memory. x and y both point to the same location in memory; therefore, the
        //statement outputs true. It gets even trickier.
        String i = "Hello World";
        String j = " Hello World".trim();
        System.out.println(x == j); // false
        //In this example, we don’t have two of the same String literal. Although x and z happen
        //to evaluate to the same string, one is computed at runtime. Since it isn’t the same at
        //compile-time, a new String object is created.

        //You can even force the issue by creating a new String:
        String a = new String("Hello World");
        String b = "Hello World";
        System.out.println(a == b); // false
        //Since you have specifically requested a different String object, the pooled value isn’t
        //shared.

        //The lesson is to never use == to compare String objects. The only time
        //you should have to deal with == for Strings is on the exam.

        //You saw earlier that you can say you want logical equality rather than object equality
        //for String objects:
        String c = "Hello World";
        String d = " Hello World".trim();
        System.out.println(c.equals(d)); // true

        //This works because the authors of the String class implemented a standard method
        //called equals to check the values inside the String rather than the String itself. If a
        //class doesn’t have an equals method, Java determines whether the references point to the
        //same object—which is exactly what == does. In case you are wondering, the authors of
        //StringBuilder did not implement equals(). If you call equals() on two StringBuilder
        //instances, it will check reference equality.
        System.out.println();


        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = t1;
        System.out.println(t1 == t1); // true
        System.out.println(t1 == t2); // false
        System.out.println(t1.equals(t2)); // false
        //The first two statements check object reference equality.
        //Last line prints false since Tiger does not implement equals().
    }
}
class Tiger{
    String name;
}
