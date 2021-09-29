import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        System.out.println(a.length()+b.length());
        if (a.compareTo(b)>0) System.out.println("Yes");//to check A is lexicographically greater than B
        else System.out.println("No");
        
        //retrieving char at zero index.
        char c =a.charAt(0);
        char d =b.charAt(0);
        
        //convert java character to upper case
        char x =Character.toUpperCase(c);
        char y =Character.toUpperCase(d);
        
        //valueOf is to convert the char to String
        String a2 =a.replaceFirst(String.valueOf(c),String.valueOf(x));
        String b2 =b.replaceFirst(String.valueOf(d),String.valueOf(y));
        System.out.print(a2+" "+b2);
    }
}
