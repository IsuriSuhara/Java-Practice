import java.io.*;
import java.util.*;

public class JavaExceptionHandling {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner sc =new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);
            sc.close();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");        
        }
        
    }
}
