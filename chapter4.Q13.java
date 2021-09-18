public class Q13 {
    private static final String leftRope;
    private static final String rightRope;
    //private static final String bench;//DOES NOT COMPILE
    private static final String name = "name";
    static {
        leftRope = "left";
        rightRope = "right";
        }
    static {
        //name = "name";//DOES NOT COMPILE
        //rightRope = "right";//DOES NOT COMPILE
        }
    public static void main(String[] args) {
        //bench= "bench";//DOES NOT COMPILE
    }

    //static final variables must be set exactly once, and it must be in the declaration
    //line or in a static initialization block. Line 4 doesn’t compile because bench is not set
    //in either of these locations. Line 15 doesn’t compile because final variables are not
    //allowed to be set after that point. Line 11 doesn’t compile because name is set twice:
    //once in the declaration and again in the static block. Line 12 doesn’t compile because
    //rightRope is set twice as well. Both are in static initialization blocks.
}
