package Heaps;

import Arrays.QuickSort;

/**
 * Created by 61310444 on 5/19/2016.
 *  Given an array of N numbers which are unsorted, find K smallest elements in that array.
 *  For example if the array A = [3,4,8,6,5,1,2,3,5], and if K =3;
 *  then K smallest elements in this array are 1,2 and 3.
 */
public class KthSmallestElement {
    public static void main(String[] args) {
        int[] A = {3,4,8,6,5,1,2,3, 5};
        //usingSorting(A,3);
       // usingHeap(A,3);
        usingTwoHeaps(A,2);

    }

    public static void usingSorting(int[] arr,int k)
    {
        QuickSort quickSort=new QuickSort();
        quickSort.QuickSort(arr, 0, arr.length - 1);  //O(nlogn) Time complexity
        for(int i=0;i<k;i++)
            System.out.println(arr[i]);

    }

    public static void usingHeap(int[] arr,int k )// O(n)+O(klogn)  heapify operation costs logn called K times
    {
      //Create heap
        MinHeap heap=new MinHeap(arr.length);
        heap.buildHeap(arr);  //O(n) Since this is basically shuffling of elements in linear time
        for (int i=0;i<k;i++)
        {
            System.out.println( heap.getMinimum());
            heap.deleteMin();
        }

    }

    /*1.Create Max heap with k elements
    2.For k till compare Max element with arr[i]
    3. remove max element and insert from arr if arr[i]>heapmax*/
    public static void usingTwoHeaps(int[] arr,int k)
    {
        int[] auxarr=new int[k];
        for (int i=0;i<k;i++)
        {
            auxarr[i]=arr[i];
        }


        MaxHeap maxHeap=new MaxHeap(k);
        maxHeap.buildHeap(auxarr);

        for (int i=k;i<arr.length;i++)
        {
            if (arr[i] <maxHeap.getMaximum())
            {
                maxHeap.deleteMaximum();
                maxHeap.insert(arr[i]);
            }
        }

        maxHeap.printHeap();


    }







}
