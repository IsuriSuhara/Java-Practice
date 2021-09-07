import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
public class RQ20_21_22_23_24_25_26 {
    public static void main(String[] args) {
        //RQ20
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        //list.add(7);//Compiler error
        //The code does not compile because list is instantiated using generics. Only String
        //objects can be added to list and 7 is an int.
        for(String s : list) System.out.print(s);
        System.out.println();

        //RQ21
        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1, 6);
        values.remove(0);
        for (Integer v : values) System.out.print(v);
        System.out.println();

        //RQ22
        int[] random = { 12, 18,1,19, 1, -10 };
        int x = 12;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);//D. The result is undefined.
        //The code compiles and runs fine. However, an array must be sorted for binarySearch()
        //to return a meaningful result.

        //RQ23
        List<Integer> list1 = Arrays.asList(10, 4, -1, 5);//creates a fixed size array of size 4
        Collections.sort(list1);//sorts it.
        Integer array[] = list1.toArray(new Integer[4]);//converts it back to
        //an array. The brackets aren’t in the traditional place, but they are still legal.
        System.out.println(array[0]);//prints the first element, which is now –1.

        //RQ24
        String [] names = {"Tom", "Dick", "Harry"};
        //List<String> list2 = names.asList();//C. compiler error
        //list2.set(0, "Sue");
        System.out.println(names[0]);
        //Converting from an array to an ArrayList uses Arrays.asList(names). There is
        //no asList() method on an array instance.

        //RQ25
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        int i = Collections.binarySearch(hex, "8");
        int j = Collections.binarySearch(hex, "3A");
        int k = Collections.binarySearch(hex, "4F");
        System.out.println(i + " " + j + " " + k);
        //After sorting, hex contains [30, 3A, 8, FF]. Remember that numbers sort before
        //letters and strings sort alphabetically. This makes 30 come before 8. A binary search
        //correctly finds 8 at index 2 and 3A at index 1. It cannot find 4F but notices it should
        //be at index 2. The rule when an item isn’t found is to negate that index and subtract 1.
        //Therefore, we get –2–1, which is –3.

        //RQ26
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));//converts a String to an int primitive.
        // use autoboxing to convert an int to an Integer.
        ages.add(Integer.valueOf("6"));//valueOf() returns an Integer.converts a String to an
        //Integer wrapper class.
        ages.add(7);//use autoboxing to convert an int to an Integer.
        ages.add(null);//compiles
        for (int age : ages) System.out.print(age);
        //when the for loop tries to unbox null into an
        //int, it fails and throws a NullPointerException.

    }
}
