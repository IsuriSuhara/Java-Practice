public class ReferenceTypes {
    public void fly(String s) {
        System.out.print("string ");
    }

    public void fly(Object o) {
        System.out.print("object ");
    }

    public static void main(String[] args) {
        ReferenceTypes r = new ReferenceTypes();
        r.fly("test");
        r.fly(56);
        //The answer is "string object". The fi rst call is a String and fi nds a direct match.
        //There's no reason to use the Object version when there is a nice String parameter list just
        //waiting to be called. The second call looks for an int parameter list. When it doesn't fi nd
        //one, it autoboxes to Integer. Since it still doesn't find a match, it goes to the Object one.
    }
}
