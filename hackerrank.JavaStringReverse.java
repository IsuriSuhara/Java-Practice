import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        /*byte[] strAsbyteArray = A.getBytes();
        byte[] result = new byte[strAsbyteArray.length];
        for(int i=0;i<A.length();++i){
            result[i]=strAsbyteArray[strAsbyteArray.length-i-1];
        }
        
        if(A.equals(new String(result))){
            System.out.println("Yes");
        }
        else {System.out.println("No");}*/
        StringBuilder sb = new StringBuilder(A);
        String B= sb.reverse().toString();
        String x=(A.equals(B))?"Yes":"No";
        System.out.println(x);
        
    }
}



