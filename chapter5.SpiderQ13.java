class Arthropod{
        public void printName(double input) {
                System.out.print("Arthropod"); }
        }
public class SpiderQ13 extends Arthropod{
        public void printName(int input) { System.out.print("Spider"); }

        public static void main(String[] args) {
                SpiderQ13 spider = new SpiderQ13();
                spider.printName(4);
                spider.printName(9.0);
                //SpiderArthropod
        }
}
