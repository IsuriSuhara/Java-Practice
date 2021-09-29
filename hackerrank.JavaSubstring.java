import java.io.*;
import java.util.*;

public class JavaSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        int a =sc.nextInt();
        int b=sc.nextInt();
        String str1=str.substring(a,b);
        System.out.println(str1);
    }
}
