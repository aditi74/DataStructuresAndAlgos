package Arrays;

/**
 * Created by 61310444 on 5/15/2016.
 * Given an array of positive integers.
 * All numbers occur even number of times except one number which occurs odd number of times.
 * Find the number in O(n) time & constant space.
 */
public class OddAppearElement {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 2, 3, 1, 3};
        System.out.println(usingXOR(arr));


    }

    public static int usingXOR(int[] arr)
    {
        int X=0;

        for (int i=0;i<arr.length;i++)
        {
            X=X^arr[i];
        }

        return X;
    }
}
