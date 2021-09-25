import java.util.function.*;
public class Q26Panda {
    int age;
    public static void main(String[] args) {
        Q26Panda p1 = new Q26Panda();
        p1.age = 1;
        check(p1, p -> p.age < 5);//match
    }
    private static void check(Q26Panda panda, Predicate<Q26Panda> pred) {
        String result = pred.test(panda) ? "match" : "not match";
        System.out.print(result);
        }
}


