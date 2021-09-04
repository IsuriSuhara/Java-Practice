public class ArithmeticOperators {
    public static void main(String[] args) {
        int y = 4;
        double x = 3 + 2 * --y;
        System.out.println(x);
        // Output: 9.0
        x = 2 * 5 + 3 * 4 - 8;
        System.out.println(x);
        // Output: 14.0
        //int x = 2 * ((5 + 3) * 4 – 8);
        // Does not work
        System.out.print(10 / 3); // Outputs 3
        System.out.print(10 % 3); // Outputs 1
        System.out.print(11 / 3); // Outputs 3
        System.out.print(11 % 3); // Outputs 2
        System.out.print(12 / 3); // Outputs 4
        System.out.print(12 % 3); // Outputs 0


    }

}
