public class Mouse {
    static int MAX_LENGTH = 5;
    int length;
    public int grow(int inches) {
         if (length < MAX_LENGTH) {
             int newSize = length + inches;
             length = newSize;
             }
        System.out.println(length);
        return inches;
    }

    public static void main(String[] args) {
        Mouse myMouse = new Mouse();
        System.out.println(myMouse.grow(2));
    }
}
