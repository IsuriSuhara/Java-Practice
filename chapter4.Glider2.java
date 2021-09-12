public class Glider2 {
    public static String glide(String s) {
        return "1";
    }
    public static String glide(String... s) {
        return "2";
    }
    public static String glide(Object o) {
        return "3";
    }
    public static String glide(String s, String t) {
        return "4";
    }

    public static void play(Long l) { }
    public static void play(Long... l) { }
    public static void main(String[] args) {
        System.out.print(glide("a"));//1
        System.out.print(glide("a", "b"));//4
        System.out.print(glide("a", "b", "c"));//2
        //The fi rst call matches the signature taking a single String because
        //that is the most specifi c match. The second call matches the signature, taking two String
        //parameters since that is an exact match. It isn’t until the third call that the varargs version
        //is used since there are no better matches.

        //play(4); // DOES NOT COMPILE
        play(4L); // calls the Long version
        //Java is happy to convert the int 4 to a long 4 or an Integer 4.
        //It cannot handle converting in two steps to a long and then to a Long. If we had public
        //static void play(Object o) { }, it would match because only one conversion would be
        //necessary: from int to Integer. An Integer is an Object
    }
}
