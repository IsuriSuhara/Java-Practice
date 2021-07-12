package BioinformaticsChallenges;
import java.util.Scanner;
public class Ants {
    private static int month;
    private final static int anteaterEat=7000;
    public static void count_ants(int antCount, int NumberOfMonths){
        while(month<=NumberOfMonths){
            if (antCount>28000){
                antCount =((antCount/100)*31)+antCount;
            }
            else{
                antCount = ((antCount/100)*40)+antCount;
            }
            antCount-=anteaterEat;
            month +=1;
        }
        if (antCount<=0){
            System.out.println("There are not any ants in the island after "+NumberOfMonths+" months. " +
                    "Final winner is the anteater, but it will die soon without food.");
        }
        else {
            System.out.println("There are " + antCount + "ants in the island after " + NumberOfMonths + " months.");
        }
    }

    public static void main (String... args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the starting number of ants");
        int antCountGiven=in.nextInt();
        System.out.println("Enter the number of months for calculation");
        int NumberOfMonthGiven=in.nextInt();
        count_ants(antCountGiven,NumberOfMonthGiven);

    }
}
