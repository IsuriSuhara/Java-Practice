import java.io.*;
import java.util.*;
import java.util.stream.*;

public class JavaSubarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                int[] subarray = Arrays.copyOfRange(b, j, i+1);
                int sum = IntStream.of(subarray).sum();
                if(sum<0){
                count++;
                }
            }   
        }
        System.out.println(count);
    }
}

