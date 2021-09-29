import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()==b.length())
        //length() method for strings,length for arrays
        {
            for(int i=0;i<a.length();++i){
            String x = a.substring(i,i+1);
            a=a.replaceFirst(x," ");
            b=b.replaceFirst(x," ");         
            }
        }
        if(a.equals(b)) return true;
        else return false;
        
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
