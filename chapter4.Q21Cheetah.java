public class Q21Cheetah {
    int numSpots;
    public Q21Cheetah(int numSpots) {
// INSERT CODE HERE
        this.numSpots = numSpots;
    }
    public static void main(String[] args) {
        System.out.println(new Q21Cheetah(50).numSpots);
    }
    //A. numSpots = numSpots;
    //B. numSpots = this.numSpots;
    //C. this.numSpots = numSpots;
    //D. numSpots = super.numSpots;
    //E. super.numSpots = numSpots;
    //F. None of the above.

    //C. Within the constructor numSpots refers to the constructor parameter. The instance
    //variable is hidden because they have the same name. this.numSpots tells Java to use
    //the instance variable. In the main() method, numSpots refers to the instance variable.
    //Option A sets the constructor parameter to itself, leaving the instance variable as 0.
    //Option B sets the constructor parameter to the value of the instance variable, making
    //them both 0. Option C is correct, setting the instance variable to the value of the constructor
    //parameter. Options D and E do not compile.
}
