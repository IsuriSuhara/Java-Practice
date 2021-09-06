public class JavaArrays {
    public static void main(String[] args) {
        int[] numbers2 = new int[] {42, 55, 99};
        int[] numbers3 = {42, 55, 99};
        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@e9e54c2
        //We can call equals() because an array is an object. It returns true because of reference
        //equality. The equals() method on arrays does not look at the elements of the array.

        String[] strings = { "stringValue" };
        //creates an array of type String.

        Object[] objects = strings;
        //doesn’t require a cast because Object a broader type than String.

        String[] againStrings = (String[]) objects;
        //a cast is needed because we are moving to a more specific type.

        //  againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
        //doesn’t compile because a String[] only allows String objects and StringBuilder is not a String.

        objects[0] = new StringBuilder(); // careful!
        /*From the point of view of the compiler, this is just
        fine. A StringBuilder object can clearly go in an Object[]. The problem is that we don’t
        actually have an Object[]. We have a String[] referred to from an Object[] variable. At
        runtime, the code throws an ArrayStoreException. You don’t need to memorize the name
        of this exception, but you do need to know that the code will throw an exception.*/
    }
}
