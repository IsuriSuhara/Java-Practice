//Order of Initialization
//1. If there is a superclass, initialize it first (we’ll cover this rule in the next chapter. For
//now, just say “no superclass” and go on to the next rule.)
//2. Static variable declarations and static initializers in the order they appear in the file.
//3. Instance variable declarations and instance initializers in the order they appear in the file.
//4. The constructor.

//four rules apply only if an object is instantiated.
public class InitializationOrderSimple {
    private String name = "Torchie";
    { System.out.println(name); }
    private static int COUNT = 0;
    static { System.out.println(COUNT); }
    static { COUNT += 10; System.out.println(COUNT); }
    public InitializationOrderSimple() {
        System.out.println("constructor");
        }
}
