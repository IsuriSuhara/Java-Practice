public class Hello2 {
    public static void main(String[] args)
    {
        Hello2 s = new Hello2();
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
//Output: finalize method overriden
//        Main Completes
