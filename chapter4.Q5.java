public class Q5 {
    public static int howMany(boolean b, boolean... b2) {
        System.out.println(b2.length);

        return b2.length;
    }

    public static void main(String[] args) {
        howMany(true);
        howMany(true,true);
        howMany(true,true,true);
        howMany(true,new boolean[2]);
        //howMany(true, {true, true});
        //howMany(true, {true});
    }
}
