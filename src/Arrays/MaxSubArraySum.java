package Arrays;

/**
 * Created by 61310444 on 5/6/2016.
 */
/**maximum-subarray-sum**/
/*  Using Kadane Algo**/
public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr= {2, -9, 5, 1, -4, 6, 0, -7, 8};
        int max=maxSubArraySum(arr);
        System.out.println("Max SubSum arr"+max);
    }
  /*add arr[i] to the curr sum , if curr_sum <0 ,initialize curr_sum=0**/
    public static int maxSubArraySum(int[] arr)
    {

        int curr_sum=0,max_sum=0;
        for (int i=0;i<arr.length;i++)
        {
          curr_sum+=arr[i];

          if (max_sum<curr_sum)
          {
              max_sum=curr_sum;
          }

          if (curr_sum<0)
          {
              curr_sum=0;
          }

        }
        return max_sum;
    }

}
