package Communication;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        String urlString="";

        switch (args.length) {
            case 0 -> urlString = askForUrl();
            case 1 -> urlString = args[0];
            default -> {
                System.out.println("Run the program with the desired URL or no argument at all");
                System.exit(-1);
            }
        }

        System.out.println("Checking URL "+urlString);
        if(isValidURL(urlString)){
            System.out.println(urlString+" is a well formed URL");
        }else {
            System.out.println(urlString+" is not a well formed URL");
        }
    }
    public static String askForUrl(){
        Scanner readInput=new Scanner(System.in);
        System.out.println("Please enter a valid URL");
        String url=readInput.nextLine();
        readInput.close();
        return url;
    }
    public static boolean isValidURL(String urlString){
        try {
            new URL(urlString);
            return true;
        }catch (MalformedURLException e){
            return false;
        }

    }
}
