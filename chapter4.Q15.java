public class Q15 {
    public void print(byte x) {
        System.out.print("byte");
    }
    public void print(int x) {
        System.out.print("int");
    }
    public void print(float x) {
        System.out.print("float");
        }
        public void print(Object x) {
        System.out.print("Object");
        }
        public static void main(String[] args) {

        Q15 t = new Q15();
        short s = 123;
        t.print(s);
        t.print(true);
        t.print(6.789);
        //intObjectObject
        }
}
//The argument on line 17 is a short. It can be promoted to an int, so print() on
//line 5 is invoked. The argument on line 19 is a boolean. It can be autoboxed to a boolean,
//so print() on line 11 is invoked. The argument on line 20 is a double. It can
//be autoboxed to a Double, so print() on line 11 is invoked. Therefore, the output is
//intObjectObject.
