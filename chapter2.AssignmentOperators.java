public class AssignmentOperators {

    public static void main(String[] args) {
        /*
        int x = 1.0; // DOES NOT COMPILE
        short y = 1921222; // DOES NOT COMPILE
        int z = 9f; // DOES NOT COMPILE
        long t = 192301398193810323; // DOES NOT COMPILE
         */

        int a = 1;
        double b = 1.0;
        int c = 1921222;
        int d = 9;
        float e = 9f;
        long f = 192301398193810323L;

        //Casting Primitive values
        int x = (int)1.0;
        short y = (short)1921222; // Stored as 20678
        int z = (int)9L;
        long t = 192301398193810323L;
        System.out.println(x+" "+y+" "+z+" "+t);
    }
}
