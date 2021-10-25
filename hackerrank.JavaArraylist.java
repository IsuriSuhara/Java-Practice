import java.io.*;
import java.util.*;

public class JavaArraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<List> bigtest = new ArrayList<List>(x);
        for(int i=1;i<=x;i++){
            int y=sc.nextInt();
            ArrayList<Integer> test = new ArrayList<Integer>();
            for(int j=0;j<y;j++){
                test.add(j,sc.nextInt());
            }
            bigtest.add(test);
        }
        int z = sc.nextInt();
        for(int i =0; i < z; i++){
            try{    
            int p = sc.nextInt();
            int q = sc.nextInt();
            System.out.println(bigtest.get(p-1).get(q-1));
        }
        catch(Exception e){
               System.out.println("ERROR!");      
        }
        }
        
        
    }
}
