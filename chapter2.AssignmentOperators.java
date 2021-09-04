public class AssignmentOperators {

    public static void main(String[] args) {
        /*
        int x = 1.0; // DOES NOT COMPILE
        short y = 1921222; // DOES NOT COMPILE
        int z = 9f; // DOES NOT COMPILE
        long t = 192301398193810323; // DOES NOT COMPILE
         */

        int a = 1;
        double b = 1.0;
        int c = 1921222;
        int d = 9;
        float e = 9f;
        long f = 192301398193810323L;

        //Casting Primitive values
        int x = (int)1.0;
        short y = (short)1921222; // Stored as 20678
        //overflow happens.Overflow is when a number is so large that it will no longer fit
        //within the data type, so the system “wraps around” to the next lowest value and counts
        //up from there.
        int z = (int)9L;
        long t = 192301398193810323L;
        System.out.println(x+" "+y+" "+z+" "+t);

        System.out.println(2147483647+1); // -2147483648
        //Since 2147483647 is the maximum int value, adding any strictly positive value to it will
        //cause it to wrap to the next negative number.

        short i = 10;
        short j = 3;
        short k = (short)(i * j);
        //By performing this explicit cast of a larger value into a smaller data type, you are
        //instructing the compiler to ignore its default behavior. In other words, you are telling the
        //compiler that you have taken additional steps to prevent overflow or underflow. It is also
        //possible that in your particular application and scenario, overflow or underflow would
        //result in acceptable values.
        System.out.println(k);
        //short k = i * j; // DOES NOT COMPILE
        //short values are automatically
        //promoted to int when applying any arithmetic operator with the resulting value being of
        //type int. Trying to set a short variable to an int results in a compiler error.
    }
}
