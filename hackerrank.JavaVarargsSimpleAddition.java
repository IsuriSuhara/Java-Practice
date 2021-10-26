import java.io.*;
import java.util.*;
import java.util.Scanner;  

public class JavaVarargsSimpleAddition {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int e= sc.nextInt();
        int f= sc.nextInt();
        
        Add obj = new Add();
        obj.add1(a,b);
        obj.add2(a,b,c);
        obj.add3(a,b,c,d,e);
        obj.add4(a,b,c,d,e,f);
        
    }
}
class Add{
    void add1(int a,int b){
        int result=a+b;
        System.out.println(a+"+"+b+"="+result);
    }
    void add2(int a,int b,int c){
        int result=a+b+c;
        System.out.println(a+"+"+b+"+"+c+"="+result);
    }
    void add3(int a,int b,int c,int d,int e){
        int result=a+b+c+d+e;
        System.out.println(a+"+"+b+"+"+c+"+"+d+"+"+e+"="+result);
    }
    void add4(int a,int b,int c,int d,int e,int f){
        int result=a+b+c+d+e+f;
        System.out.println(a+"+"+b+"+"+c+"+"+d+"+"+e+"+"+f+"="+result);
    }
}
