public class OverloadingConstructors {
    //You can have multiple constructors
    //in the same class as long as they have different method signatures.
    //constructors must have different parameters in order to be overloaded.
    private String color;
    private int weight;
    public OverloadingConstructors(int weight) { // first constructor
        //System.out.println("in constructor");
        this(weight, "brown");//If you choose to call it, the this() call
        //must be the first noncommented statement in the constructor.
        //this.weight = weight;
        //color = "brown";
    }
    public OverloadingConstructors(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }
}
