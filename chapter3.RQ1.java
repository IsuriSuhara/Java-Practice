public class RQ1 {
    public static void main(String[] args) {

                int numFish = 4;
                String fishType = "tuna";
                String anotherFish = numFish + 1+"";
                //String anotherFish = numFish + 1;//will not compile,can’t store an int in a String variable.
                System.out.println(anotherFish + " " + fishType);//5 tuna
                System.out.println(numFish + " " + 1);//4 1

    }
}
