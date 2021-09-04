public class TernaryOperator {
    public static void main(String[] args) {
        int x = 0;
        while (x++ < 10) {
        }
       // String message = x > 10 ? "Greater than" : false;
        //In this example, the ternary operator has two expressions, one of them a String and
        //the other a boolean value. The ternary operator is permitted to have expressions that
        //don’t have matching types, but the key here is the assignment to the String reference.
        //The compiler knows how to assign the first expression value as a String, but the second
        //boolean expression cannot be set as a String; therefore, this line will not compile.
        String message = x > 10 ? "Greater than" : "Lesser than";
        System.out.println(message + "," + x);//Output: Greater than,11

        int y = 10;

        final int a;
        if(y > 5) {
            a = 2 * y;
        } else {
            a = 3 * y;
        }
        System.out.println(a);//Output: 20

        int b = (y > 5) ? (2 * y) : (3 * y);
        System.out.println(b);//Output: 20
        System.out.println((y > 5) ? 21 : "Zebra");//Output: 21
        //The System.out.println() does not care that the
        //statements are completely different types, because it can convert both to String.

        // int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE
        //the compiler does know that "Horse" is of the wrong data type and cannot be
        //assigned to an int; therefore, it will not allow the code to be compiled.
        int i = 1;
        int j = 1;
        int k = i<10 ? i++ : j++;
        System.out.println(i+","+j+","+k); // Outputs 2,1,1
    }
}

