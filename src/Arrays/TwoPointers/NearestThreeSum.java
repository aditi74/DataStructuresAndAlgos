package Arrays.TwoPointers;

import Arrays.QuickSort;

/**
 * Created by 61310444 on 5/24/2016.
 */
public class NearestThreeSum {
    public static void main(String[] args) {
        int[] arr={-1, 2, 1, -4};

        System.out.println(nearestSum(arr,1));
    }


    public static int nearestSum(int[] arr,int target)
    {
        QuickSort quickSort=new QuickSort();
        quickSort.QuickSort(arr,0,arr.length-1);

        int curr_diff,max_diff=111111;
        int sum=0,nearest_sum=0;

        if (arr.length<3) return 0;
        int i,j,k;
        for(k=arr.length-1;k>1;k--)
        {
            j=k-1;
            i=0;
            while (i<j)
            {
                sum=arr[i]+arr[j]+arr[k];
                curr_diff =Math.abs(target-sum);
                if (curr_diff==0)
                {
                    return sum;
                }
                if (curr_diff<max_diff){
                    max_diff=curr_diff;
                    nearest_sum=sum;
                }
                if (sum<=target){
                    i++;
                }

                else j--;

            }
        }return nearest_sum;




    }
}
