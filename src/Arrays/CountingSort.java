package Arrays;

/**
 * Created by 61310444 on 5/3/2016.
 *
 * create 2 temp arrays O(K ) space and O(n) time complexity
 */
public class CountingSort {


    public static void main(String[] args) {

        int[] arr= {1, 4, 1, 2, 7, 5, 2};
        countingSort(arr,9);


    }


    /*
      1) create temp arr1  index count, size of arr.length -- it will hold the count of each number at specific location
      2) initialize it to 0;
      3) Traverse the arr,and update the indexCount depending on the location of each num
      4) Modify the index count array such that each element at each index
  stores the sum of previous counts.
      5) Create a new sorted array and Output each object from the input sequence followed by
  decreasing its count by 1.


     */
    public  static void countingSort(int[] arr,int k) //k --> data ranges will less than this number
    {
      int[] indexCount= new int[k];
        int sum =0;
      for (int i=0;i<k;i++)
           indexCount[i]=0;

      //
      for (int i=0;i<arr.length;i++)
      {
          indexCount[arr[i]]++;
      }


      for (int i =1;i< k;i++)
      {
        indexCount[i] = indexCount[i-1] + indexCount[i];
      }

        int[] sortedArray= new int[arr.length];
        for(int j=arr.length-1;j>=0;j--)
        {
            sortedArray[indexCount[arr[j]]-1]=arr[j];
            indexCount[arr[j]]=indexCount[arr[j]]-1;

        }

        for(int i=0;i<sortedArray.length;i++)
        {
            System.out.println(sortedArray[i]);
        }

    }


}
