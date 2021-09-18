public class Q11 {
    public static void swing() {
        System.out.print("swing ");
        }
        public void climb() {
        System.out.println("climb ");
    }
    public static void play() {
        swing();
        //climb();
        }
        public static void main(String[] args) {
        Q11 rope = new Q11();
        rope.play();//swing
        rope.climb();//climb
        Q11 rope2 = null;
        rope2.play();//swing
        //rope2.climb();//runtime error-Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Q11.climb()" because "rope2" is null
            //at Q11.main(Q11.java:18)
        Q11.play();//swing
        //Q11.climb();//compiler error-java: non-static method climb() cannot be referenced from a static context
        }
}
//Line 10 does not compile because static methods are not allowed to call instance
//methods. Even though we are calling play() as if it were an instance method and an
//instance exists, Java knows play() is really a static method and treats it as such. If line
//10 is removed, the code works. It does not throw a NullPointerException on line 16
//because play() is a static method. Java looks at the type of the reference for rope2 and
//translates the call to Q11.play().
