public class ContinueAndLabel {
    public static void main(String[] args) {
        int count = 0;
        ROW_LOOP: for(int row = 1; row <=3; row++)
            for(int col = 1; col <=2 ; col++) {
            if(row * col % 2 == 0) continue ROW_LOOP;
            count++;
            }
        System.out.println(count);//Output:  2

        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
            INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }/*Output:  5	2	1	3
                    3	9	8	9
                    5	7	12	7
        */
    }
}
