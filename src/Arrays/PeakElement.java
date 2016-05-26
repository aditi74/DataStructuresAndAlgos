package Arrays;

/**
 * Created by 61310444 on 5/26/2016.
 * A peak element in an integer array is defined as an element that is greater than its neighbors.

 Given an input array where num[i] ? num[i+1], find a peak element and return its index.
 The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 You may imagine that num[-1] = num[n] = -?.
 For example, in array [2, 4, 8, 3], 8 is a peak element and your function should return the index number 2.
 */
public class PeakElement {
    public static void main(String[] args) {
        int[] arr={2,4,8,3};
        System.out.println(usingTraversal(arr));
        System.out.println(usingBinarySearch(arr,0,arr.length-1));
    }


    public static int usingTraversal(int[] arr)
    {
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]>arr[i-1])
                continue;
            else
                return i-1;
        }

        return arr.length-1;
    }

    public static int usingBinarySearch(int[] arr,int low,int high)
    {
        if (low>high)
            return -1;

        int mid=(low+high)/2;

        if ((mid==0 || arr[mid-1]<arr[mid])&& ( mid+1==arr.length ||arr[mid+1]<arr[mid]))
            return arr[mid];
        else if (arr[mid+1]> arr[mid])
            return usingBinarySearch(arr,mid+1,high);
        else
            return usingBinarySearch(arr,low,mid-1);






    }
}
