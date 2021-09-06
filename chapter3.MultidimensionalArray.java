public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] vars1; // 2D array
        int vars2 [][]; // 2D array
        int[] vars3[]; // 2D array
        int[] vars4 [], space [][]; // a 2D AND a 3D array

        //You can specify the size of your multidimensional array in the declaration if you like:
        String [][] rectangle = new String[3][2];
        rectangle[0][1] = "set";

        int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
        //We still start with an array of three elements. However, this time the elements in the
        //next level are all different sizes. One is of length 2, the next length 1, and the last length 3.
        //This time the array is of primitives, so they are shown as if they are in the
        //array themselves.

        //Another way to create an asymmetric array is to initialize just an array’s fi rst dimension,
        //and define the size of each array component in a separate statement:
        int [][] arg = new int[4][];
        arg[0] = new int[5];
        arg[1] = new int[3];

        int[][] twoD =  {{1,2},{3,4},{5,6}};
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println(); // time for a new row
        }
        /*Output:
            1 2
            3 4
            5 6     */
        System.out.println();

        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }
        /*Output:
            1 2
            3 4
            5 6     */

    }
}
