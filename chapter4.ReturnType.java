public class ReturnType {
    public void walk(){
        System.out.println("Hello World");
        return;
    }
    public String walk1(){
        return "";
    }
    String walk6(int a) {
        if (a == 4) {
            return "Try a different one too";
        }else{
            return "Welcome";}
    }//without "else" only if block will not compile.
    public static void run(int... nums) {
        System.out.println(nums[1]);
        ReturnType myWalk = new ReturnType();
        myWalk.walk6(6);
        }
    public static void main(String[] args) {
        ReturnType myWalk = new ReturnType();
        myWalk.walk();
        myWalk.walk6(6);
        new ReturnType().walk6(7);
        run(11,22);
        System.out.println(Kola.count);
        Kola k = new Kola();
        k = null;
        System.out.println(Kola.count);
        Kola.count=4;
        System.out.println(Kola.count);
        Kola kola1 = new Kola();
        kola1.count = 6;
        System.out.println(Kola.count);
    }
}
class Kola{
    static int count=0;
}
