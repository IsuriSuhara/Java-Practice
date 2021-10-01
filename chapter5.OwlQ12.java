interface Nocturnal {
    default boolean isBlind() { return true; }
}
public class OwlQ12 implements Nocturnal {
    public boolean isBlind() { return false; }
    public static void main(String[] args) {
        Nocturnal nocturnal = (Nocturnal)new OwlQ12();
        System.out.println(nocturnal.isBlind());//false
        }
}

