interface HasVocalCords {
    public abstract void makeSound();
}
interface CanBark extends HasVocalCords {
    public void bark();
}
public class testing implements CanBark{

    @Override
    public void makeSound() {
        System.out.println("I am singing");
    }

    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}
