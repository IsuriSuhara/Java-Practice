import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ConversionBetweenArrayAndList_Sorting {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        //an ArrayList knows how to convert itself to an array.The only problem
        //is that it defaults to an array of class Object. This isn’t usually what you want.

        System.out.println(objectArray.length); // 2
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length); // 2
        //specifi es the type of the array and does what we actually want. The advantage of specifying
        //a size of 0 for the parameter is that Java will create a new array of the proper size for the
        //return value. If you like, you can suggest a larger array to be used instead. If the ArrayList
        //fi ts in that array, it will be returned. Otherwise, a new one will be created.
        System.out.println();

        String[] array = { "hawk", "robin" }; // [hawk, robin]
        List<String> list1 = Arrays.asList(array); // returns fixed size list
        //converts the array to a List. Note that it isn’t the java.util.ArrayList we’ve
        //grown used to. It is a fi xed-size, backed version of a List.

        System.out.println(list1.size()); // 2
        list1.set(1, "test"); // [hawk, test]
        //set() merely replaces an existing value. It updates both array and list because they point to the
        //same data store.
        System.out.println(list1);

        array[0] = "new"; // [new, test]
        //also changes both array and list.

        for (String b : array) System.out.print(b + " "); // new test
        //shows the array has changed to new test

        //list1.remove(1); // throws UnsupportedOperation Exception
        System.out.println();

        //A Cool Trick with Varargs
        List<String> list2 = Arrays.asList("one", "two");
        //asList() takes varargs, which let you pass in an array or just type out the String values.
        //This is handy when testing because you can easily create and populate a List on one line.
        System.out.println(list2);
        System.out.println();

        //Sorting
        //Sorting an ArrayList is very similar to sorting an array. You just use a different helper class:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers); //[5, 81, 99]
    }
}
