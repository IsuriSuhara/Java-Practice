import java.io.*;
public class EqualityOperators {
    public static void main(String[] args) {

        //The equality operators are used in one of three scenarios:
        //1) Comparing two numeric primitive types. If the numeric values are of different data
        //types, the values are automatically promoted as previously described. For example,
        //5 == 5.00 returns true since the left side is promoted to a double.
        //2) Comparing two boolean values.
        //3) Comparing two objects, including null and String values.

        //The comparisons for equality are limited to these three cases, so you cannot mix and
        //match types.

        /*
        boolean x = true == 3; // DOES NOT COMPILE
        boolean y = false != "Giraffe"; // DOES NOT COMPILE
        boolean z = 3 == "Kangaroo"; // DOES NOT COMPILE
        */
        boolean y = false;
        boolean x = (y = true);
        System.out.println(x); // Outputs true
        boolean a = false;
        boolean b = (a == true);
        System.out.println(b); // Outputs false

        File c = new File("myFile.txt");
        File d = new File("myFile.txt");
        File e = c;
        System.out.println(c == d); // Outputs false
        System.out.println(c == e); // Outputs true
        //Two references are equal if and only if they point to the same
        //object, or both point to null

    }

}
