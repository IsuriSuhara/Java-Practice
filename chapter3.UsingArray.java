public class UsingArray {
    public static void main(String[] args) {
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length); // 3
        System.out.println(mammals[0]); // monkey
        System.out.println(mammals[1]); // chimp
        System.out.println(mammals[2]); // donkey
        System.out.println(mammals);//hash code

        String[] birds = new String[6];
        System.out.println(birds.length);//6
        //length does not consider what is in the array; it only considers how many slots have
        //been allocated.
        System.out.println();

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 5;
            System.out.print(numbers[i]+" ");}
            //sets the current element of numbers.
        System.out.println(numbers);//hash code

        /*numbers[10] = 3;
          numbers[numbers.length] = 5;
          for (int i = 0; i <= numbers.length; i++) numbers[i] = i + 5;
          The first one is trying to see if you know that indexes start with 0. Since we have 10 elements
          in our array, this means only numbers[0] through numbers[9] are valid. The second
          example assumes you are clever enough to know 10 is invalid and disguises it by using the
          length variable. However, the length is always one more than the maximum valid index.
          Finally, the for loop incorrectly uses <= instead of <, which is also a way of referring to that
          10th element.*/
    }
}
