public class Bye {
    public static void main(String[] args)
    {
        Bye m = new Bye();

        // Calling finalize method Explicitly.
        m.finalize();
        m.finalize();
        m = null;

        // Requesting JVM to call Garbage Collector method
        System.gc();
        System.out.println("Main Completes");
    }

    // Here overriding finalize method
    public void finalize()
    {
        System.out.println("finalize method overriden");
    }
}
//Output:finalize method overriden
//       finalize method overriden
//       Main Completes
//       finalize method overriden

//We can call finalize method Explicitly then it will be
// executed just like normal method call but object won’t be deleted/destroyed