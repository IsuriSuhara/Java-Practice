public class Rabbit {
    public  String name;
    public static void main(String[] args) {
        Rabbit one = new Rabbit();
        one.name = "Hawa";
        Rabbit two = new Rabbit();
        two.name="Haawi";
        Rabbit three = one;
        System.out.println(one.name+three.name);//Output: HawaHawa
        one = null;
        System.out.println(three.name);//Output: Hawa
        System.out.println(one);//Output: null
        Rabbit four = one;
        three = null;
        System.out.println(two.name);//Output: Haawi
        two = null;
        //System.out.println(two.name);//Error
        two = new Rabbit();
        System.out.println(two.name);// Output: null
        System.gc();
         }
}
