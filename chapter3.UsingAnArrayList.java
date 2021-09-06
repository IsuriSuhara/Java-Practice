import java.util.ArrayList;
import java.util.List;
public class UsingAnArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("hawk"); // [hawk]
        list.add(Boolean.TRUE); // [hawk, true]
        list.add(1);
        System.out.println(list); // [hawk, true,1]
        //add() does exactly what we expect: it stores the String in the no longer empty
        //ArrayList. It then does the same thing for the boolean. This is okay because we didn’t
        //specify a type for ArrayList; therefore, the type is Object

        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        //safer.add(Boolean.TRUE); // DOES NOT COMPILE
        //This time the compiler knows that only String objects are allowed in and prevents the
        //attempt to add a boolean.

        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add(1, "robin"); // [hawk, robin]
        birds.add(0, "blue jay"); // [blue jay, hawk, robin]
        birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
        System.out.println(birds); // [blue jay, cardinal, hawk, robin]

        List<String> birds1 = new ArrayList<>();
        birds1.add("hawk"); // [hawk]
        birds1.add("hawk"); // [hawk, hawk]
        System.out.println(birds1.remove("cardinal")); // prints false
        System.out.println(birds1.remove("hawk")); // prints true
        System.out.println(birds1);
        System.out.println(birds1.remove(0)); // prints hawk
        System.out.println(birds1); // []

        //There is also a removeIf() method.

        //The set() method changes one of the elements of the ArrayList without changing the size.
        List<String> birds2 = new ArrayList<>();
        birds2.add("hawk"); // [hawk]
        System.out.println(birds2.size()); // 1
        birds2.set(0, "robin"); // [robin]
        System.out.println(birds2.size()); // 1
        //birds2.set(1, "robin"); // IndexOutOfBoundsException
        //tries to replace an element that isn’t in the ArrayList.
        //Since the size is 1, the only valid index is 0.
        System.out.println();

        System.out.println(birds2.isEmpty()); // false
        System.out.println(birds2.size()); // 1
        birds2.add("hawk"); // [robin,hawk]
        birds2.add("hawk"); // [robin,hawk, hawk]
        System.out.println(birds2);//[robin, hawk, hawk]
        System.out.println();

        birds2.clear(); // []
        System.out.println(birds2.isEmpty()); // true
        System.out.println(birds2.size()); // 0
        //The clear() method provides an easy way to discard all elements of the ArrayList.
        //After we call clear(), birds is back to being an empty ArrayList of size 0.
        System.out.println();

        System.out.println(birds.contains("hawk")); // true
        System.out.println(birds.contains("eagle")); // false
        System.out.println();

        //ArrayList has a custom implementation of equals() so you can compare two lists
        //to see if they contain the same elements in the same order.
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two)); // true
        one.add("a"); // [a]
        System.out.println(one.equals(two)); // false
        two.add("a"); // [a]
        System.out.println(one.equals(two)); // true
        one.add("b"); // [a,b]
        two.add(0, "b"); // [b,a]
        System.out.println(one.equals(two)); // false

        //we don’t use the capacity in determining size or
        //length. After adding elements, the size becomes positive and it is no longer empty.
    }
}
