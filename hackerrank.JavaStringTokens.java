import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
         s = s.trim();//Returns a string whose value is this string, with any leading and trailing whitespace removed.
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] strings = s.split("['!?,._@ ]+");
            System.out.println(strings.length);
            for (String str : strings)
                System.out.println(str);
        }
        /*String[] str = s.split("[!,?._'@\\W \\t]+");
        int i=0;
        for (int a=0;a<str.length;++a){
            //System.out.println(str[a]);
            i++;
        } 
        System.out.println(i);
        for(String a: str) System.out.println(a);*/
        
        scan.close();
    }
}

