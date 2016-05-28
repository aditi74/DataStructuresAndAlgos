package Arrays.TwoPointers;

/**
 * Created by 61310444 on 5/28/2016.
 * Find out the maximum sub-array of non negative numbers from an array.
 The sub-array should be continuous.
 That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid.

 Maximum sub-array is defined in terms of the sum of the elements in the sub-array. S
 Sub-array A is greater than sub-array B if sum(A) > sum(B).
 A : [1, 2, 5, -7, 2, 3,2,1]
 The two sub-arrays are [1, 2, 5] [2, 3].
 */
public class MaxNonNegativeSubArray {

    public static void main(String[] args) {
        int[] arr={1, 2, 5, -7, 2, 5,3,9};
        ranges(arr);

    }


    public static void ranges(int[] arr) {
        int curr_sum = 0, max_sum = 0, end_max = -1, start_max = -1, start = 0, end = 0;

        for (end = 0; end < arr.length; end++) {
            if (arr[end] > 0) {
                curr_sum = curr_sum + arr[end];

                if (curr_sum > max_sum) {
                    max_sum = curr_sum;
                    start_max = start;
                    end_max = end;
                }

                if (curr_sum == max_sum) {
                    if ((end - start) > (end_max - start_max)) {
                        start_max = start;
                        end_max = end;
                    }
                }
            } else {
                curr_sum = 0;
                start = end + 1;
            }

        }
        for(int i=start_max;i<=end_max;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


