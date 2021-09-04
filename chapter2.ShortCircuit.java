public class ShortCircuit {
    public static void main(String[] args) {
        int x = 6;
        boolean y = (x >= 6) ||(++x <= 7);
        System.out.println(x);
        //Because x >= 6 is true, the increment operator on the right-hand side of the expression
        //is never evaluated, so the output is 6.
    }
}
