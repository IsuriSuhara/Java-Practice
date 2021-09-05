final public class Immutable {
    //immutable classes in Java are final, and subclasses can’t add mutable behavior.
    final private String s = "name";
    public String getS() { return s; }
    //You can even make the instance variable final so the compiler reminds
    //you if you accidentally change s.

    public static void main(String[] args) {
        Immutable myImmutable = new Immutable();
        System.out.println(myImmutable.getS());
    }
}
