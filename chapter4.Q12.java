public class Q12 {
    private static Rope rope1=new Rope();
    private static Rope rope2=new Rope();
    {System.out.println(rope1.length);}

    public static void main(String[] args) {
        rope1.length =2;
        rope2.length=8;
        System.out.println(rope1.length);//8
    }
}
class Rope{
    public static int length=0;//The other detail is that length is static. Changes
    //from one object update this common static variable.
}
