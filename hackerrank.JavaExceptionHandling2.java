import java.util.Scanner;
class MyCalculator  {
    /*
    * Create the method long power(int, int) here.
    */
    int power(int x,int y) throws Exception{
        if (x==0 && y==0){
            throw new Exception("n and p should not be zero.");
        }
        if (x<0 || y<0){
            throw new Exception("n or p should not be negative.");
        }
        else{
            int result = (int)Math.pow(x,y);
            return result;
        }
        
        
    }
    
}

public class JavaExceptionHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
