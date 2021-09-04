public class NumericPromotion {
    public static void main(String[] args) {
        long x = 1L;
        long y = 33L;
        System.out.println(x*y);
        //Output: 33
        int a = 1;
        long b = 33;
        System.out.println(a*b);
        //Output: 33

        double c = 39.21;
        double d = 2.1;
        System.out.println(c+d);
        //Output: 41.31
        double e = 39.21;
        float f = 2.1f;
        System.out.println(e+f);
        //Output:41.30999990463257

        short g = 14;
        float h = 13;
        double i = 30;
        System.out.println(g*h/i);
        //g will automatically be promoted to int.The promoted g value will
        // then be automatically promoted to a float so that it can be multiplied with h.
        //The result of x * y will then be automatically promoted to a double,
        //so that it can be multiplied with z,
    }
}
