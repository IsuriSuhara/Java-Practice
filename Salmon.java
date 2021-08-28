public class Salmon {

    private int count;
    {System.out.println("setting field");}

    public  Salmon() {
        count=1;
        System.out.println("setting constructor");
    }
    public void Salmon() {
         count = 4;
         }
        public static void main(String[] args) {
                Salmon s = new Salmon();
                System.out.println("Count: "+ s.count);
                s.Salmon();
                System.out.println("Count: "+ s.count);
    }
}
