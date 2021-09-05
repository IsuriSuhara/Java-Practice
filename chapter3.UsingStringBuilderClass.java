public class UsingStringBuilderClass {
    public static void main(String[] args) {
        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++)
            alpha += current;
        System.out.println(alpha);
        /*This sequence of events continues, and after 26 iterations through the loop, a total of 27
        objects are instantiated, most of which are immediately eligible for garbage collection.
        This is very inefficient.*/

        //Unlike the String class,StringBuilder is not immutable
        StringBuilder alphaa = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++)
            alphaa.append(current);
        System.out.println(alphaa);
        /*The StringBuilder class
        creates a String without storing all those interim String values.a new StringBuilder object
        is instantiated. The call to append() on line 17
        adds a character to the StringBuilder object each time through the for loop and appends
        the value of current to the end of alpha. This code reuses the same StringBuilder without
        creating an interim String each time.*/

    }
}

