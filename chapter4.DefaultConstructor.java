public class DefaultConstructor {
    public DefaultConstructor(){}
    public static void main(String[] args) {
        Rabbit1 r1 = new Rabbit1();
        Rabbit2 r2 = new Rabbit2();
        Rabbit3 r3 = new Rabbit3(true);
        //Rabbit4 r4 = new Rabbit4(); // DOES NOT COMPILE

    }

}
class Rabbit1 {
}//Only Rabbit1 gets a default no-argument constructor
class Rabbit2 {
    public Rabbit2() { }
}
class Rabbit3 {
    public Rabbit3(boolean b) { }
}
class Rabbit4 {
    private Rabbit4() { }
}
//Having a private constructor in a class tells the compiler not to provide a default noargument
//constructor. It also prevents other classes from instantiating the class. This is
//useful when a class only has static methods or the class wants to control all calls to create
//new instances of itself.
