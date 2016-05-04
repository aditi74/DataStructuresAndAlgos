package Arrays;

/**
 * Created by 61310444 on 5/3/2016.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr={6,2,3,1,9,10,15,13,12,17};
        QuickSort qs= new QuickSort();
        qs.QuickSort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }


    }


    public void QuickSort(int[] arr,int start,int end)
    {
         if(start<end)
         {
            int pIndex= Partition(arr,start,end);
            QuickSort(arr,start,pIndex-1);
            QuickSort(arr,pIndex+1,end);
         }


    }


    public int Partition(int[] arr,int start,int end)
    {
        int pivot=arr[end];
        int pIndex= start;


        for (int i=start;i<end;i++)
        {
            if (arr[i]<=pivot)
            {
                //swap(arr[i],arr[pIndex]);
                int temp= arr[i];
                arr[i]=arr[pIndex];
                arr[pIndex]=temp;

                pIndex=pIndex+1;
            }
        }
       // swap(arr[pIndex],pivot);
        int temp=arr[pIndex];
        arr[pIndex]=arr[end];
        arr[end]=temp;
        return pIndex;

    }


}
