public class CompoundAssignmentOperators {
    public static void main(String[] args) {
        int x = 2, z = 3;
        x = x * z; // Simple assignment operator
        x *= z; // Compound assignment operator

        long a = 10;
        int b = 5;
        //b = b * a; // DOES NOT COMPILE
        b *=a;
        //The compound operator will first cast x to a long, apply the multiplication of two long
        //values, and then cast the result to an int. We see that the compiler will automatically cast
        //the resulting value to the data type of the value on the left-hand side of the compound
        //operator.

        long i = 5;
        long j = (i=3);
        System.out.println(i); // Outputs 3
        System.out.println(j); // Also, outputs 3
    }
}
