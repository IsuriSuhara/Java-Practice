public class RQ2 {
    public static void main(String[] args) {
        String s = "Hello";//points to the String in the string pool
        String t = new String(s);//calls the String constructor explicitly and is therefore a different object than s.
        if ("Hello".equals(s)) System.out.println("one");//check for object equality, which is true
        if (t == s) System.out.println("two");//uses object reference equality, which is not true since we have different objects
        if (t.equals(s)) System.out.println("three");//check for object equality, which is true
        if ("Hello" == s) System.out.println("four");//true since both references point to the object from the string pool.
        if ("Hello" == t) System.out.println("five");//compares one object from the string pool with one that was explicitly
        //constructed and returns false.
        
        //one
        //three
        //four
    }
}
