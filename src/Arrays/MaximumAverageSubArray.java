package Arrays;

/**
 * Created by 61310444 on 5/7/2016.
 * Given an integer array and a number k, print the maximum sum subarray of size k.
 Maximum average subarray of size k is a subarray (sequence of contiguous elements in the array) for which the average is maximum among all subarrays of size k in the array.
 Average of k elements = (sum of k elements)/k
 Since k > 0, the maximum sum subarray of size k will also be maximum average subarray of size k.
 So, the problem reduces to finding maximum sum subarray of size k in the array.
 */
public class MaximumAverageSubArray {
    public static void main(String[] args) {
        int[] input= {11, -8, 16, -7, 24, -2, 3};
        System.out.println(maxAverageArray(input, 3));

    }

    public static int  maxAverageArray(int[] arr,int k)
    {
       if (arr.length<k)
       {
           System.out.println("Invalid Argument");
           return 0;
       }

        int curr_sum=0,max_sum=0;
         for (int i=0;i<k;i++)
         {
             curr_sum+=arr[i];
         }


        for (int i=k;i<arr.length;i++)
        {
          curr_sum = curr_sum+arr[i]-arr[i-k];

          if (curr_sum>max_sum)
          {
              max_sum=curr_sum;
          }

        }
        return max_sum;




    }



}
