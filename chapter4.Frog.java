interface CanHope{}
public class Frog implements CanHope{
    public static void main(String[] args) {
        CanHope frog0 = new TurtleFrog();
        Frog frog1 = new TurtleFrog();
        TurtleFrog frog2 = new TurtleFrog();
        Object frog3 = new TurtleFrog();
    }
}
class BrazilianHornedFrog extends Frog {}
class TurtleFrog extends Frog {}
