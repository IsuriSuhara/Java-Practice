public class ReturningValues {
    public static void main(String[] args) {
        int number = 1; // 1
        String letters = "abc"; // abc
        letters = letters(letters); // abcd
        number(number);//2
        System.out.println(number + letters);//1abcd
        number=number(number); // 2
        System.out.println(number + letters); // prints 2abcd
        }
    public static int number(int number) {
        number++;
        System.out.println(number);
        return number;

        }
    public static String letters(String letters) {
        letters += "d";
        return letters;
        }
}
