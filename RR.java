public class RR {
    public static void main(String[] args)
    {
        RR q = new RR();
        q = null;

        // Requesting JVM to call Garbage Collector method
        System.gc();
        System.out.println("Main Completes");
    }

    // Here overriding finalize method
    public void finalize()
    {
        System.out.println("finalize method overriden");
        System.out.println(10 / 0);
    }
}
//Output: Main Completes
//        finalize method overriden

// If Garbage Collector calls finalize method,
// while executing finalize method some unchecked exception rises
// then JVM ignores that exception and rest of program will be continued normally.
// So in this case the program termination is Normal and not abnormal.