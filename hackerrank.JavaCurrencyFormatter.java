//Java 8 version
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class JavaCurrencyFormatter {
     public static String currencyIndia(double myDouble){
        NumberFormat formatter = new DecimalFormat("#0,000.00");  
        String newNumber=formatter.format(myDouble);
        return newNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double myNumber = scanner.nextDouble(); 
        scanner.close();
        
        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);  
         NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
         NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
         
         System.out.println("US: "+nfUS.format(myNumber));
         System.out.println("India: "+"Rs."+JavaCurrencyFormatter.currencyIndia(myNumber));
         System.out.println("China: "+nfChina.format(myNumber));
         System.out.println("France: "+nfFrance.format(myNumber));
         
         //Symbol font of  china is a bit different in Java 15.a bit little and bold like us doller symbol.
    }
}
