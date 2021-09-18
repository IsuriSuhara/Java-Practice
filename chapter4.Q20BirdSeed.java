public class Q20BirdSeed {
    private int numberBags;
    boolean call;
    public Q20BirdSeed() {
        this(2);
        call = false;
// LINE 2
    }
    public Q20BirdSeed(int numberBags) {
        this.numberBags = numberBags;
    }
    public static void main(String[] args) {
        Q20BirdSeed seed = new Q20BirdSeed();
        System.out.println(seed.numberBags);
    }
}
//A. Replace line 1 with BirdSeed(2);
//B. Replace line 2 with BirdSeed(2);
//C. Replace line 1 with new BirdSeed(2);
//D. Replace line 2 with new BirdSeed(2);
//E. Replace line 1 with this(2);
//F. Replace line 2 with this(2);

//E. Options A and B will not compile because constructors cannot be called without
//new. Options C and D will compile but will create a new object rather than setting the
//fields in this one. Option F will not compile because this() must be the first line of a
//constructor. Option E is correct.
