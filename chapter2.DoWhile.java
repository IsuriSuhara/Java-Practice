public class DoWhile {
    public static void main(String[] args) {
        /*
        do {
            int y = 1;
            System.out.print(y++ + " ");
            } while(y <= 10);//DO NOT COMPILE

         */
        int x = 0;
        do {
            x++;
        } while(false);
        System.out.println(x); // Outputs 1
        int y=20;
        while(y > 10) {
            y--;
            System.out.print(y+",");//Outputs: 19,18,17,16,15,14,13,12,11,10,
        }
        System.out.println();
        int z = 20;
        if(z > 10) {
            do {
                z--;
                System.out.print(z+",");//Outputs: 19,18,17,16,15,14,13,12,11,10,
            } while(z > 10);
        }
        System.out.println();
        int c = 15;
        if(c > 10) {
            do {
                c--;
                System.out.print(c+" ");
            } while(c > 10);
        } else {
            c++;
            System.out.print(c+" ");
        }
        //Output:14 13 12 11 10 
    }
}
