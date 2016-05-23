package Arrays.TwoPointers;

import Arrays.QuickSort;

/**
 * Created by 61310444 on 5/24/2016.
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 Find all unique triplets in the array which gives the sum of zero.
 The solution set must not contain duplicate triplets.

 For example, given array S = {-1 0 1 2 -1 -4},

 A solution set is:
 (-1, 0, 1)
 (-1, -1, 2)
 */
public class ThreeSumZero {
    public static void main(String[] args) {
        int[] arr={-1, 0, 1, 2, -1, -4};
        threeSumZero(arr,0);


    }

    public static void threeSumZero(int[] arr,int target)
    {
        int i,j,k,sum;
        if (arr.length<3) return;
        QuickSort quickSort=new QuickSort();
        quickSort.QuickSort(arr,0,arr.length-1);
        for (k=arr.length-1;k>2 ;k--)
        {
            i=0;j=k-1;

            while (i<j)
            {
               sum=arr[i]+arr[j]+arr[k];

               if (sum==target)
               {
                   System.out.println(arr[i]+ ","+ arr[j] + "," + arr[k]);
               }

               if (sum>=target)
               {
                   j--;
               }
                else i++;

            }



        }

    }

}
