public class Mutable {
    private String s;
    public void setS(String newS){ s = newS; } // Setter makes it mutable
    public String getS() { return s; }
    //even though the String class is immutable, it can still be used in
    //a mutable class.

    public static void main(String[] args) {
        Mutable myMutable = new Mutable();
        myMutable.setS("ROSE");
        System.out.println(myMutable.getS());
    }
}
