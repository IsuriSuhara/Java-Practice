public class Hello {
    public static void main(String[] args)
    {
        String s = new String("RR");
        s = null;

        // Requesting JVM to call Garbage Collector method
        System.gc();
        System.out.println("Main Completes");
    }

    // Here overriding finalize method
    @Override
    public void finalize()
    {
        System.out.println("finalize method overriden");
    }
}
//Output: Main Completes
//s = null and ‘s’ is the object of String class, so String class
// finalize method is going to be called and not our class(i.e, Hello class).
