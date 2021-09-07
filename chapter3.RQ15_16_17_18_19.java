import java.util.*;
public class RQ15_16_17_18_19 {
    public static void main(String[] args) {
        //RQ15
        int[][] scores = new int[5][];//declares a legal 2D array.
        Object[][][] cubbies = new Object[3][0][5];//declares a legal 3D array.
        //String beans[] = new beans[6];//uses the variable name as if it were a type, which is clearly illegal.
        java.util.Date[] dates[] = new java.util.Date[2][];
        //int[][] types = new int[];
        //int[][] java = new int[][];
        //Last two don’t specify any size. Although it is legal to leave out the size for later
        //dimensions of a multidimensional array, the first one is required.
        //Answer:C.,E.,F.

        //RQ16
        //Arrays define a property called length. It is not a method, so parentheses are not
        //allowed.
        char[]c = new char[2];
        //int length = c.capacity;//does not compile
        //int length = c.capacity();//does not compile
        int length = c.length;
        //int length = c.length();//does not compile
        //int length = c.size;//does not compile
        //int length = c.size();//does not compile

        //RQ17
        //The ArrayList class defines a method called size().
        ArrayList l = new ArrayList();
        //int length1 = l.capacity;
        //int length2 = l.capacity();
        //int length3 = l.length;
        //int length4 = l.length();
        //int length5 = l.size;
        int length6 = l.size();

        //RQ18
        //An array is not able to change size and can have multiple dimensions. Both
        //an array and ArrayList are ordered and have indexes. Neither is immutable. The elements
        //can change in value.
        //A. An array has a fixed size.
        //C. An array allows multiple dimensions.
        //D. An array is ordered.
        //E. An ArrayList is ordered.
        //So ArrayList does not have a fixed size.ArrayList is mutable.Array is mutable.

        //RQ19
        //An array does not override equals() and so uses object equality. ArrayList does
        //override equals() and defines it as the same elements in the same order. The compiler
        //does not know when an index is out of bounds and thus can’t give you a compiler
        //error. The code will throw an exception at runtime, though.
        //B. Two ArrayLists with the same content are equal.
        //C. If you call remove(0) using an empty ArrayList object, it will compile successfully.
    }
}
