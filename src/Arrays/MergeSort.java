package Arrays;


public class MergeSort {

// complexity : O(nlogn)
    public static void main(String[] args) {

        int[] arr={6,2,3,1,9,10,15,13,12,17};
        MergeSort sort=new MergeSort();
      sort.MergeSort(arr, arr.length);
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }


    }

 // Create 2 arrays Left and Right
    public  void MergeSort(int[] arr,int length) // length of the arr
    {
         int mid;
         if (length < 2) return;
         mid=length/2;

        int[] left= new int[mid];
        int[] right= new int[length -mid];

        for (int i=0;i< mid;i++)
        {
            left[i]=arr[i];
        }

        for (int i=mid;i<length;i++)
        {
            right[i-mid]=arr[i];
        }

        MergeSort(left,mid);
        MergeSort(right, length - mid);
        Merge(arr,left,mid,right,length-mid);


    }

    public  void Merge(int[] arr,int[] left,int leftLength,int[] right,int rightLength)
    {
       int i=0,j=0,k=0;  // i= for comparing left array, j= for comparing right array , k =for final array

        while (i<leftLength && j<rightLength)
        {
            if (left[i]<right[j])
            {
                arr[k]=left[i];
                i++;

            }
            else
            {
                arr[k]=right[j];
                j++;
            }
            k++;
        }

          while (i<leftLength)
          {
              arr[k]=left[i];
              i++;
              k++;
          }

          while (j<rightLength)
          {
              arr[k]=right[j];
              j++;
              k++;
          }





    }
}
