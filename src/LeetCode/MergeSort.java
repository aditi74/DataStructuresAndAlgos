package LeetCode;

/**
 * Created by 61310444 on 9/3/2016.
 */
public class MergeSort {

    /* The task is to complete merge() which is used
       in below mergeSort() */
/*   l is for left index and r is right index of the
   sub-array of arr to be sorted */
    void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    // Merges two subarrays of arr[].  First subarray is arr[l..m]
// '[;S+econd subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r) {
        // Your code he

        int left = m-l+1;
        int right = r-m;
        int k=l;

        int[] L= new int[left];
        int[] R= new int[right];

        for (int i=0;i<left;i++)
        {
            L[i]=arr[l];
            l++;
        }

        for (int j=0;j<right;j++)
        {
            R[j]=arr[m+1];
            m++;
        }

        //int k=l;
        int i=0,j=0;

        while (i < left && j < right) {
            if (L[i] < R[j]) {

                arr[k]=L[i];
                i++;
            }
            else {
                arr[k]=R[j];
                j++;
            }
            k++;

        }


        while(i<left)
        {
            arr[k]=L[i];
            k++;
            i++;
        }
        while (j<right)
        {
            arr[k]=R[j];
            k++;
            j++;
        }


    }

    public static void main(String[] args) {
        int[]
                arr= {2,7,4,3,2};


        MergeSort mergeSort= new MergeSort();
        mergeSort.mergeSort(arr,0,4);
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }


}