import java.util.List;
//import static java.util.Arrays; // DOES NOT COMPILE
//static imports are
//only for importing static members. Regular imports are for importing a class.
//static import java.util.Arrays.*; // DOES NOT COMPILE
//The syntax is import static
//and not vice versa.
import static java.util.Arrays.asList; // static import

//The compiler will complain if you try to explicitly do a static import of
//two methods with the same name or two static variables with the same name

public class StaticImports {
    public static void main(String[] args) {
        List<String> list = asList("one", "two"); // no Arrays.
        ///Arrays.asList("one"); // DOES NOT COMPILE
        //However,
        //we did not import the Arrays class anywhere. This makes it okay to write asList("one");
        //but not Arrays.asList("one");.
        asList("one");
    }

}
