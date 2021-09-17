public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }

    //an interface specifies the methods that our class needs to implement:
    public interface CheckTrait {
        boolean test(Animal a);
    }

    public static class CheckIfHopper implements CheckTrait {
        public boolean test(Animal a) {
            return a.canHop();
        }
    }
}
