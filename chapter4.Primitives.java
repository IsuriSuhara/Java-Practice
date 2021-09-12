public class Primitives {
    /*public void fly(int i) {
        System.out.print("int ");
    }*/
    public void fly(long l) {
        System.out.print("long ");
    }
    public static void main(String[] args) {
        Primitives p = new Primitives();
        p.fly(123);
        p.fly(123L);
        //long long
        //If we comment out the overloaded
        //method with the int parameter list, the output becomes long long. Java has no problem
        //calling a larger primitive. However, it will not do so unless a better match is not found.

    }
}
