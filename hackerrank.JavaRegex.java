import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class JavaRegex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
//scanner close
class MyRegex{
    String pattern;
    public MyRegex(){
    //public static boolean isValidIPAddress(String ip){
   //Regex for digit from 0 to 255.
   //String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])"; 
   String zeroTo255 = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    // Regex for a digit from 0 to 255 and
    // followed by a dot, repeat 4 times.
    // this is the regex to validate an IP address.
    String regex= zeroTo255 + "\\."+ zeroTo255 + "\\."+ zeroTo255 + "\\."+ zeroTo255;
    // Compile the ReGex
    Pattern p = Pattern.compile(regex);
    this.pattern=p.toString();
        
}
}
//Write your code here
