import java.util.ArrayList;
import java.util.List;

public class CreatingArrayList {
    public static void main(String[] args) {
        //old pre–Java 5 way of creating an
        //ArrayList. They still work and you still need to know they work
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);
        //The final example tells Java that we
        //want to make a copy of another ArrayList. We copy both the size and contents of that
        //ArrayList.

        //Java 5 introduced generics, which allow you to specify the type
        //of class that the ArrayList will contain.
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();
        //Java 5 allows you to tell the compiler what the type would be by specifying it between <
        //and >. Starting in Java 7, you can even omit that type from the right side. The < and > are
        //still required, though. This is called the diamond operator because <> looks like a diamond.

        //Just when you thought you knew everything about creating an ArrayList, there is one
        //more thing you need to know. ArrayList implements an interface called List. In other
        //words, an ArrayList is a List. You will learn about interfaces in Chapter 5. In the meantime,
        //just know that you can store an ArrayList in a List reference variable but not vice
        //versa. The reason is that List is an interface and interfaces can’t be instantiated.
        List<String> list6 = new ArrayList<>();
        //ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE
    }
}
