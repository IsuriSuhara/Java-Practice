import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        int[] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
             System.out.print (numbers[i] + " ");//1 6 9
        System.out.println();

        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + " ");//10 100 9
        /*The problem is that String sorts in alphabetic order, and 1 sorts before 9.
        (Numbers sort before letters and uppercase sorts before lowercase, in case you
        were wondering.)*/
        //custom sort orders can be done using something called a comparator
    }
}
