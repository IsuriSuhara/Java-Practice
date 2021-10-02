import java.io.*;
import java.util.*;
import java.math.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String x = scan.next();
        String y = scan.next();
        BigInteger a = new BigInteger(x);
        BigInteger b = new BigInteger(y);
        
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        
    }
}
