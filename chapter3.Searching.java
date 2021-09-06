import java.util.Arrays;
public class Searching {
    public static void main(String[] args) {
        //Java also provides a convenient way to search—but only if the array is already sorted.
        int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        //searches for the index of 1. Although 1 isn’t in the list, the search can determine
        //that it should be inserted at element 0 to preserve the sorted order. Since 0 already means
        //something for array indexes, Java needs to subtract 1 to give us the answer of –1.

        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        //Although 3 isn’t in the list, it would need to be inserted at element 1 to preserve
        //the sorted order. We negate and subtract 1 for consistency, getting –1 –1, also known as
        //–2.

        System.out.println(Arrays.binarySearch(numbers, 9)); // -5
        //wants to tell us that 9 should be inserted at index 4. We again negate and
        //subtract 1, getting –4 –1, also known as –5.
        System.out.println();

        int[] numbers1 = new int[] {3,2,1};
        //the array isn’t sorted. This means the output will not be predictable.

        System.out.println(Arrays.binarySearch(numbers1, 2));//1
        //correctly gave 1 as the output

        System.out.println(Arrays.binarySearch(numbers1, 3));//-4
        //gave the wrong answer.
        // The exam creators will not expect you to know what incorrect values come
        //out. As soon as you see the array isn’t sorted, look for an answer choice about unpredictable
        //output.
        /*On the exam, you need to know what a binary search returns in various scenarios.
        Oddly, you don’t need to know why “binary” is in the name. In case you are curious, a
        binary search splits the array into two equal pieces (remember 2 is binary) and determines
        which half the target it is. It repeats this process until only one element is left.*/
    }
}
