package Arrays;

/**
 * Created by 61310444 on 5/15/2016.
 * Given an array A[] and a number x, check for pair in A[] with sum as x
 * Let Array be {1, 4, 45, 6, 10, -8} and sum to find be 16
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] arr={1, 4, 45, 6, 10, -8};
        twoSumUsingSorting(arr,50);

    }

    public static void twoSumUsingSorting(int[] arr,int sum)
    {
        QuickSort qs=new QuickSort();
        qs.QuickSort(arr,0,arr.length-1);
        int i=0,j=arr.length-1;
        int curr_sum;

        while (i<j)
        {
            curr_sum=arr[i]+arr[j];
            if (curr_sum==sum)
            {
                System.out.println("pair found"+arr[i]+" "+arr[j]);
                return;
            }

            else if (curr_sum<sum)
                i++;
            else
                j--;
        }

        System.out.println("pair not found");
    }

    public static void usingMap(int[] arr){

    }
}
