import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>(x);
        for(int i = 0; i < x; i++){
            int s=sc.nextInt();  
            list.add(s);
        }
        int y =sc.nextInt();
        for(int i = 0; i < y; i++){
            String str=sc.next();    
            if (str.equals("Insert")){
                int f = sc.nextInt();
                int l = sc.nextInt();         
                list.add(f,l);       
            }
            if(str.equals("Delete")){
                int f = sc.nextInt();
                list.remove(f);
                
            }
        }
        for(int i:list){
            System.out.print(i+" ");
        }
        
        }
}
