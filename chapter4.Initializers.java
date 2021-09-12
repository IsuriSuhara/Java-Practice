import java.util.*;
public class Initializers {
    private static int counter = 0; // initialization
    private static final int NUM_BUCKETS = 45;
    private static final ArrayList<String> values = new ArrayList<>();
    private static final int NUM_SECONDS_PER_HOUR;
    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }
    private static int one;//declares a static variable that is not final.It can be assigned as many times as we
    //like.
    private static final int two;
    //declares a fi nal variable without initializing it. This means we can initialize it
    //exactly once in a static block.
    private static final int three = 3;
    //declares a fi nal variable and initializes it at the same time. We are not allowed to assign it
    //again.
    //private static final int four; // DOES NOT COMPILE
    //declares a fi nal variable that never gets initialized.
    //The compiler gives a compiler error because it knows that the static blocks are the only place
    //the variable could possibly get initialized. Since the programmer forgot, this is clearly an error.
    static {
        one = 1;
        two = 2;
        //three = 3; // DOES NOT COMPILE
        //two = 4; // DOES NOT COMPILE
    }
    public static void main(String[] args) {
        //NUM_BUCKETS = 5; // DOES NOT COMPILE
        values.add("changed");
        System.out.println(values);
        //values is a reference variable. We are allowed to call methods
        //on reference variables. All the compiler can do is check that we don’t try to reassign the
        //final values to point to a different object.
    }
}
