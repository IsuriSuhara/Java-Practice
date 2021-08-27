public class Hi {
    public static void main(String[] args)
    {
        Hi j = new Hi();

        // Calling finalize method Explicitly.
        j.finalize();

        j = null;

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
//Output:finalize method overriden
//       Exception in thread "main" java.lang.ArithmeticException: / by zero
//	        at Hi.finalize(Hi.java:20)
//	        at Hi.main(Hi.java:7)
