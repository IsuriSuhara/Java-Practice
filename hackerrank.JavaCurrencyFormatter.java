import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//import java.text.NumberFormat;
//import java.text.DecimalFormat;

public class Solution {
    //public static String currencyIndia(double myDouble){
    //    NumberFormat df = new DecimalFormat("#,###,###,###.##");
    //    double roundOff = Math.ceil(myDouble);
    //    String newNumber=df.format(roundOff); 
    //    return newNumber;
    //}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double myNumber = scanner.nextDouble(); 
        scanner.close();
        Locale indiaLocale = new Locale("en", "IN");
        //https://docs.oracle.com/cd/E13214_01/wli/docs92/xref/xqisocodes.html
        //country code of Sri Lanka:LK
        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);  
        NumberFormat nfIndia = NumberFormat.getCurrencyInstance(indiaLocale);
         NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
         NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
         
         System.out.println("US: "+nfUS.format(myNumber));
         System.out.println("India: "+nfIndia.format(myNumber));
         System.out.println("China: "+nfChina.format(myNumber));
         System.out.println("France: "+nfFrance.format(myNumber));
         
         //Symbol font of  china is a bit different in Java 15.a bit little and bold like us doller symbol.
    }
}
