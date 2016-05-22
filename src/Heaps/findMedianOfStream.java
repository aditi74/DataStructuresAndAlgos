package Heaps;

/**
 * Created by 61310444 on 5/22/2016.
 * Trick
 * Create Max and Min Heap
 * Max heap will contain number less than the median **
 * 2. in case of odd numbers , on heap can have 1 element greater than the other
 * but if there is a difference more than that , balance the heaps
 * remove from greater heap and put it in other
 *
 */
public class findMedianOfStream {
    public static void main(String[] args) {
       MinHeap minHeap =new MinHeap(100);
       MaxHeap maxHeap=new MaxHeap(100);

       int[] arr={12,7,8,11};
       createMinAndMaxHeap(minHeap,maxHeap,arr);

    }


    public static void createMinAndMaxHeap(MinHeap minHeap,MaxHeap maxHeap,int[] arr)
    {
        maxHeap.insert(arr[0]);


        for(int i=1;i<arr.length;i++)
        {
            int median=getMedian(maxHeap,minHeap);
            System.out.println(median);
            if (arr[i]<median) maxHeap.insert(arr[i]);
            else minHeap.insert(arr[i]);
            if (maxHeap.getHeapSize()>minHeap.getHeapSize()+1 ||minHeap.getHeapSize()>maxHeap.getHeapSize()+1){
                if(maxHeap.getHeapSize()>minHeap.getHeapSize()+1)
                {
                    minHeap.insert(maxHeap.getMaximum());
                    maxHeap.deleteMaximum();
                }
                else {
                    maxHeap.insert(minHeap.getMinimum());
                    minHeap.deleteMin();
                }

            }
        }
        System.out.println(getMedian(maxHeap,minHeap));
    }

    public static int getMedian(MaxHeap maxHeap,MinHeap minHeap)
    {
        if (maxHeap.getHeapSize()==minHeap.getHeapSize())
            return((maxHeap.getMaximum()+minHeap.getMinimum())/2);

        else
            if (maxHeap.getHeapSize()>minHeap.getHeapSize()) return maxHeap.getMaximum();
        else
            return  minHeap.getMinimum();
    }

}
