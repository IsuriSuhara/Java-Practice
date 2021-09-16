public class YetMoreInitializationOrder {
    static { add(2); }
    static void add(int num) { System.out.print(num + " "); }
    YetMoreInitializationOrder() { add(5); }
    static { add(4); }
    { add(6); }
    static { new YetMoreInitializationOrder(); }
    { add(8); }
    public static void main(String[] args) { }//2 4 6 8 5
    //There are three static blocks: on lines 2, 5, and 7.
    //They run in that order. The static block on line 2 calls the add() method, which prints 2.
    //The static block on line 5 calls the add() method, which prints 4. The last static block,
    //on line 7, calls new to instantiate the object. This means we can go on to rule 3 to look at
    //the instance variables and instance initializers. There are two of those: on lines 6 and 8.
    //They both call the add() method and print 6 and 8, respectively. Finally, we go on to rule 4
    //and call the constructor, which calls the add() method one more time and prints 5.
}
