import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        int len=s.length()-(k-1);
        String[] words=new String[len];
        for(int i=0;i<len;i++){           
                words[i]=s.substring(i,i+k);          
        }   
        /*
        for(int i=0;i<words.length-1;++i){
            for(int j=i+1;j<words.length;++j){
               if((words[i].compareTo(words[j]))>0) 
                {     
                smallest = words[j];
                words[i] = smallest;
                }    
                else
                {
                smallest = words[i];
                words[i] = smallest;
                } 
            }
            smallest=words[0]; 
        }
        for(int i=0;i<words.length-1;++i){
            for(int j=i+1;j<words.length;++j){
               if((words[i].compareTo(words[j]))>0) 
                {     
                largest = words[i];
                words[i] = largest;
                }    
                else
                {
                largest = words[j];
                words[i] = largest;
                } 
            }
            largest=words[0]; 
        }*///not complte
        
        //ordered array
        for(int i = 0; i < words.length-1; ++i) {  
         for (int j = i + 1; j < words.length; ++j) {  
            if (words[i].compareTo(words[j]) > 0) {  
               String temp = words[i];  
               words[i] = words[j];  
               words[j] = temp;  
            }  
         }  
      }
         smallest=words[0];
         largest=words[words.length-1];
        return smallest + "\n" + largest;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
