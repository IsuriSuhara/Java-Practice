public class Overloading {
    public void fly(int numMiles) {
        System.out.println("INT");
    }
    
    public void fly(short numFeet) {
        System.out.println("short");
    }
    
    public void fly(int[] lengths) {for (int l:lengths) System.out.print(l+" ");
    System.out.println();}

    public void fly1(int... lengths) {for (int l:lengths) {System.out.print(+l+" ");}
    System.out.println("\nYou can only call the varargs version with stand-alone parameters:fly(1, 2, 3);");}
    
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.fly(3);//INT
        //short is converted to int by java
        obj.fly(new int[] { 1, 2, 3 });
        obj.fly1(1, 2, 3);

    }
}
