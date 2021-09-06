import java.util.List;
import java.util.ArrayList;
public class WrapperClassAutoboxing {
    public static void main(String[] args) {
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");
        //The fi rst line converts a String to an int primitive. The second converts a String to an
        //Integer wrapper class.

        // int bad1 = Integer.parseInt("a"); // throws NumberFormatException
        // Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException
        //If the String passed in is not valid for the given type, Java throws
        //an exception. In these examples, letters and dots are not valid for an integer value

        //Since Java 5, you can just type the primitive value and Java will convert it to the
        //relevant wrapper class for you. This is called autoboxing.
        List<Double> weights = new ArrayList<>();
        weights.add(50.5); // [50.5]
        //autoboxes the double primitive into a Double object and adds that to the List.

        weights.add(new Double(60)); // [50.5, 60.0]
        //you can still write code the long way and pass in a wrapper object.No deprecated though.

        weights.remove(50.5); // [60.0]
        //autoboxes into the wrapper object and passes it to remove().

        double first = weights.get(0); // 60.0
        //retrieves the Double and unboxes it into a double primitive.

        //What do you think happens if you try to unbox a null?

        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        //int h = heights.get(0); // NullPointerException

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers);//[1]
        //It actually outputs 1. After adding the two values, the List contains [1, 2]. We then request
        //the element with index 1 be removed.
    }
}
