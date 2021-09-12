public class ParsingData {
    public static void main(String[] args) {
        int num = 4;
        newNumber(5);//8
        System.out.println(num); // 4

        String name = "Webby";
        speak(name);//Sparky
        System.out.println(name);//Webby

        StringBuilder name1 = new StringBuilder();
        speak(name1);//Webby
        System.out.println(name1); // Webby
        System.out.println();

        int original1 = 1;
        int original2 = 2;
        swap(original1, original2);
        System.out.println(original1); // 1
        System.out.println(original2); // 2
        }
    public static void newNumber(int num) {
        num = 8;
        System.out.println(num);
        }
    public static void speak(String name) {
        name = "Sparky";
        System.out.println(name);
    }
    public static void speak(StringBuilder s) {
        s.append("Webby");
        System.out.println(s);
    }
    //s is a copy of the variable name. Both point to the same
    //StringBuilder, which means that changes made to the StringBuilder are available to
    //both references.
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:"+a+" b:"+b);
    }
}

